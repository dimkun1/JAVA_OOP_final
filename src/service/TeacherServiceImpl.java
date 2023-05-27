package service;

import data.Teacher;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(Teacher entity) {
        WriterToTxt.write(entity);
    }

    @Override
    public Teacher read(Teacher entity) {
        ReaderFromTxt.read(entity);
        return entity;
    }

    @Override
    public Teacher saveUser(Teacher entity) {
        return teacherRepository.save(entity);
    }

    @Override
    public Teacher findUserById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findUserByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }

    @Override
    public Teacher findUserByAge(int age) {
        return teacherRepository.findByAge(age);
    }

    @Override
    public boolean removeUserByFio(String fio) {
        return true;
    }

    @Override
    public void removeUser(Teacher user) {
    }

    @Override
    public void removeUserByDiscipline(String discipline) {
    }
}