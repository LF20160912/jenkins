package com.mike.jenkins.jenkins_svn_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsSvnGitApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSvnGitApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinsSvnGitApplication.class);
    }
}
