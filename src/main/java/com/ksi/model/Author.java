package com.ksi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "handler" })
public class Author {
	private Integer pkAuthorId;

	private String fullname;

	private String mobileno;

	private Integer fkBookId;

	public Integer getPkAuthorId() {
		return pkAuthorId;
	}

	public void setPkAuthorId(Integer pkAuthorId) {
		this.pkAuthorId = pkAuthorId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname == null ? null : fullname.trim();
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno == null ? null : mobileno.trim();
	}

	public Integer getFkBookId() {
		return fkBookId;
	}

	public void setFkBookId(Integer fkBookId) {
		this.fkBookId = fkBookId;
	}
}