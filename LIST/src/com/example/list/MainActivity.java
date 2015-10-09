package com.example.list;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView l;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		l=(ListView)findViewById(R.id.listView1);
		String[] a={"avinash","ravi","ashutosh","roshan","ram","ramu" };
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a);
		
		l.setAdapter(adapter);
		l.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Intent.ACTION_DIAL);
				switch(position)
				{
				case 0:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"8553189352"));
					startActivity(intent);
					break;
				case 1:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"3457892345"));
					startActivity(intent);
					break;
					
				case 2:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"8523673456"));
					startActivity(intent);
					break;
				case 3:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"8587534591"));
					startActivity(intent);
					break;
				case 4:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"8578054970"));
					startActivity(intent);
					break;
					
					default:
						break;
				}




					
					
					
					
					
			}
		});
				
	


	
	}
}
