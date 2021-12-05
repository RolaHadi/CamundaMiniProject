package com.example.workflow.repository;

import com.example.workflow.models.FormModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamundaRepository extends JpaRepository<FormModel,Long> {
}
