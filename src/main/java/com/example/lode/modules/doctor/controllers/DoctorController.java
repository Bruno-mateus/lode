package com.example.lode.modules.doctor.controllers;

import com.example.lode.modules.doctor.dtos.DoctorDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/doctor")
public class DoctorController {
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid DoctorDTO doctorDTO){
        try{
            return ResponseEntity.ok().body(doctorDTO);
        }catch(Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
