package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class JobSeeker implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NonNull
	@Column(length = 50)
	private String jsName;
	@NonNull
	@Column(length = 50)
	private String address;
	@Lob
	@NonNull
	private byte[] photo;
	@Lob
	@NonNull
	private char[] resume;
	@NonNull
	private Boolean indian;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJsName() {
		return jsName;
	}
	public void setJsName(String jsName) {
		this.jsName = jsName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public char[] getResume() {
		return resume;
	}
	public void setResume(char[] resume) {
		this.resume = resume;
	}
	public Boolean getIndian() {
		return indian;
	}
	public void setIndian(Boolean indian) {
		this.indian = indian;
	}

}
