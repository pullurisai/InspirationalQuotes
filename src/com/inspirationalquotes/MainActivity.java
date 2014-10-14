package com.inspirationalquotes;

//import java.util.List;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tvQuotes;
	TextView tvNumber;
	List<String> quotes;
	int location = 0;
	static int count = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initializeViews();
		quotations();
	}

	public void initializeViews() {
		tvQuotes = (TextView) findViewById(R.id.tvQuotes);
		tvNumber = (TextView) findViewById(R.id.tvNumber);
		tvNumber.setText(count + "/15");
	}

	public void quotations() {
		quotes = new ArrayList<String>();
		quotes.add("Life Is Not About Finding YourSelf,Life Is Not About Creating YourSelf");
		quotes.add("Don't Pray For Easy life,pray for a difficult one to endure");
		quotes.add("Expect Nothing And, You Will Never Be Dissapointed");
		quotes.add("Its Not How Good You Are,Its How Good You Want To Be");
		quotes.add("Always Laugh When You Can, Its Cheap Medicine");
		quotes.add("Even if you’re on the right track, you’ll get run over if you just sit there");
		quotes.add("Be a student as long as you still have something to learn, and this will mean all your life");
		quotes.add("The best way to predict your future is to create it");
		quotes.add("Learn from yesterday, live for today, hope for tomorrow");
		quotes.add("Do not wait to strike till the iron is hot; but make it hot by striking");
		quotes.add("The bad news is time flies. The good news is you’re the pilot");
		quotes.add("Learning is like rowing upstream, not to advance is to drop back");
		quotes.add("Share your sparkle wherever you are");
		quotes.add("Success consists of going from failure to failure without loss of enthusiasm");
		quotes.add("Learning is not a spectator sport");
		tvQuotes.setText(quotes.get(location));
	}

	public void DoneQuoting(View view) {
		try {
			switch (view.getId()) {
			case R.id.btnForwad:
				location += 1;
				count += 1;
				tvQuotes.setText(quotes.get(location));
				tvNumber.setText(count + "/15");
				break;
			case R.id.btnBack:
				location -= 1;
				count -= 1;
				tvQuotes.setText(quotes.get(location));
				tvNumber.setText(count + "/15");
				break;
			case R.id.btnRandom:
				location = (int) ((Math.random() * 25));
				tvQuotes.setText(quotes.get(location));
				count = location;
				tvNumber.setText(location + "/15");
				break;
			}
		} catch (Exception e) {
			location = 0;
			tvNumber.setText(count + "/15");
			tvQuotes.setText(quotes.get(location));
		}
	}
}
