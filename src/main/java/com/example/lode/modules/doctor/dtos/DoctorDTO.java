package com.example.lode.modules.doctor.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DoctorDTO {
    @NotBlank(message = "o campo nome é obrigatório")
    String name;
    @NotBlank(message = "o campo credencial é obrigatório")
    String MedicalBoard;
    @NotBlank(message = "o campo estado é obrigatório")
    String state;
}
