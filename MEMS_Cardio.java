import java.util.*;

public class Mems_Cardio
{
 public static int resistance = 20;
 public static int plaque_removal=0;
 public static int plaque_removed =0;
 public static int j=1;

 public static void main(string[] args)
 {
  int attachment=0;
 int blood_vel;
 int veh_vel;
 int dia;
 int bp;
 int cardiac_op;
 int sys, dias, i=1; 
 int US_vel, sys_dia, dias_dia;
 float norm_sys_rtt, norm_dias_rtt, fat_sys_rtt, fat_dias_rtt;
 
 Scanner d = new Scanner(System.in);
 System.out.println("The nanorobot is in human body\n");
 if(attachment==0 || attachment==1)
 {
 System.out.println("Scan for blood vessel diameter: ");
 //scanf("%d",&dia);
  dia = d.nextInt(); 
  if(dia>=8200 && dia<=10000)
  {
	  System.out.println("The nanorobot is in Femoral artery\n");
	  System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=8 && blood_vel<=12)
      veh_vel=20;
      else if(blood_vel<8){veh_vel=16;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+veh_vel);
	  while(dia>=8200 && dia<=10000)
	  {
		  System.out.println("Scan for blood vessel diameter: ");
          //scanf("%d",&dia);
		  dia = d.nextInt();
		  System.out.println("\n");
	  }
	  System.out.println("The nanorobot moves out of Femoral artery\n");
	  System.out.println("\n");
  }
  
  if(dia>=16000 && dia<=20000)
  {
  	  System.out.println("The nanorobot is in Common Iliac artery\n");
      System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=24 && blood_vel<=28)
      veh_vel=36;
      else if(blood_vel<24){veh_vel=31;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+veh_vel);
      while(dia>=16000 && dia<=20000)
	  {
		  System.out.println("Scan for blood vessel diameter: ");
          //scanf("%d",&dia);
		  dia = d.nextInt();
		  System.out.println("\n");
	  }
	  System.out.println("The nanorobot moves out of Common Iliac artery\n");
	  System.out.println("\n");
  }
 
 if(dia>=22000 && dia<=26000)
  {
	  System.out.println("The nanorobot is in Abdominal aorta\n");
	  System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=8 && blood_vel<=12)
      veh_vel=20;
      else if(blood_vel<8){veh_vel=16;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+veh_vel);
	  while(dia>=22000 && dia<=26000)
	  {
		  System.out.println("Scan for blood vessel diameter: ");
          //scanf("%d",&dia);
		  dia = d.nextInt();
		  System.out.println("\n");
	  }
	  System.out.println("The nanorobot moves out of Abdominal aorta\n");
	  System.out.println("\n");
  }
  
  if(dia>=26000 && dia<=30000)
  {
	  System.out.println("The nanorobot is in Descending aorta\n");
	  System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=10 && blood_vel<=14)
      veh_vel=22;
      else if(blood_vel<10){veh_vel=14;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+veh_vel);
	  while(dia>=26000 && dia<=30000)
	  {
		  System.out.println("Scan for blood vessel diameter: ");
          //scanf("%d",&dia);
		  dia = d.nextInt();
		  System.out.println("\n");
	  }
	  System.out.println("The nanorobot moves out of Descending aorta\n");
	  System.out.println("\n");
  }
  
  if(dia>=30000 && dia<=40000)
  {
	  System.out.println("The nanorobot is in Aortic arch\n");
	  System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=13 && blood_vel<=17)
      veh_vel=25;
      else if(blood_vel<13){veh_vel=20;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+veh_vel);
	  while(dia>=30000 && dia<=40000)
	  {
		  System.out.println("Scan for blood vessel diameter: ");
          //scanf("%d",&dia);
		  dia = d.nextInt();
		  System.out.println("\n");
	  }
	  System.out.println("The nanorobot moves out of Aortic arch\n");
	  System.out.println("\n");
  }
     
  if(dia>=20000 && dia<=24000)
  {
	  System.out.println("The nanorobot is in Ascending aorta\n");
	  System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=9 && blood_vel<=13)
      veh_vel=20;
      else if(blood_vel<9){veh_vel=15;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+veh_vel);
	  while(dia>=20000 && dia<=24000)
	  {
		  System.out.println("Scan for blood vessel diameter: ");
          //scanf("%d",&dia);
		  dia = d.nextInt();
		  System.out.println("\n");
	  }
	  System.out.println("The nanorobot moves out of Ascending aorta\n");
	  System.out.println("\n");
  }
  
  if(dia>=3100 && dia<=4000)
  {
      System.out.println("The nanorobot is in Coronary Artery\n");
      System.out.println("Scan for blood velocity: ");
      //scanf("%d",&blood_vel);
	  blood_vel = d.nextInt();
      if(blood_vel>=20 && blood_vel<=24)
      veh_vel=32;
      else if(blood_vel<20){veh_vel=27;}
      else {veh_vel=35;}
      System.out.println("The vehicle velocity: "+ veh_vel);
      System.out.println("Scan for BP\n");
      cardiac_op = blood_pressure(sys,dias);
      System.out.println("The cardiac output: "+cardiac_op);
      cardiac_op = navigation(cardiac_op);
      System.out.println("The cardiac output: "+cardiac_op);
      dia=2900;
      System.out.println("Now the diameter of the blood vessel: "+dia);
      if(cardiac_op<7 || cardiac_op>4)
      {
         plaque_removed = 1;
       	 plaque_removal = 0;
         System.out.println("The plaque has been removed: "+plaque_removed);	
      }
  }
	  int[10] cap = [8200,16000,22000,26000,30000,20000,3100];
	  HashMap<Integer,String> hcap = new HashMap<Integer,String>();
	 for(int i=0;i<cap.length;i++) {
	         if (hcap.get(cap[i]) == null)
              hcap.put(cap[i], "start");
                 else if (hcap.get(cap[i]) == 8200)
              hcap.put(arr[i], "Femoral Artery");
		 else if (hcap.get(cap[i]) == 16000)
              hcap.put(arr[i], "Common Iliac Artery");
		 else if (hcap.get(cap[i]) == 22000)
              hcap.put(arr[i], "Abdominal Aorta");
		 else if (hcap.get(cap[i]) == 26000)
              hcap.put(arr[i], "Descending Aorta");
		 else if (hcap.get(cap[i]) == 30000)
              hcap.put(arr[i], "Aortic Arch");
		 else if (hcap.get(cap[i]) == 20000)
              hcap.put(arr[i], "Ascending Aorta");
		 else if (hcap.get(cap[i]) == 3100)
              hcap.put(arr[i], "Coronary Artery");
	  }
	  for(Map.Entry m:hcap.entrySet())
	  {
	     System.out.println("For diameter" + m.getKey() + ", the corresponding vessel is" + m.getValue());  
	  }
	 
 }
 attachment=1;
 System.out.println("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
 System.out.println("MicroSONAR is turned ON\n");
 System.out.println("Scan for the velocity of Ultrasound in Blood: ");
 //scanf("%d",&US_vel);
 US_vel = d.nextInt();
 System.out.println("\n");
 while(attachment=1)
 {
     System.out.println("Action %d: "+i++);
	 System.out.println("Scan for the normal systolic and diastolic round trip time: ");
     //scanf("%f %f", &norm_sys_rtt,&norm_dias_rtt);
	 norm_sys_rtt = d.nextFloat();
	 norm_dias_rtt = d.nextFloat();
	 System.out.println("Scan for the fat systolic and diastolic round trip time: ");	 
	 //scanf("%f %f", &fat_sys_rtt,&fat_dias_rtt);
	 fat_sys_rtt = d.nextFloat();
	 fat_dias_rtt = d.nextFloat();
	 if(norm_sys_rtt>3.7 && norm_sys_rtt<=4.1)
	 {
		 sys_dia=Dia_calc_sys(norm_sys_rtt,US_vel);
		 System.out.println("The roundtrip time obtained is normal and hence the systolic blood vessel diameter: "+sys_dia);		 
	 }	
	 
     if(norm_dias_rtt>4.8 && norm_dias_rtt<=5.1)
	 {
		 dias_dia=Dia_calc_dias(norm_dias_rtt,US_vel);
		 System.out.println("The roundtrip time obtained is normal and hence the diastolic blood vessel diameter: "+dias_dia);		 
	 }	 
	 
	 if(norm_sys_rtt <=3.7 && (fat_sys_rtt>4.1 && fat_sys_rtt<4.4))
	 {
		 sys_dia=Dia_calc_sys(norm_sys_rtt,US_vel);
		 System.out.println("The roundtrip time obtained is reduced due to plaque and hence the systolic blood vessel diameter: "+sys_dia);	
	 }
	 List<float> sys_rtt = new ArrayList<float>;
	 int count_sys = 0;
	 while(1){
         int j=0;
	 float[] store_sys;
	 store_sys[i] = sys_rtt.(sys_dia);
		 if(store_sys[i]<=3.7)
		 {
			count_sys++;
			 if(count_sys>5)
			 {
			   System.out.println("Alert Message to Doctor");	 
			 }
		 }
	 Collections.sort(sys_rtt);
	 j++
	 }
	 if(norm_dias_rtt <=4.8 && (fat_dias_rtt>5.1 && fat_dias_rtt<5.4))
	 {
		 dias_dia=Dia_calc_dias(norm_dias_rtt,US_vel);
		 System.out.println("The roundtrip time obtained is reduced due to plaque and hence the diastolic blood vessel diameter: "+dias_dia);	
	 }
	  List<float> dias_rtt = new ArrayList<float>;
	  int count_dias = 0;
	 while(1){
	 int k=0;
	 float[] store_dias;
	 store_dias[i] = dias_rtt.(dias_dia);
		  if(store_dias[i]<=4.8)
		 {
			count_dias++;
			 if(count_dias>5)
			 {
			   System.out.println("Alert Message to Doctor");	 
			 }
		 }
	 Collections.sort(dias_rtt);
	 k++;
	 }
         System.out.println("Scan for blood pressure by nanorobot\n");
         cardiac_op = blood_pressure(sys,dias);
         System.out.println("The cardiac output: "+cardiac_op);
		 if(cardiac_op>=7 || cardiac_op<=4)
		 {
			 System.out.println("The nanorobot is detached from the blood vessel\n");
			 cardiac_op = navigation(cardiac_op);
             System.out.println("The cardiac output: "+cardiac_op);
             dia=2900;
             System.out.println("Now the diameter of the blood vessel: "+dia);
             if(cardiac_op<7 || cardiac_op>4)
             {
                 plaque_removed = 1;
	             plaque_removal = 0;
                 System.out.println("The plaque has been removed: "+plaque_removed);	
             }
			 attachment=1;
             System.out.println("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
             System.out.println("MicroSONAR is turned ON\n");
             System.out.println("Scan for the velocity of Ultrasound in Blood: ");
             //scanf("%d",&US_vel);
			 US_vel = d.nextInt();
		 }

	 if(sys_dia<=2900 && dias_dia<=3800)
	 {
		 attachment=0;
		 System.out.println("MicroSONAR is turned OFF\n");
		 System.out.println("The nanorobot is detached from the blood vessel\n");
		 cardiac_op= nano_surgery(sys_dia);
		 System.out.println("The cardiac output: "+cardiac_op); 
         sys_dia=3100;
		 dias_dia=4000;
         System.out.println("Now the systolic diameter of the blood vessel: \n"+sys_dia);
		 System.out.println("Now the diastolic diameter of the blood vessel: \n"+dias_dia);
         if(cardiac_op<7 || cardiac_op>4)
         {
            plaque_removed = 1;
	        plaque_removal = 0;
            System.out.println("The plaque has been removed: +\n"+plaque_removed);	
         }
		 attachment=1;
         System.out.println("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
         System.out.println("MicroSONAR is turned ON\n");
         System.out.println("Scan for the velocity of Ultrasound in Blood: ");
         //scanf("%d",&US_vel);
		 US_vel = d.nextInt();
	 }
	 System.out.println("\n");
 }
 //return 0;
 }
 
public static int blood_pressure(int sys,int dia)
{
    int cardiac_op;
	int bp;
	int stroke_vol;
	Scanner d = new Scanner(System.in);
	System.out.println("Scan for Systolic and diastolic blood pressure: ");
	//scanf("%d %d",&sys,&dia);
	sys = d.nextInt();
	dia = d.nextInt();
	bp = (2*sys + dia)/3;
	cardiac_op = bp/resistance;
	int heart_beat = heart_beat(cardiac_op, stroke_vol);
	System.out.println("The heart beat: "+ heart_beat);
	return cardiac_op;
}

public static int heart_beat(int cardiac_op, int stroke_vol)
{
	int end_sys_vol = 120;
    int end_dias_vol = 50;
    int stroke_vol = end_sys_vol - end_dias_vol;
	int heart_beat = (cardiac_op*1000)/stroke_vol;
	return heart_beat;
}

public static int Dia_calc_sys(float norm_sys_rtt, int US_vel)
{
		System.out.println("Systolic pressure occurs due to Vasoconstriction\n");
		int dia_cal = (norm_sys_rtt*US_vel)/2;	 	
	    return dia_cal;
}

public static int Dia_calc_dias(float norm_dias_rtt, int US_vel)
{
	    System.out.println("Diastolic pressure occurs due to Vasodialation\n");
		int dia_cal = (norm_dias_rtt*US_vel)/2;
		return dia_cal;
}

public static int nano_surgery(int dia)
{
    int cardiac_op;
    int sys, dias;
    System.out.println("\n");
    System.out.println("Procedure: "+j++);
	while(dia<2900)
   {
    plaque_removal=1;
	System.out.println("Surgery in process "+plaque_removal);
	dia++;
   }
   System.out.println("The plaque has been removed\n");
   System.out.println("Scan for BP\n");
   cardiac_op = blood_pressure(sys,dias);
   return cardiac_op;
}

public static int navigation(int cardiac_op)
{
    Scanner d = new Scanner(System.in);
	int dia;
    if(cardiac_op>=7)
  {
   System.out.println("More Cardiac Output, Check for Diameter\n");
   char direction_left[10] = "Left";
   System.out.println("Direction of nanorobot traversal: %s\n"+ direction_left);
   System.out.println("Scan for blood vessel diameter: ");
   //scanf("%d",&dia);
   dia = d.nextInt();
   System.out.println("\n");
   while(dia>=2900)
   {
   System.out.println("Scan for blood vessel diameter: ");
   //scanf("%d",&dia);
   dia = d.nextInt();
   System.out.println("\n");
   }
   cardiac_op = nano_surgery(dia);
  }
  else if(cardiac_op<=4)
  {
   System.out.println("Less Cardiac Output, Check for Diameter\n");
   char direction_right[10] = "Right";
   System.out.println("Direction of nanorobot traversal: \n"+ direction_right);
   System.out.println("Scan for blood vessel diameter: ");
   //scanf("%d",&dia);
   dia = d.nextInt();
   System.out.println("\n");
   while(dia>=2900)
   {
   System.out.println("Scan for blood vessel diameter: ");
   //scanf("%d",&dia);
   dia = d.nextInt();
   System.out.println("\n");
   }
   cardiac_op = nano_surgery(dia);    
  }
  	return cardiac_op;
}
}
