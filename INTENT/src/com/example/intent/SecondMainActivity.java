package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondMainActivity extends Activity {
	TextView name,number,plus,minus,multiply,division;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_main);
		name=(TextView)findViewById(R.id.textView1);
		number=(TextView)findViewById(R.id.textView2);
		plus=(TextView)findViewById(R.id.textView3);
		minus=(TextView)findViewById(R.id.textView4);
		multiply=(TextView)findViewById(R.id.textView5);
		division=(TextView)findViewById(R.id.textView6);
		
		Intent intent=getIntent();
		Bundle b1=intent.getExtras();
		name.setText(b1.getString("key2"));
		double d1=Double.parseDouble(b1.getString("key1"));
		number.setText(String.valueOf(d1));
		double d2=d1+1;
		double d3=d1-1;
		double d4=d1*1;
		double d5=d1/1;
		plus.setText(d1+"+1= "+String.valueOf(d2));
		minus.setText(d1+"-1= "+String.valueOf(d3));
		multiply.setText(d1+"*1="+String.valueOf(d4));
		division.setText(d1+"/1= "+String.valueOf(d5));		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_main, menu);
		return true;
	}

}
