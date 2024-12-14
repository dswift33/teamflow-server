package com.david_swift.teamflow_server.model;

import com.david_swift.teamflow_server.model.enums.LeaveStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "leaves")
@Data
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private LeaveStatus status;

    private String reason;

    private LocalDateTime createdAt;
}
