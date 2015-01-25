package com.emergy.tweetreader;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tweet {

	private String poster;
	private String contents;
	private Date date;
	private Integer retweets;
	private Integer favorites;
	private List<Tweet> replies;
	
	public Tweet() {
		this.poster = "Anonymous";
		this.contents = "No Contents";
		this.date = new Date();
		this.retweets = 0;
		this.favorites = 0;
		this.replies = new LinkedList<Tweet>();
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
