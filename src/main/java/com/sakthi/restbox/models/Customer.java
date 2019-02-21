package com.sakthi.restbox.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
@Data
@AllArgsConstructor
public class Customer {
    @Id
    private String id;

    private String firstName;
    private String lastName;

}
