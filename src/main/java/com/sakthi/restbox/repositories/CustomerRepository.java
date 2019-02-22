package com.sakthi.restbox.repositories;

import com.sakthi.restbox.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  Optional<Customer> findById(Long id);
}
