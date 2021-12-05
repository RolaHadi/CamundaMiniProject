package com.example.workflow.delegates;

import com.example.workflow.models.FormModel;
import com.example.workflow.repository.CamundaRepository;
import com.example.workflow.service.CamundaService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MoodlePublishing")
public class MoodlePublishingDelegate implements JavaDelegate {

    @Autowired
    CamundaService camundaService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        if ((boolean) delegateExecution.getVariable("advisor")) {
            System.out.println("Advisor published the project " + (String) delegateExecution.getVariable("FormField_Title"));
        } else {
            System.out.println("Student published the project " + (String) delegateExecution.getVariable("FormField_Title"));
        }
        FormModel project = new FormModel((String) delegateExecution.getVariable("FormField_Title"),
                (String) delegateExecution.getVariable("FormField_Description"),
                (String) delegateExecution.getVariable("FormField_AdvisorName"),
                (long) delegateExecution.getVariable("FormField_NbrStudents"));

        camundaService.saveProject(project);
    }
}
