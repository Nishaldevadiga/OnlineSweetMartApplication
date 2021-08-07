package com.cg.osm.entity;

import java.time.LocalDate;
import java.util.List;

public class OrderBill {
	
	private Integer orderBillId;
	private LocalDate createdDate;
	private float totalCost;
	private List<SweetOrder> listSweetOrder;
	public Integer getOrderBillId() {
		return orderBillId;
	}
	public void setOrderBillId(Integer orderBillId) {
		this.orderBillId = orderBillId;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public List<SweetOrder> getListSweetOrder() {
		return listSweetOrder;
	}
	public void setListSweetOrder(List<SweetOrder> listSweetOrder) {
		this.listSweetOrder = listSweetOrder;
	}
	
	
	
}
