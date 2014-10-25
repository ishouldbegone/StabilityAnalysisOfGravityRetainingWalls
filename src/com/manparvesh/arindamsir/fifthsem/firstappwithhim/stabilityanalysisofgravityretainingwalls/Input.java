package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Input extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.input);
	

	Button toInput2 = (Button) findViewById(R.id.button1_1);
    System.out.println("isscs button assigned");
    toInput2.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View v10) {
            // TODO Auto-generated method stub
            startActivity(new Intent(Input.this,Input2.class));
        }
    });
	}
}
