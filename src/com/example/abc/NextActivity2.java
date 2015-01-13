package com.example.abc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;


public class NextActivity2 extends Activity implements RadioGroup.OnCheckedChangeListener, Button.OnClickListener{

	RadioGroup radiogroup;
	RadioButton rbutton1;
	RadioButton rbutton2;
	RadioButton rbutton3;
	Button button;
	private int radioCheckedId=-1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next_activity2);
		// Show the Up button in the action bar.
		setupActionBar();
		getIntent();
		radiogroup=(RadioGroup)findViewById(R.id.radioGroup1);
		button=(Button)findViewById(R.id.button2);
		rbutton1=(RadioButton)findViewById(R.id.radio0);
		rbutton2=(RadioButton)findViewById(R.id.radio1);
		rbutton3=(RadioButton)findViewById(R.id.radio2);
		radiogroup.setOnCheckedChangeListener(this);
		button.setOnClickListener(this);
		
	}
	
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		radioCheckedId=checkedId;
	}


	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next_activity2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void gotoHistory(View view) {
		Intent intent = new Intent(this, ActivityNext.class);
		startActivity(intent);
	}

	public void callRemedy(View view) {
		
		/*getIntent();
		RadioGroup group=(RadioGroup)findViewById(R.id.radioGroup1);
		group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
			RadioButton button1=(RadioButton)findViewById(R.id.radio0);
			if(button1.isChecked())
			{
				
			}
			
			}
		});
	*/
		
		//Intent intent = new Intent(this, NextActivity3.class);
		//startActivity(intent);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		if(v==button)
		{
			if(radioCheckedId == R.id.radio0 )
			{
				Intent intent = new Intent(this, Activity_next_activity3_head.class);
				startActivity(intent);
			}
			if(radioCheckedId == R.id.radio1 )
			{
				Intent intent = new Intent(this, Activity_next_activity3_dia.class);
				startActivity(intent);
			}
			if(radioCheckedId == R.id.radio2 )
			{
				Intent intent = new Intent(this, NextActivity3.class);
				startActivity(intent);
			}
		}
	}
}
