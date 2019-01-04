package com.sakthi.repository;

import java.util.List;

import com.sakthi.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepository extends MongoRepository<Customer, String> {

//  @Query()
  Customer findByFirstName(String firstName);

  List<Customer> findByLastName(String lastName);
}
