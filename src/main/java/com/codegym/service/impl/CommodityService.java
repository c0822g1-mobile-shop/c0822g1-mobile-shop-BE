package com.codegym.service.impl;

import com.codegym.dto.CommodityDto;
import com.codegym.model.commodity.Commodity;
import com.codegym.repository.ICommodityRepository;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    private ICommodityRepository commodityRepository;






    @Override
    public Optional<Commodity> findById(int id) {
        return commodityRepository.findById(id);
    }

    public List<Commodity> getList() {
        return commodityRepository.getList();
    }

    @Override
    public Commodity findByQRCode(String QRCode) {
        return commodityRepository.findByQRCode(QRCode);
    }

    @Override
    public Map<String, String> checkCreate(CommodityDto commodityDto) {
        Map<String, String> check = new HashMap<>();
        for (int i = 0; i < commodityRepository.getList().size(); i++) {
            if (commodityRepository.getList().get(i).getName().equals(commodityDto.getName())) {
                check.put("errorName", "Tên hàng đã tồn tại");
            }
            if (commodityRepository.getList().get(i).getCodeQr().equals(commodityDto.getCodeQr())) {
                check.put("errorCode", "Mã QR đã tồn tại");
            }
        }
        return check;
    }

    @Override
    public Map<String, String> checkUpdate(CommodityDto commodityDto) {
        Map<String, String> check = new HashMap<>();
        Commodity commodity = findCommodity(commodityDto.getId());
        for (int i = 0; i < commodityRepository.getList().size(); i++) {
            if (!commodity.getName().equals(commodityDto.getName()) && commodityRepository.getList().get(i).getName().equals(commodityDto.getName())) {
                check.put("errorName", "Tên hàng đã tồn tại");
            }
            if (!commodity.getCodeQr().equals(commodityDto.getCodeQr()) && commodityRepository.getList().get(i).getCodeQr().equals(commodityDto.getCodeQr())) {
                check.put("errorCode", "Mã QR đã tồn tại");
            }
        }
        return check;
    }




    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @Override
    public Page<Commodity> findAll(Pageable pageable) {
        return commodityRepository.showListCommodity(pageable);
    }

    public Page<Commodity> searchByQuantity(int quantity, Pageable pageable) {
        return commodityRepository.searchByQuantity(quantity, pageable);
    }

    @Override
    public Page<Commodity> searchByPrice(double price, Pageable pageable) {
        return commodityRepository.searchByPrice(price, pageable);
    }

    @Override
    public Page<Commodity> searchByName(String name, Pageable pageable) {
        return commodityRepository.searchByName(name, pageable);
    }

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: delete commodity
     *
     * @param id
     * @Return HttpStatus.OK if result is not error
     */
    @Override
    public void delete(Integer id) {
        commodityRepository.deleteCommodity(id);
    }


    @Override
    public Page<Commodity> getAllCommodity(Pageable pageable, String name) {
        return commodityRepository.getAllCommodity(pageable, name);
    }

    @Override
    public Page<Commodity> getAllCommodityNoParam(Pageable pageable) {
        return commodityRepository.getAllCommodityNoParam(pageable);
    }

    @Override
    public Optional<Commodity> findCommodityById(Integer id) {
        return Optional.empty();
    }


    @Override
    public Page<Commodity> getCommodityByQuantity(Pageable pageable) {
        return commodityRepository.getCommodityByQuantity(pageable,20);
    }

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: create commodity
     * @param: commodity
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */

    @Override
    public void addCommodity(Commodity commodity) {
        commodityRepository.addCommodity(commodity);
    }

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: find commodity by id
     *
     * @param id
     * @return HttpStatus.OK if id is found
     */
    @Override
    public Commodity findCommodity(Integer id) {
        return commodityRepository.findCommodity(id);
    }

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: edit commodity by iduser
     * @param commodity
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */
    @Override
    public void editCommodity(Commodity commodity) {
        commodityRepository.editCommodity(commodity);
    }



}



