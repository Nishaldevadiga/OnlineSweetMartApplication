package com.cg.osm.entity;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class SweetOrder {

	private Integer sweetOrderId;
	private User user;
	private List<SweetItem> listItems;
	private LocalDate createdDate;
	private Map<Product, Long> groupedProducts;
	public Integer getSweetOrderId() {
		return sweetOrderId;
	}
	public void setSweetOrderId(Integer sweetOrderId) {
		this.sweetOrderId = sweetOrderId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<SweetItem> getListItems() {
		return listItems;
	}
	public void setListItems(List<SweetItem> listItems) {
		this.listItems = listItems;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Map<Product, Long> getGroupedProducts() {
		return groupedProducts;
	}
	public void setGroupedProducts(Map<Product, Long> groupedProducts) {
		this.groupedProducts = groupedProducts;
	}
	
	
}
