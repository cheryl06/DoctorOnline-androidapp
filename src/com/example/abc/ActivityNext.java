package com.example.abc;



import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;


public class ActivityNext extends Activity implements RadioGroup.OnCheckedChangeListener,View.OnClickListener{

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_next);
		// Show the Up button in the action bar.
		setupActionBar();
		/*Bundle b = new Bundle();
		b = getIntent().getExtras();
		String name = b.getString("msg");*/
		getIntent();
		RadioGroup group=(RadioGroup)findViewById(R.id.radioGroup4);
		group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				EditText testButton=(EditText)findViewById(R.id.editText1);
				TextView testButton2=(TextView)findViewById(R.id.textView5);
				RadioButton test=(RadioButton)findViewById(R.id.radio0);
				RadioButton test1=(RadioButton)findViewById(R.id.radio1);
				
				
				if(test.isChecked())
				{	
					testButton2.setVisibility(View.VISIBLE);
					testButton.setVisibility(View.VISIBLE);
				}
				if(test1.isChecked())
				{
					testButton2.setVisibility(View.INVISIBLE);
					testButton.setVisibility(View.INVISIBLE);
				}
				
			
			}
		});
			
			
		
		//editText = (EditText) findViewById(R.id.editText1);
		//editText.setVisibility(View.INVISIBLE);
		
		//addListenerOnChkIos();
		//button1 = (RadioButton) findViewById(R.id.radioButton3);
		//*/
		
		/*TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(name);
		setContentView(textView);*/
		
		//if()
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
		getMenuInflater().inflate(R.menu.activity_next, menu);
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
	
	 /* public void addListenerOnChkIos() {
		  
			
		 test.setOnClickListener(new OnClickListener()
		 );
			/*test.setOnClickListener(new OnClickListener() {
		 
			  @Override
			  public void onClick(View v) {
		                //is chkIos checked?
				
		 
			  }
			});
	  }*/
	/*public void onCheckedChanged(RadioGroup group, int checkedId) {
        String selection = getString(R.id.radioGroup5);
        String none = getString(R.id.radio0);
        testButton.setText(selection +
                (checkedId == View.NO_ID ? none : checkedId));
    }*/

	public void mainPage(View view) {
	
		Intent intent = new Intent(this, Personal_Information.class);
		startActivity(intent);
	}
	
	public void symptomsPage(View view) {
		
		RadioButton test1=(RadioButton)findViewById(R.id.radio0);
		RadioButton test2=(RadioButton)findViewById(R.id.radio2);
		RadioButton test3=(RadioButton)findViewById(R.id.radio4);
		if(test1.isChecked() || test2.isChecked() || test3.isChecked() )
		{
			Intent intent = new Intent(this, Rx_Precaution.class);
			startActivity(intent);
		}
		
		else
		{
		Intent intent = new Intent(this, NextActivity2.class);
		startActivity(intent);
	
		}
		}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		
	}

	
		
	

}
