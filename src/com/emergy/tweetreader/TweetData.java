package com.emergy.tweetreader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TweetData {

	private List<Tweet> mTweets;
	
	public TweetData() {
		mTweets = new ArrayList<Tweet>();
		createDummyData();
	}
	
	private void createDummyData() {
		mTweets = new ArrayList<Tweet>();
		Account account = new Account("default", "Default poster");
		String contents = "Hello world!";
		Tweet tweet1 = new Tweet(account, contents, new Date(), 0, 0, new ArrayList<Tweet>());

		Account account2 = new Account("DummYAcc", "Dummy account");
		String contents2 = "I'd rather die than give you control";
		String contents3 = "Brillant";
		Tweet tweet2 = new Tweet(account2, contents2, new Date(), 3, 5, new ArrayList<Tweet>());
		Tweet tweet3 = new Tweet(account2, contents3, new Date(), 90, 1337, new ArrayList<Tweet>());

		mTweets.addAll(Arrays.asList(tweet1, tweet2, tweet3));

	}
	
	public List<Tweet> getTweets() {
		return mTweets;
	}
	
}
