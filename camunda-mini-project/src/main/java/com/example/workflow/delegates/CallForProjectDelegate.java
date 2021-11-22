package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CallForProjectDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean isAdvisor= Math.random() < 0.5;
        delegateExecution.setVariable("advisor",isAdvisor);
    }
}
