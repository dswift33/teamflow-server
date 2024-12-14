package com.david_swift.teamflow_server.model;

import com.david_swift.teamflow_server.model.enums.AttendanceStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "attendance")
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;
}
