package com.viome.interview.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "city")
public class City implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int city_id;
	private String city;
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int country_id;
	private Date last_update;
	
	
	
	

}
