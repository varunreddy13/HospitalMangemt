package com.hospital.dischargePatient.handlers;

import com.hospital.dischargePatient.event.PatienetDischareEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HouseKeepingServiceHandler {

    @EventListener
    @Async
    public void cleanAndAssign(PatienetDischareEvent event){
        System.out.println("HouseKeeping Service :" + event.getPatientId() +" : " +Thread.currentThread().getName());
    }
}
