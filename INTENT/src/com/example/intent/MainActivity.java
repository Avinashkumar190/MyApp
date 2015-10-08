package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button login;
	EditText number,name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		login=(Button)findViewById(R.id.button1);
		number=(EditText)findViewById(R.id.editText1);
		name=(EditText)findViewById(R.id.editText2);
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//if(number.getText().toString().length()==0)
				//{
					//Check();
				//}
				//else{
				Intent intent=new Intent(MainActivity.this,SecondMainActivity.class);
				intent.putExtra("key1",number.getText().toString());
				intent.putExtra("key2",name.getText().toString());
				startActivity(intent);
				
			}
			//}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
