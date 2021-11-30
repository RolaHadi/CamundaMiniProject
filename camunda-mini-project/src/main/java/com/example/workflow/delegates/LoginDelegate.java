package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class LoginDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean found = false;
        HashMap<String, String> loginForm = (HashMap<String, String>) delegateExecution.getVariable("loginForm");
        System.out.println(loginForm);
        boolean isAdvisor= Math.random() < 0.5;
        delegateExecution.setVariable("advisor",isAdvisor);
        System.out.println("Logging in ...");
    }
}
