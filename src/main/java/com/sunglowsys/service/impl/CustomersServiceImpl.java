package com.sunglowsys.service.impl;

import com.sunglowsys.domain.Customers;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.service.CustomersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomersServiceImpl implements CustomersService {

    private final CustomerRepository customerRepository;

    public CustomersServiceImpl(CustomerRepository customerRepository){
        this.customerRepository =  customerRepository;
    }

    @Override
    public Customers save(Customers customers) {
        return customerRepository.save(customers);
    }

    @Override
    public Customers update(Customers customers) {
        return customerRepository.save(customers);
    }

    @Override
    public Optional<Customers> findOne(Long id) {
        return customerRepository.findById(id);

    }

    @Override
    public List<Customers> findAll(Long id) {
        return customerRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
