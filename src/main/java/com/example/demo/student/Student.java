package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    @Column(unique = true, nullable = false) // Ensure uniqueness for the name and disallow null values
    private String name;
    @Column(name = "email", unique = true, nullable = false)
    private String email;


    private LocalDate dob;

    @Column(name = "student_group", nullable = false)
    private String studentGroup;// Changed from 'group' to 'studentGroup'
    private String subGroup;


    @Transient
    private Integer age;

    public Student() {
    }

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   String studentGroup,
                   String subGroup) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.studentGroup = studentGroup;
        this.subGroup = subGroup;
    }

    public Student(String name,
                   String email,
                   LocalDate dob,
                   String studentGroup,
                   String subGroup) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.studentGroup = studentGroup;
        this.subGroup = subGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setStudentGroup(String studentGroup)  {
    this.studentGroup = studentGroup;
    }
    public String getSubGroup() {
        return subGroup;
    }
    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
