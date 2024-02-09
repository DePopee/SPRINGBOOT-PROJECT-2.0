package com.example.demo.student;
import java.time.LocalDate;
import java.time.Period;


public class StudentResponse {
    private String name;
    private String email;
    private LocalDate dob;
    private String studentGroup;
    private String subGroup;
    private Integer age;

    public StudentResponse() {
    }

    public StudentResponse(Student student) {
        this.name = student.getName();
        this.email = student.getEmail();
        this.dob = student.getDob();
        this.studentGroup = student.getStudentGroup();
        this.subGroup = student.getSubGroup();
        this.age = calculateAge(student.getDob());
    }

    private Integer calculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }


    // Getters and setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

