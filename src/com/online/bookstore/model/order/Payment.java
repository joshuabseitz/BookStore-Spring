package com.online.bookstore.model.order;

public interface Payment {
	public void setCardNumber(int cardNumber);
	public void setExpMonth(int expMonth);
	public void setExpYear(int expYear);
	public void setCardName(String cardName);
	public void setSecurityCode(int securityCode);
	
	public int getCardNumber();
	public int getExpMonth();
	public int getExpYear();
	public String getCardName();
	public int getSecurityCode();
}