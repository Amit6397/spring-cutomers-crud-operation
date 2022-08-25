package com.sunglowsys.resource;

import com.sunglowsys.domain.Customers;
import com.sunglowsys.service.CustomersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomersResource {

    private final CustomersService customersService;

    public CustomersResource(CustomersService customersService){
        this.customersService = customersService;
    }
    @PostMapping("/customers")
    public ResponseEntity<Customers> createCustomers(@RequestBody Customers customers){
        Customers result = customersService.save(customers);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);

    }

    @PutMapping("/customers")
    public ResponseEntity<Customers> updateCustomers(@RequestBody Customers customers){
        Customers result = customersService.update(customers);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customers> getCustomers(@PathVariable("id") Long id){
        Customers result = customersService.findOne(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/customers")
    public ResponseEntity<List<Customers>> getAllCustomers(Long id){
        List<Customers> customers = customersService.findAll(id);
        return ResponseEntity.status(HttpStatus.OK).body(customers);

    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customers> delete(@PathVariable("id") Long id){
        customersService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}