package com.homework.ruigou.po;

public class OrderDetails {
  private int orderId;
  private int merchantId;
  private int goodsId;
  private int goodsNum;
  private int orderDetailsId;
  private int goodsPrice;
  private String merchantName;
  private String goodsImg;
  private String goodsName;
  
  
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public int getGoodsPrice() {
	return goodsPrice;
}
public void setGoodsPrice(int goodsPrice) {
	this.goodsPrice = goodsPrice;
}
public String getMerchantName() {
	return merchantName;
}
public void setMerchantName(String merchantName) {
	this.merchantName = merchantName;
}
public String getGoodsImg() {
	return goodsImg;
}
public void setGoodsImg(String goodsImg) {
	this.goodsImg = goodsImg;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getMerchantId() {
	return merchantId;
}
public void setMerchantId(int merchantId) {
	this.merchantId = merchantId;
}
public int getGoodsId() {
	return goodsId;
}
public void setGoodsId(int goodsId) {
	this.goodsId = goodsId;
}
public int getGoodsNum() {
	return goodsNum;
}
public void setGoodsNum(int goodsNum) {
	this.goodsNum = goodsNum;
}
public int getOrderDetailsId() {
	return orderDetailsId;
}
public void setOrderDetailsId(int orderDetailsId) {
	this.orderDetailsId = orderDetailsId;
}
  
}
