package com.example.simple;

import android.os.Bundle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button alertButton;
	private TextView alertTextView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertButton=(Button) findViewById(R.id.AlertButton);
        alertTextView=(TextView) findViewById(R.id.AlertTextView);
        
        alertButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
			AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
			builder.setCancelable(true);
			builder.setTitle("Welcome to Mobile Application Development");
			builder.setMessage("This is a alert box");
			builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialogInterface, int i) {
					// TODO Auto-generated method stub
					dialogInterface.cancel();
				}
			});
			builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialogInterface, int i) {
					// TODO Auto-generated method stub
					dialogInterface.cancel();
					alertTextView.setVisibility(View.VISIBLE);
				}
			});
			builder.show();
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