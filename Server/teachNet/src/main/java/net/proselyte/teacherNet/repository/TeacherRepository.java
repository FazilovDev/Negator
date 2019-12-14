package net.proselyte.teacherNet.repository;

import net.proselyte.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Teacher, Long> {
}