package com.example.lode.modules.patient.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "PACIENTE")
@Data
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotBlank(message = "O campo nome é obrigatório")
    String name;

    @NotBlank(message = "O campo cpf é obrigatório")
    @CPF(message = "cpf inválido")
    String cpf;

    @NotNull(message = "O campo nascimento é obrigatório")
    LocalDate DateOfBirth;

    @CreationTimestamp
    LocalDateTime createdAt;
}
