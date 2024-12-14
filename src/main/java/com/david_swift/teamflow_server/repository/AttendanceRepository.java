package com.david_swift.teamflow_server.repository;
import com.david_swift.teamflow_server.model.Attendance;
import com.david_swift.teamflow_server.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {}
