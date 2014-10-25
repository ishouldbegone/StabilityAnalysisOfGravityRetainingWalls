package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Rankine1 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rankine1);
	


	//carry Rankine analysis here
	
	
	//button for next activity to display graph

	Button toFinalGraph = (Button) findViewById(R.id.button1_1);
    System.out.println("isscs button assigned");
    toFinalGraph.setOnClickListener(new View.OnClickListener() {
         
        @Override
        public void onClick(View v50) {
            // TODO Auto-generated method stub
            startActivity(new Intent(Rankine1.this,FinalGraph.class));
        }
    });	
	}
}
