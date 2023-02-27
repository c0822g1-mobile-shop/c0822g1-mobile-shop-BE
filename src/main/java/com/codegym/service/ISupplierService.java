package com.codegym.service;

import com.codegym.dto.SupplierDto;
import com.codegym.model.supplier.Supplier;

import java.util.List;
import java.util.Map;

public interface ISupplierService {

    void addSupplier(String code, String name, String address, String phoneNumber, String email);

    Supplier findSupplier(Integer id);

    void updateSupplier(String name, String address, String phoneNumber, String email, Integer id);

    public Map<String, String> check(SupplierDto supplierDto);
}
