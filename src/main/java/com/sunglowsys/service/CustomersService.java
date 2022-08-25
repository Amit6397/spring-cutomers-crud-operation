package com.sunglowsys.service;

import com.sunglowsys.domain.Customers;
import jdk.dynalink.Operation;

import java.util.List;
import java.util.Optional;

public interface CustomersService {

    Customers save(Customers customers);

    Customers update(Customers customers);

    Optional<Customers> findOne(Long id);

    List<Customers> findAll(Long id);

    void delete(Long id);
}
