package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class AdvisorDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String[] advisorProp =  new String[3];
        delegateExecution.setVariable("advisorProposal", advisorProp);
        boolean isAdvisor= true;
        delegateExecution.setVariable("isAdvisor", isAdvisor);

    }
}
