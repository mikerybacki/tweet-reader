package com.emergy.tweetreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TweetAdapter extends BaseAdapter {

	private TweetData tweetData;
	private Context context;
	
	public TweetAdapter(Context context, TweetData tweetData) {
		this.context = context;
		this.tweetData = tweetData;
	}
	
	@Override
	public int getCount() {
		return tweetData.getTweets().size();
	}

	@Override
	public Tweet getItem(int position) {
		return tweetData.getTweets().get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.list_item, null, true);
		
		TextView textViewTweetAccountName = (TextView) view.findViewById(R.id.textview_tweet_account_name);
		TextView textViewTweetAccountId = (TextView) view.findViewById(R.id.textview_tweet_account_id);
		TextView textViewTweetContent = (TextView) view.findViewById(R.id.textview_tweet_content);
		TextView textViewTweetDate = (TextView) view.findViewById(R.id.textview_tweet_date);
		TextView textViewTweetTime = (TextView) view.findViewById(R.id.textview_tweet_time);
		TextView textViewTweetRetweets = (TextView) view.findViewById(R.id.textview_tweet_retweets);
		
		Tweet tweetItem = this.getItem(position);
		textViewTweetAccountName.setText(tweetItem.getAccountNameString());
		textViewTweetAccountId.setText(tweetItem.getAccountIdString());
		textViewTweetContent.setText(tweetItem.getContents());
		textViewTweetDate.setText(tweetItem.getDateString());
		textViewTweetTime.setText(tweetItem.getTimeString());
		textViewTweetRetweets.setText(tweetItem.getRetweetsString());
		return view;
	}

}
