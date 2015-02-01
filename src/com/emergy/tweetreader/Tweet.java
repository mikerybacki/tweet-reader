package com.emergy.tweetreader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Tweet implements ApplicationConstants {

	private Account mAccount;
	private String mContents;
	private Date mDate;
	private Integer mRetweets;
	private Integer mFavorites;
	private List<Tweet> mReplies;
	
	public Tweet(Account account, String contents, Date date, Integer retweets, Integer favorites, List<Tweet> replies) {
		this.mAccount = account;
		this.mContents = contents;
		this.mDate = date;
		this.mRetweets = retweets;
		this.mFavorites = favorites;
		this.mReplies = replies;
	}
	
	public String getAccountNameString() {
		return mAccount.getAccountName();
	}
	
	public String getAccountIdString() {
		return mAccount.getAccountId();
	}

	public String getContents() {
		return mContents;
	}

	public void setContents(String contents) {
		this.mContents = contents;
	}

	public Date getDate() {
		return mDate;
	}
	
	public String getDateString() {
		return this.getFormattedDate(ApplicationConstants.DATE_FORMAT);
	}
	
	public String getTimeString() {
		return this.getFormattedDate(ApplicationConstants.TIME_FORMAT);
	}
	
	private String getFormattedDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
		return sdf.format(mDate);
	}

	public void setDate(Date date) {
		this.mDate = date;
	}

	public Integer getRetweets() {
		return mRetweets;
	}
	
	public String getRetweetsString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(mRetweets.toString()).append(" retweets");
		return stringBuilder.toString();
	}

	public void setRetweets(Integer retweets) {
		this.mRetweets = retweets;
	}

	public Integer getFavorites() {
		return mFavorites;
	}

	public void setFavorites(Integer favorites) {
		this.mFavorites = favorites;
	}

	public List<Tweet> getReplies() {
		return mReplies;
	}

	public void setReplies(List<Tweet> replies) {
		this.mReplies = replies;
	}
}
