package com.mpci.p2pchat;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class UserProfile extends Activity{
	Button mLogin;
	Button mSave;
	  protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.user_profile);
	        
	        mLogin = (Button)findViewById(R.id.log_out);
	        mSave = (Button)findViewById(R.id.save);
	        
	        mLogin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					System.exit(0);
				}
			});
	        mSave.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
				}
			});
	  }
	  
	  
}
