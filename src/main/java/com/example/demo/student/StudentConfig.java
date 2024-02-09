package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Month.*;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    private final StudentRepository repository;

    public StudentConfig(StudentRepository repository) {
        this.repository = repository;
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    "Front-end"

            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 5),
                    "UI/UX"
            );

            Student irene = new Student(
                    "Irene",
                    "irene@gmail.com",
                    LocalDate.of(1996, JUNE, 23),
                    "Back-end"
            );

            repository.saveAll(
                    List.of(mariam, alex, irene)
            );
        };
    }
}
