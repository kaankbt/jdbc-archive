package com.example.demojdbcproject;

import com.example.demojdbcproject.dao.DAO;
import com.example.demojdbcproject.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoJdbcProjectApplication {

    private static DAO<Course> dao;

    public DemoJdbcProjectApplication(DAO<Course> dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        System.out.println("\nOne Course -------------------------------------\n");
        Optional<Course> course = dao.get(1);
        System.out.println(course.get());

        System.out.println("\nCreate Course -------------------------------------\n");
        Course springVue = new Course("Spring Boot + Vue","New Course","http://www.danvega.dev/courses");
        dao.create(springVue);

        springVue.setDescription("Learn to build Vue apps that talk to Spring");
        dao.update(springVue,6);

        dao.delete(4);

        System.out.println("\nAll Courses -------------------------------------\n");
        List<Course> courses = dao.list();
        courses.forEach(System.out::println);
    }


}
