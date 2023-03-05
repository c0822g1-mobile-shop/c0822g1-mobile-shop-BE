package com.codegym.repository;

import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param name
     * @param address
     * @param pageable
     */
    @Query(value = "select `user`.*" +
            " from `user`\n" +
            "         join `user_roles` on `user`.id = `user_roles`.user_id\n" +
            "         join `role` on `role`.id = `user_roles`.roles_id\n" +
            "where role.id = 1\n" +
            "  and user.name like concat('%', :name, '%')\n" +
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
            " from `user`\n" +
            "         join `user_roles` on `user`.id = `user_roles`.user_id\n" +
            "         join `role` on `role`.id = `user_roles`.roles_id\n" +
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
            countQuery = "select * from user join user_roles on user.id = user_roles.user_id join role on role.id = user_roles.roles_id where role.id = 1 and user.id = :id"
            , nativeQuery = true)
    Optional<User> findCustomerById(@Param("id") Integer id);

    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get customer list & search
     */

    @Query(value = "select * from `user` where gender like %:genderSearch% and age like %:ageSearch%", countQuery = "select * from `user` where gender like %:genderSearch% and age like %:ageSearch%", nativeQuery = true)
    Page<User> findAll(@Param("genderSearch") String genderSearch, @Param("ageSearch") String age, Pageable pageable);

    @Query(value = "select * from `user` where gender = :genderSearch and age like %:ageSearch%", countQuery = "select * from `user` where gender like %:genderSearch% and age like %:ageSearch%", nativeQuery = true)
    Page<User> findAllByGender(@Param("genderSearch") boolean genderSearch, @Param("ageSearch") String age, Pageable pageable);

    @Query(value = "select count(u.id) from `user` u join `bill` b on u.id = b.user_id " +
            "    join `bill_history` bh on b.id = bh.bill_id where u.id =:id group by u.id", nativeQuery = true)
    Integer selectQuantity(@Param("id") int id);

    @Query(value = "select u.* from `user` u join `bill` b on u.id = b.user_id join `bill_history` bh on b.id = bh.bill_id group by u.id", nativeQuery = true)
    List<User> getUserHasBuy();
}
