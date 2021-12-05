package com.example.workflow.delegates;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Random;

@Component
public class CallForProjectDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random random = new Random();
        delegateExecution.setVariable("advisor",random.nextBoolean());
        System.out.println("Calling For Projects");
    }
}
