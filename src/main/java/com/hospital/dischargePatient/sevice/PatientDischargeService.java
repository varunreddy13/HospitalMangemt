package com.hospital.dischargePatient.sevice;

import com.hospital.dischargePatient.event.PatienetDischareEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class PatientDischargeService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;
    public String dischargePatient(String patientId, String patientName) {

        //publish an event. To publish an event we need to create one

        eventPublisher.publishEvent(new PatienetDischareEvent(this,patientId,patientName));



        return "na";
    }
}
