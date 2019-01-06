package com.sakthi.repository;

import java.util.List;


import com.sakthi.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

//  @Query()
  Customer findByFirstName(String firstName);

  List<Customer> findByLastName(String lastName);
}
