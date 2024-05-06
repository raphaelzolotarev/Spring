package com.example.demo.service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final IStudentRepository studentRepository;
    @Autowired
    public StudentService(IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<StudentModel> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(StudentModel student){
        Optional<StudentModel> studentModelOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentModelOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }

        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId){
        boolean exists=studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("student id "+studentId+" does not exists");
        }
        studentRepository.deleteById(studentId);
    }

}
