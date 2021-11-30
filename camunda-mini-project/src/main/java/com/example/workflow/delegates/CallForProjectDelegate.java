package com.example.workflow.delegates;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CallForProjectDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("projectCalled",false);
        System.out.println("Calling For Projects");

    }
}
