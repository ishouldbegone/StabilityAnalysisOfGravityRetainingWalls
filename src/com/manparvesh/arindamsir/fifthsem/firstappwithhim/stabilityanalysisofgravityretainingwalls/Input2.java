package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.input2);
	
	Button toInput3 = (Button) findViewById(R.id.button2_1);
    System.out.println("isscs button assigned");
    toInput3.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View v20) {
            // TODO Auto-generated method stub
            startActivity(new Intent(Input2.this,Input3.class));
        }
    });
    
    
	}
}
