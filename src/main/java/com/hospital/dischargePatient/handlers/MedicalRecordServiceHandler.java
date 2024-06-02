package com.hospital.dischargePatient.handlers;

import com.hospital.dischargePatient.event.PatienetDischareEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordServiceHandler {

    @EventListener
    public void updatePatientRecord(PatienetDischareEvent event){
        System.out.println("updatating the Patient Records" + event.getPatientId() + " : " +Thread.currentThread().getName());
    }
}
