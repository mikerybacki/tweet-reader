package com.emergy.tweetreader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TweetData {

	private List<Tweet> tweets;
	
	public TweetData() {
		tweets = new ArrayList<Tweet>();
		createDummyData();
	}
	
	private void createDummyData() {
		tweets = new ArrayList<Tweet>();
		Tweet tweet = new Tweet();
		tweet.setPoster("New Poster");
		tweet.setContents("Hello world!");
		tweets.add(tweet);
	}
	
	public List<Tweet> getTweets() {
		return tweets;
	}
	
}
