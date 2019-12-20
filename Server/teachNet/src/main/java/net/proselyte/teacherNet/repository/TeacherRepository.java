package net.proselyte.teacherNet.repository;

import net.proselyte.teacherNet.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}