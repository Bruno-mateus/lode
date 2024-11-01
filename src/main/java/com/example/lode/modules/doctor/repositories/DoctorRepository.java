package com.example.lode.modules.doctor.repositories;

import com.example.lode.modules.doctor.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Integer> {

}
