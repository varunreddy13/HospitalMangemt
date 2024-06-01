package com.hospital.dischargePatient.handlers;

import com.hospital.dischargePatient.event.PatienetDischareEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BillingServieHandler {

    @EventListener
    public void processBill(PatienetDischareEvent event){
        System.out.println("the billing is in proccessing" + event.getPatientId());
    }
}
