package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Graph1 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graph1);


		//Insert graph and a button to continue to carry out Rankine analysis
		
		
		
		
		
		
		//inserting button to proceed to next activity
		
		Button toRankine = (Button) findViewById(R.id.button4_1);
	   // System.out.println("isscs button assigned");
	    toRankine.setOnClickListener(new View.OnClickListener() {
	         
	        @Override
	        public void onClick(View v40) {
	            // TODO Auto-generated method stub
	            startActivity(new Intent(Graph1.this,Rankine1.class));
	        }
	    });
		
	}
}
