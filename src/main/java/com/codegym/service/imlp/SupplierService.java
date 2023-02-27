package com.codegym.service.imlp;

import com.codegym.model.supplier.Supplier;
import com.codegym.repository.ISupplierRepository;
import com.codegym.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
