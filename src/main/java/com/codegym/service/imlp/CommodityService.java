//package com.codegym.service.imlp;
//
//import com.codegym.model.commodity.Commodity;
//import com.codegym.repository.ICommodityRepository;
//import com.codegym.service.ICommodityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class CommodityService implements ICommodityService {
//    @Autowired
//    private ICommodityRepository commodityRepository;
//
//    /**
//     * Created by: CongBD,
//     * Date Created: 27/02/2023
//     * function: show commodity list
//     *
//     * @param pageable
//     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
//     */
//    @Override
//    public Page<Commodity> findAll(String search,Pageable pageable) {
//        return commodityRepository.showListCommodity(search,pageable);
//    }
//
//
//
//    /**
//     * Created by: CongBD,
//     * Date Created: 27/02/2023
//     * function: delete commodity
//     *
//     * @param id
//     * @Return HttpStatus.OK if result is not error
//     */
//    @Override
//    public void delete(Integer id) {
//        commodityRepository.deleteCommodity(id);
//    }
//
//    @Override
//    public Optional<Commodity> findById(int id) {
//        return commodityRepository.findById(id);
//    }
//}
