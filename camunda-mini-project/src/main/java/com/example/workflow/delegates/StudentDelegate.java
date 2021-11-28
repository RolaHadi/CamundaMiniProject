package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class StudentDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String[] studentProp =  new String[3];
        delegateExecution.setVariable("studentProposal", studentProp);
        boolean isStudent= true;
        delegateExecution.setVariable("isStudent", isStudent);
        System.out.println("I am a Student");

    }
}
