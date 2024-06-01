package com.hospital.dischargePatient.controller;


import com.hospital.dischargePatient.dto.PatientDischareReq;
import com.hospital.dischargePatient.sevice.PatientDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discharge/api")
public class DischargeProcessController {

    @Autowired
    PatientDischargeService patientDischargeService;

    @PostMapping("/process")
    public String discharePatient(@RequestBody PatientDischareReq request){
        return patientDischargeService.dischargePatient(request.getPatientId(),request.getPatientName());
    }

    @GetMapping("/view")
    public String hello(){
        return "Hello";
    }
}
