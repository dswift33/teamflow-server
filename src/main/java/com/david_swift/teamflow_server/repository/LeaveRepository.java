package com.david_swift.teamflow_server.repository;
import com.david_swift.teamflow_server.model.Announcement;
import com.david_swift.teamflow_server.model.Employee;
import com.david_swift.teamflow_server.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {}
