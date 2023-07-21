package com.fabbluca.springCourse.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Gigio",
                        "Rossi",
                        LocalDate.now(),
                        "gigiorossi@gmail.com",
                        41
                ),
                new Student(
                        "Mirko",
                        "Verdi",
                        LocalDate.now(),
                        "mirkoverdi@gmail.com",
                        25
                )
        );
    }
}
