package com.example.lode.modules.service.entities;

import com.example.lode.modules.patient.entities.PatientEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name="CONSULTA")
@Data
public class ConsultationEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "patientId",insertable = false,updatable = false)
    PatientEntity patient;
    @ManyToOne
    @JoinColumn(name = "scheduleEntity",insertable = false,updatable = false)
    ScheduleEntity schedule;

    @Column(nullable = false)
    Integer patientId;
    @Column(nullable = false)
    Integer scheduleId;

    LocalDateTime dateConsultation;
    @CreationTimestamp
    LocalDateTime createdAt;


}
