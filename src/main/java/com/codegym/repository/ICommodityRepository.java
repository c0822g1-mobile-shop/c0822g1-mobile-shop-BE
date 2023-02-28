package com.codegym.repository;

import com.codegym.model.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommodityRepository extends JpaRepository<Commodity,Integer> {
}
