package com.example.lode.modules.doctor.useCases;

import com.example.lode.modules.doctor.dtos.DoctorDTO;
import com.example.lode.modules.doctor.entities.DoctorEntity;
import com.example.lode.modules.doctor.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorUseCase {

    private DoctorEntity doctorEntity;
    @Autowired
    private DoctorRepository doctorRepository;

    public void create(DoctorDTO doctorDTO){
        try {


            doctorEntity.builder()
                            .name(doctorDTO.getName())
                                    .state(doctorDTO.getState())
                                            .MedicalBoard(doctorDTO.getMedicalBoard()).build();

            doctorRepository.save(doctorEntity);
        }catch (RuntimeException ex){
            throw new RuntimeException("Erro ao salvar medico no banco de dados");
        }
    }
}
