package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
import com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls.Input2;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input3 extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.input3);


		Button toGraph1 = (Button) findViewById(R.id.button3_1);
	    System.out.println("isscs button assigned");
	    toGraph1.setOnClickListener(new View.OnClickListener() {
	         
	        @Override
	        public void onClick(View v30) {
	            // TODO Auto-generated method stub
	            startActivity(new Intent(Input3.this,Graph1.class));
	        }
	    });
	    
	    //..............................................,..............input 1...................................//
	  //taking inputs!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	    
	    EditText h=(EditText)findViewById(R.id.editText1_1);
	    EditText b=(EditText)findViewById(R.id.editText1_2);
	    EditText hT=(EditText)findViewById(R.id.editText1_3);
	    EditText bC=(EditText)findViewById(R.id.editText1_4);
	    EditText bT=(EditText)findViewById(R.id.editText1_5);
	    EditText bH=(EditText)findViewById(R.id.editText1_6);
	    EditText hH=(EditText)findViewById(R.id.editText1_7);
	    EditText bSH=(EditText)findViewById(R.id.editText1_8);
	    EditText aLPHAH=(EditText)findViewById(R.id.editText1_9);
	    EditText hSH=(EditText)findViewById(R.id.editText1_10);
	    EditText bST=(EditText)findViewById(R.id.editText1_11);
	    EditText aLPHAT=(EditText)findViewById(R.id.editText1_12);
	    EditText hST=(EditText)findViewById(R.id.editText1_13);
	    EditText gAMMAW=(EditText)findViewById(R.id.editText1_14);
	    
	    //parsing inputs
	    
	    double H=Double.parseDouble(h.toString());
	    double B=Double.parseDouble(b.toString());
	    double Ht=Double.parseDouble(hT.toString());
	    double Bc=Double.parseDouble(bC.toString());
	    double Bt=Double.parseDouble(bT.toString());
	    double Bh=Double.parseDouble(bH.toString());
	    double Hh=Double.parseDouble(hH.toString());
	    double Bsh=Double.parseDouble(bSH.toString());
	    double Alphah=Double.parseDouble(aLPHAH.toString());
	    double Hsh=Double.parseDouble(hSH.toString());
	    double Bst=Double.parseDouble(bST.toString());
	    double Alphat=Double.parseDouble(aLPHAT.toString());
	    double Hst=Double.parseDouble(hST.toString());
	    double Gammaw=Double.parseDouble(gAMMAW.toString());
	    
	    //......................................................input 2.......................................//
	  //taking inputs from editText
	    EditText aLPHAB=(EditText)findViewById(R.id.editText2_1);
	    EditText cB=(EditText)findViewById(R.id.editText2_2);
	    EditText fIB=(EditText)findViewById(R.id.editText2_3);
	    EditText gAMMADB=(EditText)findViewById(R.id.editText2_4);
	    EditText gAMMASB=(EditText)findViewById(R.id.editText2_5);
		
		//parsing values
	    double Alphab=Double.parseDouble(aLPHAB.toString());
	    double Cb=Double.parseDouble(cB.toString());
	    double Fib=Double.parseDouble(fIB.toString());
	    double Gammadb=Double.parseDouble(gAMMADB.toString());
	    double Gammasb=Double.parseDouble(gAMMASB.toString());
	    
	    
	    //...................................................input 3..........................................//
	    //taking inputs
	    EditText d=(EditText)findViewById(R.id.editText3_1);
	    EditText cF=(EditText)findViewById(R.id.editText3_2);
	    EditText fIF=(EditText)findViewById(R.id.editText3_3);
	    EditText gAMMADF=(EditText)findViewById(R.id.editText3_4);
	    EditText gAMMASF=(EditText)findViewById(R.id.editText3_5);
		
		//parsing values
	    double D=Double.parseDouble(d.toString());
	    double Cf=Double.parseDouble(cF.toString());
	    double Fif=Double.parseDouble(fIF.toString());
	    double Gammadf=Double.parseDouble(gAMMADF.toString());
	    double Gammasf=Double.parseDouble(gAMMASF.toString());
	    
	    // end of input series
	    //starting processing
	    
	    //checking whether rankine theory is applicable or not
	    double Neta=45+(Alphab/2)-(Fib/2)-Math.asin(Math.sin(Math.toRadians(Alphab))/Math.sin(Math.toRadians(Fib)));
	    
	    double[] Xter=new double[2];
	    double[] Xin=new double[2];

	    //terminal co-ordinates of line at a height H
	    Xter[0]=B-H*Math.tan(Math.toRadians(Neta)); //x co-ordinate
	    Xter[1]=H;                                  //y co-ordinate
	    
	    //initial co-ordinate of line
	    Xin[0]=B; //x-coordinate
	    Xin[1]=0; //y-coordinate
	    
	    double Xe=B-(Bh+Bsh);
	    
	    if(Xe>Xter[1]){
	    	System.out.println("For the data input provided in the problem," +
	    			"\nRankine analysis is theoretically not possible." +
	    			"\nOnly Coulomb analysis can be carried out." +
	    			"\n\nHowever you can choose to manually override and carry out the Rankine analysis\n");
	    }
	    
	}
}
