package com.codegym.service.impl;

import com.codegym.dto.SupplierDto;
import com.codegym.model.supplier.Supplier;
import com.codegym.repository.ISupplierRepository;
import com.codegym.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SupplierService implements ISupplierService {

    /**
     * Create by: DiemTTT,
     * Date created: 27/02/2023,
     * Function: show list supplier + delete supplier by id
     *
     * @param:search
     * @param:pageable
     * @return HttpStatus.NOT_FOUND if result is error or HttpStatus.OK if result is not error
     */

    @Autowired
    private ISupplierRepository supplierRepository;

    @Override
    public Page<Supplier> showList(String search, Pageable pageable) {
        return supplierRepository.showList(search, pageable);
    }

    @Override
    public void deleteSupplier(Integer id) {
        supplierRepository.deleteSupplier(id);
    }


    @Override
    public void addSupplier(String code, String name, String address, String phoneNumber, String email) {

        supplierRepository.addSupplier(code, name, address, phoneNumber, email);
    }

    @Override
    public Supplier findSupplier(Integer id) {
        return supplierRepository.findSupplier(id);
    }

    @Override
    public void updateSupplier(String name, String address, String phoneNumber, String email, Integer id) {
        supplierRepository.updateSupplier(name, address, phoneNumber, email, id);
    }

    @Override
    public Map<String, String> checkCreate(SupplierDto supplierDto) {
        Map<String, String> checkMap = new HashMap<>();

        for (int i = 0; i < supplierRepository.supplierList().size(); i++) {
            if (supplierRepository.supplierList().get(i).getCode().equals(supplierDto.getCode())) {
                checkMap.put("errorCode", "Code đã tồn tại trong hệ thống");
            }
            if (supplierRepository.supplierList().get(i).getPhoneNumber().equals(supplierDto.getPhoneNumber())) {
                checkMap.put("errorPhone", "Số điện thoại đã tồn tại trong hệ thống");
            }
            if (supplierRepository.supplierList().get(i).getEmail().equals(supplierDto.getEmail())) {
                checkMap.put("errorEmail", "Email đã tồn tại trong hệ thống");
            }
        }
        return checkMap;
    }

    @Override
    public Map<String, String> checkUpdate(SupplierDto supplierDto) {
        Map<String, String> checkMap = new HashMap<>();

        Supplier supplier = findSupplier(supplierDto.getId());

        for (int i = 0; i < supplierRepository.supplierList().size(); i++) {
            if (!supplier.getPhoneNumber().equals(supplierDto.getPhoneNumber()) && supplierRepository.supplierList().get(i).getPhoneNumber().equals(supplierDto.getPhoneNumber())) {
                checkMap.put("errorPhone", "Số điện thoại đã tồn tại trong hệ thống");
            }
            if (!supplier.getEmail().equals(supplierDto.getEmail()) && supplierRepository.supplierList().get(i).getEmail().equals(supplierDto.getEmail())) {
                checkMap.put("errorEmail", "Email đã tồn tại trong hệ thống");
            }
        }
        return checkMap;
    }



    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier
     *
     * @param pageable
     * @return HttpStatus.OK
     */


    @Override
    public Page<Supplier> showSupplierList(String name, String address, String email, Pageable pageable) {
        return supplierRepository.showSupplierList(name,address,email,pageable);
    }

}

