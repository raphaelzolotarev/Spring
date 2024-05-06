package com.example.demo.config;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.IStudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (IStudentRepository repository){

        return (args) -> {
            StudentModel mariam = new StudentModel(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            StudentModel alex = new StudentModel(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 15)
            );
            StudentModel jana = new StudentModel(
                    "Jana",
                    "jana@gmail.com",
                    LocalDate.of(1900, Month.MARCH, 10)
            );
            StudentModel rutger = new StudentModel(
                    "Rutger",
                    "rutger@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 3)
            );
            StudentModel maxime = new StudentModel(
                    "Maxime",
                    "maxime@gmail.com",
                    LocalDate.of(1980, Month.MAY, 5)
            );
            StudentModel hilal = new StudentModel(
                    "Hilal",
                    "hilal@gmail.com",
                    LocalDate.of(1985, Month.JUNE, 22)
            );
            StudentModel mausam = new StudentModel(
                    "Mausam",
                    "mausam@gmail.com",
                    LocalDate.of(1982, Month.JULY, 7)
            );
            StudentModel elmaz = new StudentModel(
                    "Elmaz",
                    "elmaz@gmail.com",
                    LocalDate.of(1970, Month.AUGUST, 12)
            );
            StudentModel nina = new StudentModel(
                    "Nina",
                    "nina@gmail.com",
                    LocalDate.of(1979, Month.SEPTEMBER, 29)
            );
            StudentModel jon = new StudentModel(
                    "Jon",
                    "jon@gmail.com",
                    LocalDate.of(1971, Month.OCTOBER, 30)
            );

            repository.saveAll(List.of(mariam, alex, jon, mausam, jana, maxime, nina, elmaz, rutger, hilal));
        };

    }
}
