package com.hospital.dischargePatient.handlers;

import com.hospital.dischargePatient.event.PatienetDischareEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceHandler {
    @EventListener
    public void notifyPatient(PatienetDischareEvent event){
        System.out.println("Notification is being sent" + event.getPatientId() + " Patient Name "+ event.getPatientName() );
    }
}
