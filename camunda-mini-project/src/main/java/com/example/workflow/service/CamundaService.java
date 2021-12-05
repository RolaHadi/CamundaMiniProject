package com.example.workflow.service;

import com.example.workflow.models.FormModel;
import com.example.workflow.repository.CamundaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamundaService {
    @Autowired
    CamundaRepository camundaRepository;

    public void saveProject(FormModel project){
        camundaRepository.save(project);
    }
}
