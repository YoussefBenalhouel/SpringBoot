package com.example.etudecas.serviceImp;

import com.example.etudecas.entitties.Student;
import com.example.etudecas.repository.StudentRepo;
import com.example.etudecas.services.StudentService;
import jakarta.annotation.Resource;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Resource
    private StudentRepo studentRepo;

    @Override
    public List<Student> findall() {
        return this.studentRepo.findAll();
    }

    @Override
    public Student findById(Long id) {
        Optional<Student> student=studentRepo.findById(id);
        if(student.isPresent()){
        return student.get();
        }else {
            throw new EntityNotFoundException("Student not found with it ");
        }
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);

    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent=findById(id);
        existingStudent.setNameStudent(student.getNameStudent());
        existingStudent.setLastNameStudent(student.getLastNameStudent());
        existingStudent.setCin(student.getCin());
        existingStudent.setBirthDate(student.getBirthDate());
        existingStudent.setSchool(student.getSchool());
        existingStudent.setReservations(student.getReservations());




        return this.studentRepo.save(existingStudent);

    }
}
