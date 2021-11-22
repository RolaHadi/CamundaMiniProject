package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CommitteeApprovalDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean isApproved= Math.random() < 0.5;
        delegateExecution.setVariable("approved",isApproved);
    }
}
