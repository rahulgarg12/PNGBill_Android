package com.example.pngbill;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText t1 = (EditText) findViewById(R.id.editText1);
		final EditText t2 = (EditText) findViewById(R.id.editText2);
		Button b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float i1 = Float.parseFloat(t1.getText().toString());
				float i2 = Float.parseFloat(t2.getText().toString());
				
				double i3 = i2-i1;
				double i4 = i3*26.20;
				double i5 = i3-36;
				
				if(i3<=36) {
					Toast.makeText(getApplicationContext(), "Your Generated Bill is Rs. "+i4, Toast.LENGTH_LONG).show();
				}
				
				else {
					i5 = (i5*47.65)+((i3-i5)*26.20);
					Toast.makeText(getApplicationContext(), "Your Generated Bill is Rs. "+i5, Toast.LENGTH_LONG).show();
				}
			}	
		} );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
