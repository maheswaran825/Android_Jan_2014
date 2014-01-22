package com.example.sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {
	EditText etext1, etext2;
	TextView text1, text2;
	Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		etext1 = (EditText) findViewById(R.id.editText1);
		etext2 = (EditText) findViewById(R.id.editText2);
		text1 = (TextView) findViewById(R.id.textView4);
		button1 = (Button) findViewById(R.id.button1);
		text2 = (TextView) findViewById(R.id.textView5);
		
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Login.this, MainActivity.class);
				startActivity(i);
				finish();
				 overridePendingTransition(R.anim.slide_in_left,
					      R.anim.slide_out_left);

			}
		});

		text2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Login.this, Signupscreen.class);
				startActivity(i);
				finish();
				 overridePendingTransition(R.anim.slide_in_left,
					      R.anim.slide_out_left);

			}
		});

		text1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Login.this, Forgotpassword.class);
				startActivity(i);
				finish();
				 overridePendingTransition(R.anim.slide_in_left,
					      R.anim.slide_out_left);

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
