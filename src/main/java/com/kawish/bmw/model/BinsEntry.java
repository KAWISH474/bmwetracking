package com.kawish.bmw.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema="bmw",name="bins_entry")
public class BinsEntry {

	@Id
	@SequenceGenerator(name = "seq_100000", sequenceName = "seq_100000", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_100000")
	private Long id;
	
	private Integer hospital_id;
	private Integer department_id;
	private Integer section_id;
	
	private String barcode_no;
	private String bin_color;
	private String bin_code;
	private Double bin_weight;
	
	private Date pickup_date;
	private Date doe;
	
	private Double sharp_weight;
	private Double galss_weight;
	
	private String entry_flag;
	private Integer uid;
	
	
}
