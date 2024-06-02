package com.hospital.dischargePatient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DischargePatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DischargePatientApplication.class, args);
	}

}
