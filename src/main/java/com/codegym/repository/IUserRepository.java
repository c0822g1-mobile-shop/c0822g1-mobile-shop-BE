package com.codegym.repository;

import com.codegym.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Transactional
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: get user by username
     *
     * @param:username
     **/
    @Query(value = "select * from user where username = :username", nativeQuery = true)
    Optional<User> findByUsername(@Param("username") String username);


    @Modifying
    @Query(value = "update user set name = :name,phone_number = :phone_number,email = :email," +
            " address = :address,age = :age,gender = :gender,date_of_birth = :date_of_birth,avatar = :avatar" +
            " where username = :username  ", nativeQuery = true)
    void updateUser(@Param("name") String name, @Param("phone_number") String phoneNumber, @Param("email") String email
            , @Param("address") String address, @Param("age") Integer age, @Param("gender") Boolean gender
            , @Param("date_of_birth") String dateOfBirth, @Param("avatar") String avatar, @Param("username") String username);

//   @Modifying
//    @Query(value = "update user set name = :name,phone_number = :phone_number,email = :email," +
//            " address = :address,age = :age,gender = :gender,date_of_birth = :date_of_birth,avatar = :avatar" +
//            " where username = :username  ",nativeQuery = true)
//    void updateUser(@Param("name") String name,@Param("phone_number") String phoneNumber,@Param("email") String email
//            ,@Param("address") String address,@Param("age") Integer age,@Param("gender") Boolean gender
//    ,@Param("date_of_birth") String dateOfBirth,@Param("avatar") String avatar,@Param("username") String username);

    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: change password
     *
     * @param:username,password
     **/
    @Modifying
@Query(value = "update user set password = :password where username = :username",nativeQuery = true)
    void changePassword(@Param("password") String password,@Param("username") String username);

    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: get all user
     *
     * @param:none
     **/
    @Query(value = "select * from user", nativeQuery = true)
    List<User> getAllUser();

    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: insert into table user to register account
     *
     * @param:name,username,password,email
     **/
    @Modifying
    @Query(value = "insert into user (name,username,email,password) values (:name,:username,:email,:password)", nativeQuery = true)
    void save(@Param("name") String name, @Param("username") String username, @Param("email") String email, @Param("password") String password);

    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: set role to user
     *
     * @param:user_id,role_id
     **/
    @Modifying
    @Query(value = "insert into user_roles (user_id,roles_id) values (:user,:role)", nativeQuery = true)
    void insertRole(@Param("user") int userID, @Param("role") int roleID);

    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: set role to user
     *
     * @param:none
     **/
    @Query(value = "select * from user join user_roles on user.id = user_roles.user_id join role r on user_roles.roles_id = r.id where r.name = 'ROLE_CUSTOMER'", nativeQuery = true)
    List<User> findAllCustomer();

    @Query(value = "select * from user join user_roles on user.id = user_roles.user_id join role r on user_roles.roles_id = r.id where r.name = 'ROLE_EMPLOYEE'", nativeQuery = true)
    List<User> findAllEmployee();

    @Query(value = "select * from user join user_roles on user.id = user_roles.user_id join role r on user_roles.roles_id = r.id where r.name = 'ROLE_ADMIN'", nativeQuery = true)
    List<User> findAllAdmin();

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param name
     * @param address
     * @param pageable
     * @Repository public interface IUserRepository extends JpaRepository<User, Integer> {
     */
    @Query(value = "select `user`.* " +
            " from `user` " +
            "         join `user_roles` on `user`.id = `user_roles`.user_id " +
            "         join `role` on `role`.id = `user_roles`.roles_id " +
            "where role.id = 1 " +
            "  and user.name like concat('%', :name, '%') " +
            "  and user.address like concat('%', :address, '%')"
            , nativeQuery = true)
    Page<User> findAllCustomer(Pageable pageable, @Param("name") String name, @Param("address") String address);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param pageable
     */
    @Query(value = "select `user`.*" +
            " from `user` " +
            "         join `user_roles` on `user`.id = `user_roles`.user_id " +
            "         join `role` on `role`.id = `user_roles`.roles_id " +
            "where role.id = 1"
            , nativeQuery = true)
    Page<User> findAllCustomerNoParam(Pageable pageable);


    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param id
     */
    @Query(value = "select * from user join user_roles on user.id = user_roles.user_id join role on role.id = user_roles.roles_id where role.id = 1 and user.id = :id",
            countQuery = "select * from user join user_roles on user.id = user_roles.user_id join role on role.id = user_roles.roles_id where role.id = 1 and user.id = :id", nativeQuery = true)
    Optional<User> findCustomerById(@Param("id") Integer id);


}

