package com.example.EasonText.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "exchangerates")
public class EasonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private float usd_to_ntd;//美金換台幣
    private float rmb_to_ntd;//人民幣換台幣
    private float eur_to_usd;//歐元換美金
    private float usd_to_jpy;//美金換日幣
    private float gbp_to_usd;//英鎊換美金
    private float aud_to_usd;//澳幣換美金
    private float usd_to_hkd;//美金換港幣
    private float usd_to_rmb;//美金換人民幣
    private float usd_to_zar;//美金換南非蘭特
    private float nzd_to_usd;//紐西蘭幣換美金
    
    public EasonModel() {
    	
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
	public float getUsd_to_ntd() {
		return usd_to_ntd;
	}
	public void setUsd_to_ntd(float usd_to_ntd) {
		this.usd_to_ntd = usd_to_ntd;
	}
	public float getRmb_to_ntd() {
		return rmb_to_ntd;
	}
	public void setRmb_to_ntd(float rmb_to_ntd) {
		this.rmb_to_ntd = rmb_to_ntd;
	}
	public float getEur_to_usd() {
		return eur_to_usd;
	}
	public void setEur_to_usd(float eur_to_usd) {
		this.eur_to_usd = eur_to_usd;
	}
	public float getUsd_to_jpy() {
		return usd_to_jpy;
	}
	public void setUsd_to_jpy(float usd_to_jpy) {
		this.usd_to_jpy = usd_to_jpy;
	}
	public float getGbp_to_usd() {
		return gbp_to_usd;
	}
	public void setGbp_to_usd(float gbp_to_usd) {
		this.gbp_to_usd = gbp_to_usd;
	}
	public float getAud_to_usd() {
		return aud_to_usd;
	}
	public void setAud_to_usd(float aud_to_usd) {
		this.aud_to_usd = aud_to_usd;
	}
	public float getUsd_to_hkd() {
		return usd_to_hkd;
	}
	public void setUsd_to_hkd(float usd_to_hkd) {
		this.usd_to_hkd = usd_to_hkd;
	}
	public float getUsd_to_rmb() {
		return usd_to_rmb;
	}
	public void setUsd_to_rmb(float usd_to_rmb) {
		this.usd_to_rmb = usd_to_rmb;
	}
	public float getUsd_to_zar() {
		return usd_to_zar;
	}
	public void setUsd_to_zar(float usd_to_zar) {
		this.usd_to_zar = usd_to_zar;
	}
	public float getNzd_to_usd() {
		return nzd_to_usd;
	}
	public void setNzd_to_usd(float nzd_to_usd) {
		this.nzd_to_usd = nzd_to_usd;
	}
	
	
	
	 public EasonModel(Long id, Date date, Float usd_to_ntd) {
	        this.id = id;
	        this.date = date;
	        this.usd_to_ntd = usd_to_ntd;
	    }
    
}

