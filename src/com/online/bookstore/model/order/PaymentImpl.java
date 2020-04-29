package com.online.bookstore.model.order;

public class PaymentImpl implements Payment {
	
	private int cardNumber;
	private int expMonth;
	private int expYear;
	private int securityCode;
	private String cardName;
	
	public PaymentImpl() {}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	
	public int getExpYear() {
		return expYear;
	}
	
	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}
	
	public int getExpMonth() {
		return expMonth;
	}
	
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCardName() {
		return cardName;
	}

	
}
