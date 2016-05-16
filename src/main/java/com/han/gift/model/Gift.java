package com.han.gift.model;

import java.time.LocalDate;

public class Gift {
	private int categoryId;
	private String name;
	private LocalDate uploadDate;
	private boolean favorite;
	private String username;
	
	public Gift(int id, String name, LocalDate uploadDate, boolean isFavorite, String username) {
		super();
		this.categoryId = id;
		this.name = name;
		this.uploadDate = uploadDate;
		this.favorite = isFavorite;
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public LocalDate getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(LocalDate uploadDate) {
		this.uploadDate = uploadDate;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean isFavorite) {
		this.favorite = isFavorite;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
