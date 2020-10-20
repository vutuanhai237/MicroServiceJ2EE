package com.toihieuroi.currencyconversionmicroservice.response.entity;

public class CurrencyConversion {
	private String from;
	private String to;
	private int conversionMultiple;
	private int quantity;
	private int totalCalculatedAmount;
	private int port;

	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(String from, String to, int conversionMultiple, int quantity, int totalCalculatedAmount,
			int port) {
		super();
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(int conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(int totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
