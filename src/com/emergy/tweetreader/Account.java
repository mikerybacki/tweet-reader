package com.emergy.tweetreader;

public class Account {

	private final String mAccountId;
	private String mAccountName;
	
	public Account(String accountId, String accountName) {
		this.mAccountId = accountId; 
		this.mAccountName = accountName;
	}
	
	public String getAccountId() {
		return "@" + this.mAccountId;
	}
	
	public String getAccountName() {
		return this.mAccountName;
	}	
}
