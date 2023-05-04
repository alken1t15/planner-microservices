package ru.javabegin.micro.planner.githubconfigserverplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GithubConfigServerPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubConfigServerPlannerApplication.class, args);
    }

}
