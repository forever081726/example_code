package com.neusoft.ruigoubusiness.po;

public class Goods {

	private int goodsId;
	private String goodsName;
	private String goodsClass;
	private int goodsPrice;
	private int goodsStore;
	private int merchantId;
	private String goodsImg;
	private String goodsDetails;
	private int goodssalenumber;
	private String goodsStatus;
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getGoodsStatus() {
		return goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}
	public int getGoodssalenumber() {
		return goodssalenumber;
	}
	public void setGoodssalenumber(int goodssalenumber) {
		this.goodssalenumber = goodssalenumber;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsClass() {
		return goodsClass;
	}
	public void setGoodsClass(String goodsClass) {
		this.goodsClass = goodsClass;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsStore() {
		return goodsStore;
	}
	public void setGoodsStore(int goodsStore) {
		this.goodsStore = goodsStore;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public String getGoodsDetails() {
		return goodsDetails;
	}
	public void setGoodsDetails(String goodsDetails) {
		this.goodsDetails = goodsDetails;
	}
	
	
}
