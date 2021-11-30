package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CommitteeApprovalDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean isApproved= Math.random() < 0.5;
        delegateExecution.setVariable("approved",isApproved);
        if(isApproved){
            System.out.println("Project Approved");
        }else{
            System.out.println("Project Rejected");
        }
    }
}
