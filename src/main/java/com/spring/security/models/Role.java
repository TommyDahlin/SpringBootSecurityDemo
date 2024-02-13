package com.spring.security.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {
    // Body
    @Id
    private String id;
    private ERole name;

    // constructors
    public Role() {
    }
    public Role(ERole name) {
        this.name = name;
    }

    // Gets & Sets
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
