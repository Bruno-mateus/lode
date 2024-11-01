package com.example.lode.modules.service.entities;

import com.example.lode.modules.doctor.entities.DoctorEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity(name = "AGENDA")
@Data
public class ScheduleEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotBlank()
    List<String> dayOfWeek;
    @NotBlank()
    List<LocalTime> availableTimes;

    @ManyToOne
    @JoinColumn(name="doctorId",updatable = false,insertable = false)
    DoctorEntity doctor;
    @Column(nullable = false)
    Integer doctorId;
    @CreationTimestamp
    LocalDateTime createdAt;

}
