package com.codegym.service.imlp;

import com.codegym.dto.SupplierDto;
import com.codegym.model.supplier.Supplier;
import com.codegym.repository.ISupplierRepository;
import com.codegym.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    private ISupplierRepository supplierRepository;

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
}
