package com.example.education.studentmanagement.Service;

import com.example.education.studentmanagement.model.Student;
import com.example.education.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student)
    {
        Student student1=new Student();
        if(student!=null)
        {
            student1= studentRepository.save(student);
        }
        return student1;
    }
    public List<Student> getallStudent()
    {
        List<Student> studentlist =studentRepository.findAll();
        if(!studentlist.isEmpty())
        {
            return studentlist;
        }
        return null;
    }
}
