package com.asset.bean;

public class Asset {
private String asset_tag;
private String category;
private String model;
private String serialNo;
private int totalQuantity;
private int availableQuantity;
private String status;
public String getAsset_tag() {
	return asset_tag;
}
public void setAsset_tag(String asset_tag) {
	this.asset_tag = asset_tag;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getSerialNo() {
	return serialNo;
}
public void setSerialNo(String serialNo) {
	this.serialNo = serialNo;
}
public int getTotalQuantity() {
	return totalQuantity;
}
public void setTotalQuantity(int totalQuantity) {
	this.totalQuantity = totalQuantity;
}
public int getAvailableQuantity() {
	return availableQuantity;
}
public void setAvailableQuantity(int availableQuantity) {
	this.availableQuantity = availableQuantity;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
