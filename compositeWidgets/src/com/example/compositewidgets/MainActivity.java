package com.example.compositewidgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner s;
	EditText e;
	TextView d;
	Button f;
	EditText g;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		s=(Spinner) findViewById(R.id.Spineer);
		d=(TextView) findViewById(R.id.textView1);
		e=(EditText) findViewById(R.id.editText1);
		g=(EditText) findViewById(R.id.editText2);
		f=(Button) findViewById(R.id.button2);
		String[] a={"length","currancy","tempersture"};
		ArrayAdapter<String> b=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, a);
		s.setAdapter(b);
		
		s.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				switch (arg2) {
				case 0:
					e.setHint("meter to centimeter");
					g.setHint("centimeter to meter");
					f.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
						
						String s=	e.getText().toString();
						String n=   g.getText().toString();
						if(s.length()>0)
						{
						double l=Double.parseDouble(s);
						d.setText(Double.toString(l/100));
						}
						else if(n.length()>0)
						{
						double l=Double.parseDouble(n);
						d.setText(Double.toString(l*100));
						}
						else
						{
						 Toast.makeText(MainActivity.this,"please enter any value first", Toast.LENGTH_SHORT).show();
						}
							
						}
					});
					
					break;
				case 1:
					e.setHint("INR to USD");
					g.setHint("USD to INR");
					f.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
						
						String s=	e.getText().toString();
						String n=   g.getText().toString();
						if(s.length()>0)
						{
						double l=Double.parseDouble(s);
						d.setText(Double.toString(l/61));
						}
						else if(n.length()>0)
						{
						double l=Double.parseDouble(n);
						d.setText(Double.toString(l*61));
						}
						else
						{
						  Toast.makeText(MainActivity.this,"please enter any value first", Toast.LENGTH_SHORT).show();
						}
						}
					});
						break;
						
				case 2:
					e.setHint("celsius to farenheit");
					g.setHint("farenheit to celsius");
					f.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
						
						String s=	e.getText().toString();
						String n=   g.getText().toString();
						if(s.length()>0)
						{
						double l=Double.parseDouble(s);
						d.setText(Double.toString((l*9)/5+32));
						}
						else if(n.length()>0)
						{
						double l=Double.parseDouble(n);
						d.setText(Double.toString((l-32)*5/9));
						}
						else
						{
						  Toast.makeText(MainActivity.this,"please enter any value first", Toast.LENGTH_SHORT).show();
						}
						}
					});
						break;
				default:
					break;
				}
				
					
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
