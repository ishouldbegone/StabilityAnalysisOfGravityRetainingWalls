package com.manparvesh.arindamsir.fifthsem.firstappwithhim.stabilityanalysisofgravityretainingwalls;

import android.content.Intent;
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
	    
	    /////////////////////////////////////do something here!//////////////////////////////////////////////////
	    //if this condition is satisfied, toast the following text and after that carry out to the next activity. 
	    //if this condition isn't satisfied, proceed to next activity without delay 
	    if(Xe>Xter[1]){
	    	System.out.println("For the data input provided in the problem," +
	    			"\nRankine analysis is theoretically not possible." +
	    			"\nOnly Coulomb analysis can be carried out." +
	    			"\n\nHowever we choose to manually override and carry out the Rankine analysis\n");
	    }
	    Overturning_subroutine(Bh,Bsh,Alphab,H,Gammadb,Fib,Cb,Fif,Gammadf,Cf,D,B,Bc,Bst,Bt,Hh,Hsh,Hst,Ht,Gammaw);
	    double Wtw;
	    double Ws;
		double Pv;
		double Pp;
		double Ph;
		Sliding_subroutine(Wtw,Ws,Pv,Fif,B,Cf,Pp,Ph);
		double Sumv;
	    double Mr;
		double Mo;
		Bearing_subroutine(B,D,Cf,Sumv,Ph,Mr,Mo,Gammadf,Fif);
	    Settlement_subroutine(B,Sumv,D,Cf,Gammadf);
	}









	private static double Overturning_subroutine(double Bh,double Bsh,double Alphab,
			double H,double Gammadb,double Fib,double Cb,double Fif,double Gammadf,
			double Cf,double D,double B,double Bc,double Bst,
			double Bt,double Hh,double Hsh,double Hst,double Ht,double Gammaw){
		
		//Active_pressure(Bh,Bsh,Alphab,H,Gammadb,Fib,Cb);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Active_pressure subroutine!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Active_pressure start.................................................
		
		// Height of Rankine active surface, Ha
		double Ha=(Bh+Bsh)*Math.tan(Math.toRadians(Alphab)) + H;

		// Max. stress at base of Rankine surface
		double Maxstr=Gammadb*Ha;

		// Coefficient of Active Earth Pressure
		double Ka=(Math.tan(Math.toRadians(45- Fib/2)))*(Math.tan(Math.toRadians(45- Fib/2)));

		// Active Thrust 
		double Pa=(1/2)*Gammadb*Ka*Ha*Ha-2*Cb*Math.sqrt(Ka)*Ha;

		// Height of application of Pa
		double Hap=Ha/3;

		// Resolving it into components
		double Ph=Pa*Math.cos(Math.toRadians(Alphab));
		double Pv=Pa*Math.sin(Math.toRadians(Alphab));
		
		//Active_pressure finish........................................................
		
		//Passive_pressure(Fif,Gammadf,Cf,D);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Passive_pressure subroutine!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Passive_pressure start.................................................
		
		// Coefficient of Passive pressure
		double Kp=(Math.tan(Math.toRadians(45+ Fif/2)))*(Math.tan(Math.toRadians(45+ Fif/2)));

		// Passive thrust
		double Pp=(1/2)*Kp*Gammadf*(D*D)+2*Cf*Math.sqrt(Kp)*D;

		// Height of application of Pp
		double Hpp=D/3;
		
		//Passive_pressure finish........................................................
		
		//Moment_wall(B,Bc,Bh,Bsh,Bst,Bt,H,Hh,Hsh,Hst,Ht,Gammaw);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!subroutine!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Moment_wall start.................................................
		
		// Section 1
		double W1=(1/2)*(Ht+Hst)*Bt*Gammaw;
		double X1=(Bt/3)*((Ht+2*Hst)/(Ht+Hst));
		double M1=W1*X1;

		// Section 2
		double W2=(1/2)*(H+Hst)*Bst*Gammaw;
		double X2=Bt + (Bst/3)*((Hst+2*H)/(H+Hst));
		double M2=W2*X2;

		// Section 3
		double W3=H*Bc*Gammaw;
		double X3=Bt + Bst + Bc/2;
		double M3=W3*X3;

		// Section 4
		double W4=(1/2)*(H+Hsh)*Bsh*Gammaw;
		double X4=Bt + Bst + Bc +(Bsh/3)*((H+2*Hsh)/(H+Hsh));
		double M4=W4*X4;

		// Section 5
		double W5=(1/2)*(Hsh+Hh)*Bh*Gammaw;
		double X5=Bt + Bst + Bc + Bsh + (Bh/3)*((Hsh+ 2*Hh)/(Hsh+Hh));
		double M5=W5*X5;

		// Total weight of wall
		double Wtw=W1+W2+W3+W4+W5;

		// Total resisting moment due to wall
		double Mtw=M1 + M2 + M3 + M4 + M5;

		//Moment_wall finish........................................................
		//Moment_soil(B,Bc,Bh,Bsh,Bst,Bt,H,Hh,Hsh,Hst,Ht,D,Ha,Gammadb,Gammadf,Pp,Pv,Hpp); // check this out!!
		//Moment_soil start.................................................
		
		double Mp=Pp*Hpp;
		double Ma=Pv*B;

		// Section SH1
		double Wsh1=(1/2)*(Bh+Bsh)*(Ha-H)*Gammadb;
		double Xsh1=Bt + Bst + Bc + 2*(Bh+Bsh)/3;
		double Msh1=Wsh1*Xsh1;

		//% Section SH2
		double Wsh2=Bh*(H-Hsh)*Gammadb;
		double Xsh2=Bt + Bst + Bc + Bsh + Bh/2;
		double Msh2=Wsh2*Xsh2;

		//% Section SH3
		double Wsh3=(1/2)*Bh*(Hsh-Hh)*Gammadb;
		double Xsh3=Bt + Bst + Bc + Bsh +2*Bh/3;
		double Msh3=Wsh3*Xsh3;

		//% Section SH4
		double Wsh4=(1/2)*Bsh*(H-Hsh)*Gammadb;
		double Xsh4=Bt + Bst + Bc + 2*Bsh/3;
		double Msh4=Wsh4*Xsh4;

		//% Section ST1
		double Wst1=(1/2)*(D-Ht)*(D-Hst)*Bt*Gammadf;
		double Xst1=(Bt/3)*(((D-Ht)+2*(D-Hst))/((D-Ht)+(D-Hst)));
		double Mst1=Wst1*Xst1;

		//% Section ST2
		double Wst2=(1/2)*((Bst*((D-Hst)*(D-Hst))*Gammadf)/(H-Hst));
		double Xst2=Bt +(2/3)*((D-Hst)*Bst)/(H-Hst);
		double Mst2=Wst2*Xst2;

		//% Total weight of soil
		double Ws=Wsh1+Wsh2+Wsh3+Wsh4+Wst1+Wst2;

		//% Total moment due to soil
		double Ms=Mp + Ma + Msh1 + Msh2 + Msh3 + Msh4 + Mst1 + Mst2;

		//Moment_soil finish........................................................
				
		//% total resisting moment
		double Mr=Mtw+Ms;

		//% total overturning moment
		double Mo=Ph*Hap;

		double FOS1=Mr/Mo;
		double FOS2=(Mr-Mp)/(Mo-Mp);

		double FOS_over=Math.min(FOS1,FOS2);
		
		return 0;
	}
	
	private void Sliding_subroutine(double Wtw, double Ws, double Pv,
			double Fif, double B, double Cf, double Pp, double Ph) {
		//% Sum of all the vertical forces
		double Sumv=Pv+Wtw+Ws;

		//% kFi=input('Enter the reduction factor for phi to obtain wall friction ');
		//% kC=input('Enter the reduction factor for c to obtain interface adhesion ');

		//fid=fopen('Reduction_Factors.txt');
		//red_fact=fscanf(fid,'%g');
		//fclose(fid);
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!take input from user!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!make another activity!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		double red_fact[]=new double[2];
		double kFi=red_fact[0];    //% Reduction factor for phi to obtain wall friction
		double kC=red_fact[1];     //% Reduction factor for c to obtain interface adhesion

		//% Factor of safety against sliding
		double FOS_slide=(Sumv*Math.tan(kFi*Fif)+B*kC*Cf+Pp)/Ph;
		//return 0;
	}
	
	

	private void Bearing_subroutine(double B, double D, double Cf, double Sumv,
			double Ph, double Mr, double Mo, double Gammadf, double Fif) {
		
		//% Resultant of vertical and horizontal forces
		double R=Math.sqrt(Sumv*Sumv+Ph*Ph);

		//% net moment
		double Mnet=Mr-Mo;

		//% eccentricity of the resultant
		double e=((B/2)-(Mnet/Sumv));
		if (Math.abs(e)>(B/6)){ //toast or any other way of output.............................................................
		    //fprintf('NB: Resultant does not lie in the middle third\nTension stresses will be generated beneath the retaining wall\n');
		}else{
		    //fprintf('NB: Resultant lies in the middle third\nNo tension stresses are generated beneath the retaining wall \n\n');
		}
		//disp('Press any key to continue');....................next button.............................................
		

		//% calculation of pressure intensities
		double qtoe=(Sumv/B)*(1+(6*e/B));
		double qheel=(Sumv/B)*(1-(6*e/B));
		double qmax=Math.max(Math.abs(qtoe),Math.abs(qheel));

		//% Plotting the bearing stress distribution beneath the retaining wall
		//fill([0,B,B,0],[0,0,-qheel/100,-qtoe/100],[0,0,1]).....................................doubt..............................

		double qu;//from UBC_subroutine(Gammadf,D,B,e,Fif,Ph,Sumv,Cf);.....................................
		// UBC_subroutine start.......................................................
		
		//% Bearing capacity factors
		double Nq=Math.exp(2*(3*Math.PI/4-Math.PI/180*Fif/2)*Math.tan(Math.toRadians(Fif))/(2*Math.cos(Math.PI/4+Math.PI/180*Fif/2)*Math.cos(Math.PI/4+Math.PI/180*Fif/2)));
		double Nc=(Nq-1)*Math.cos(Math.toRadians(Fif))/Math.sin(Math.toRadians(Fif));
		double Ngamma=2*(Nq+1)*Math.tan(Math.toRadians(Fif));
		
		//% Shape Factors
		//disp('Footing is treated as continuous footing'); //..............toast here......................................
		double Fcs=1;
		double Fqs=1;
		double Fgammas=1;
		
		//% Depth factors
		double Bi=B-2*Math.abs(e);
		double Fqd=1+2*Math.tan(Math.toRadians(Fif))*(1-Math.sin(Math.toRadians(Fif)))*(1-Math.sin(Math.toRadians(Fif)))*D/Bi;
		double Fcd=Fqd-(1-Fqd)/(Nc*Math.tan(Math.toRadians(Fif)));
		double Fgammad=1;
		
		//% Inclination factors
		double psi=Math.atan(Ph/Sumv);
		double Fci=(1-psi/90)*(1-psi/90);
		double Fqi=Fci;
		double Fgammai=(1-psi/Fif)*(1-psi/Fif);
		
		//% Ultimate bearing capacity of soil
		qu=Cf*Nc*Fcs*Fcd*Fci+Gammadf*D*Nq*Fqs*Fqd*Fqi+0.5*Gammadf*Bi*Ngamma*Fgammas*Fgammad*Fgammai;
		// UBC_subroutine end..................................................................

		//% factor of safety against bearing capacity of the soil
		double FOS_bearing=qu/qmax;
		
	}



	private void Settlement_subroutine(double B, double Sumv, double D,
			double Cf, double Gammadf) {
		
		//we need another set of inputs here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		fid=fopen('Soil_Profile.txt','r');
//		soil_prof=fscanf(fid,'%g');
//		fclose(fid);
		double soil_prof[]= new double[6];
		double NL=soil_prof[0];// % Number of soil layers
		double Hs=soil_prof[1];// % Thickness of soil layer
		double Es=soil_prof[2];// % Elastic modulus of soil layer
		double Poisson=soil_prof[3];// % Poisson's ratio of soil layer
		double e0=soil_prof[4];// % Void ratio of soil layer
		double WT=soil_prof[5];// % Depth of water table beneath the base of foundation
		double Hseff;
		if (Hs>=5*B){
		    Hseff=5*B;//  % To ensure that the settlement calculation is confined upto a depth of 5B
		}else{
		    Hseff=Hs;// % For settlement calculation where a rock/hard stratum is encountered before 5B
		}
		
		double q0=Sumv/B;// % Initial stress just beneath the base of retaining wall
		double Bi=B/2; //% To calculate the settlement at the center
		double alpha=4; //   % for central settlement, 4 corners of the footing are effective
		
		//[Is]=Steinbrenner_subroutine(Hseff,B,Poisson); % Steinbrenner's Coefficient
		//Steinbrenner_subroutine start..................

		double m=1/B;
		double n=Hseff/(B/2);
		
		double A0=m*Math.log((1+Math.sqrt(1+m*m))*Math.sqrt(m*m+n*n)/(m*(1+Math.sqrt(1+m*m+n*n))));
		double A1=Math.log((m+Math.sqrt(1+m*m))*Math.sqrt(1+n*n)/(m+Math.sqrt(1+m*m+n*n)));
		double A2=m/(n*(Math.sqrt(1+m*m+n*n)));
		
		double F1=(A0+A1)/Math.PI;
		double F2=n/(2*Math.PI)*Math.atan(A2);
		
		double Is=F1+(1-2*Poisson)/(1-Poisson)*F2;
		//Steinbrenner_subroutine end....................
		
		//[Ifox]=Fox_subroutine(D,B,Poisson);//%Fox Coefficient
		//Fox_subroutine start
		
		double Depth_ratio=D/B;
		double Aspect_ratio=5; //% For considering the plane strain effect (Although L/B ratio does not have significant variation on Ifox
		
		double Poi_comp[]={1.000/Poisson, 1.200/Poisson, 1.400/Poisson, 1.600/Poisson, 1.800/Poisson, 2.000/Poisson, 5.000/Poisson};
		double Dep_comp[]={0.05/Depth_ratio, 0.1/Depth_ratio, 0.2/Depth_ratio, 0.4/Depth_ratio, 0.6/Depth_ratio, 0.8/Depth_ratio, 1.0/Depth_ratio, 2.0/Depth_ratio};
		double Asp_comp[]={0.0/Aspect_ratio, 0.1/Aspect_ratio, 0.2/Aspect_ratio, 0.3/Aspect_ratio, 0.4/Aspect_ratio, 0.5/Aspect_ratio};
		
		//double Poi_comp[]=Poisson_set[]/Poisson;
		
		//double Dep_comp=Dep_rat_set/Depth_ratio;
		//double Asp_comp=Asp_rat_set/Aspect_ratio;
		
		if (Poi_comp==1){
		   // Poi=find(Poi_comp==1);//................................doubt....find???...........................................
		    [Poi_choose]=Poisson_subroutine(Poi);
		    [If_DB]=DB_Interpol_subroutine(Poi_choose,Dep_comp,Asp_comp,Depth_ratio);
		    Ifox=IF_DB;
		}else{
		    Poi=find(Poi_comp>1);
		    Poi_lower=Poi(1)-1;
		    [Poi_choose]=Poisson_subroutine(Poi_lower);
		    [If_DB]=DB_Interpol_subroutine(Poi_choose,Dep_comp,Asp_comp,Depth_ratio,Dep_rat_set);
		    If_Poi_lower=If_DB;
		    Poi_upper=Poi(1);
		    [Poi_choose]=Poisson_subroutine(Poi_upper);
		    [If_DB]=DB_Interpol_subroutine(Poi_choose,Dep_comp,Asp_comp,Depth_ratio,Dep_rat_set);
		    If_Poi_upper=If_DB;
		    Pint=Poisson;P1=Poisson_set(Poi_lower);Q1=If_Poi_lower;P2=Poisson_set(Poi_upper);Q2=If_Poi_upper;
		    [Lin_inter]=Linear_Interpolation_subroutine(Pint,P1,Q1,P2,Q2);
		    Ifox=Lin_inter;
		}
		//Fox_subroutine end
		
		double Settle_elastic=q0*alpha*Bi*(1-Poisson*Poisson)/Es*Is*Ifox; //% Elastic settlement
		double Settle_consolid;
		//% Consolidation settlement analysis to be done only if Cf>0
		if (Cf>0){
		Settle_consolid=Consolidation_subroutine(Hseff,e0,q0,D,Gammadf,B);
		}else{
		Settle_consolid=0;
		}
		
		//% Total settlement
		Settle_tot=Settle_elastic+Settle_consolid;
		

		
	}


	
}
