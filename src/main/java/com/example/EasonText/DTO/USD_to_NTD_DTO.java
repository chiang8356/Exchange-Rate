package com.example.EasonText.DTO;

import java.util.Date;

public class USD_to_NTD_DTO {
    private Long id;
    private Date date;
    private Float usd_to_ntd;
    
    public USD_to_NTD_DTO(Long id, Date date, Float usd_to_ntd) {
        this.id = id;
        this.date = date;
        this.usd_to_ntd = usd_to_ntd;
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

	public Float getUsd_to_ntd() {
		return usd_to_ntd;
	}

	public void setUsd_to_ntd(Float usd_to_ntd) {
		this.usd_to_ntd = usd_to_ntd;
	}
    

    
}

