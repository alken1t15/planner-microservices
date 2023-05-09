package ru.javabegin.micro.planner.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.javabegin.micro.planner"})
@EnableJpaRepositories("ru.javabegin.micro.planner.todo.repo")
@EntityScan("ru.javabegin.micro.planner.entity")
public class PlannerTodoApplication {


    public static void main(String[] args) {
        SpringApplication.run(PlannerTodoApplication.class, args);
    }

}
