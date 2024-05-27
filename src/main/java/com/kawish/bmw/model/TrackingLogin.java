package com.kawish.bmw.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema="bmw",name="tracking_login")
public class TrackingLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String username;
	private String user_id;
	private String password;
	private String role;
	
	private Integer hospital_id;
	private Integer entered_by;
	
	private Date doe;
}
