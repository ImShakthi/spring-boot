package com.sakthi.restbox.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
public class User {
    @Id
    private int id;
    private String name;
    private String age;
}
