package com.example.workflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FypController {

    @RequestMapping("/")
    public String callForProject() {
        return "callForProject.html";
    }

    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }

    @RequestMapping("/add_project")
    public String addProject() {
        return "addProject.html";
    }

}
