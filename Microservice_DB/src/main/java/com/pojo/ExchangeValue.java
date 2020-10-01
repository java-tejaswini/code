package com.pojo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Exchange_value")
public class ExchangeValue {
	@Id
	private int id;
	private String valueFrom;
	private String valueTo;
	private BigDecimal conversionMultiple;
	int port;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValueFrom() {
		return valueFrom;
	}
	public void setValueFrom(String valueFrom) {
		this.valueFrom = valueFrom;
	}
	public String getValueTo() {
		return valueTo;
	}
	public void setValueTo(String valueTo) {
		this.valueTo = valueTo;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ExchangeValue(int id, String valueFrom, String valueTo, BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.valueFrom = valueFrom;
		this.valueTo = valueTo;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}
	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
}
