package com.ksi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "javassistProxyFactory", "handler" })
public class Book {
	private Integer pkBookId;

	private String name;

	private String isbn;

	public Integer getPkBookId() {
		return pkBookId;
	}

	public void setPkBookId(Integer pkBookId) {
		this.pkBookId = pkBookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn == null ? null : isbn.trim();
	}

	
	
	
	
	// === 自行新增的部分 ===
	private List<Author> authors;

	@JsonIgnore
	public List<Author> getAuthors() {
		return authors;
	}

	@JsonGetter(value = "authors")
	public List<Author> loadDetail() {
		return authors;
	}
	
	/*public List<Author> getAuthors() {
		return authors;
	}*/

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}