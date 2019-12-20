package net.proselyte.teacherNet.service;

import net.proselyte.teacherNet.model.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher getById(Long id);

    void save(Teacher teacher);

    void delete(Long id);

    List<Teacher> getAll();
}