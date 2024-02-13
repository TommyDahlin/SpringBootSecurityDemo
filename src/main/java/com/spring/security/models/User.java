package com.spring.security.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @NotBlank
    @Size(max = 50)
    private String username;
    @NotBlank
    @Email
    @Size(max = 50)
    @Indexed
    private String email;
    @NotBlank
    @Size(max = 123)
    private String password;

    // Role
    @DBRef
    private Set<Role> roles = new HashSet<>();
    // ["ROLE_USER", "ROLE_MODERATOR", ROLE ADMIN"]

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
