package com.example.lode.modules.doctor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "MEDICO")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotBlank(message = "O nome é obrigatorio")
    String name;
    @NotBlank(message = "O conselho é obrigatorio")
    String MedicalBoard;
    @NotBlank(message = "O estado é obrigatorio")
    String state;
    @CreationTimestamp
    LocalDateTime createdAt;
}
