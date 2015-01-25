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
		
		TextView textView = (TextView) view.findViewById(R.id.text_view_01);
		
		Tweet tweetItem = this.getItem(position);
		textView.setText(tweetItem.getContents());
		return view;
	}

}
