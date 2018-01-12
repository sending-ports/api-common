package com.logistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistic.models.SystemInfo;

@SpringBootApplication
@Controller
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public ResponseEntity<SystemInfo> getInfo() {
    		SystemInfo system = new SystemInfo("api-common", "1.0.0", "Api about all information that is common for all squads");
    		return new ResponseEntity<SystemInfo>(system, HttpStatus.OK);
    }

}