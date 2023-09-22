package com.example.EasonText.DTO;

import java.util.Date;

public class RMB_to_NTD_DTO {
	private Long id ;
	private Date date ;
	private Float rmb_to_ntd ;
	
	 public RMB_to_NTD_DTO(Long id, Date date, Float rmb_to_ntd) {
	        this.id = id;
	        this.date = date;
	        this.rmb_to_ntd = rmb_to_ntd;
	    }

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getRmb_to_ntd() {
		return rmb_to_ntd;
	}
	public void setRmb_to_ntd(float rmb_to_ntd) {
		this.rmb_to_ntd = rmb_to_ntd;
	}
	
	
}
