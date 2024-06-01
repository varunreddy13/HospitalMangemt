package com.hospital.dischargePatient.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class PatienetDischareEvent extends ApplicationEvent {

    private String patientId;
    private String patientName;
    public PatienetDischareEvent(Object source,String patientId,String patientName) {
        super(source);
        this.patientId =patientId;
        this.patientName =patientName;
    }
}
