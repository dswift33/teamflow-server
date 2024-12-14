package com.david_swift.teamflow_server.model;

import com.david_swift.teamflow_server.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String email;
    private String contactNumber;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
