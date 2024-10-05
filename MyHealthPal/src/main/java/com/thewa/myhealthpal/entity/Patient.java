package com.thewa.myhealthpal.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String contactInfo;
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<MedicalHistory> medicalHistories;
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<Appointment> appointments;
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<Test> tests;
}