package com.example.sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Signupscreen extends Activity {
	EditText etext1, etext2,etext3;
	Button button1, button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signupscreen);
		
		etext1 = (EditText) findViewById(R.id.editText1);
		etext2 = (EditText) findViewById(R.id.editText2);
		etext3 = (EditText) findViewById(R.id.editText3);
		button2 = (Button) findViewById(R.id.button2);
		button1 = (Button) findViewById(R.id.button1);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Signupscreen.this, Login.class);
				startActivity(i);
				finish();
				overridePendingTransition(R.anim.slide_in_right,
					      R.anim.slide_out_right);

				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signupscreen, menu);
		return true;
	}

}
