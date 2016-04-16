#include<stdio.h>
#include<stdlib.h>

int resistance = 20;
int plaque_removal=0;
int plaque_removed =0;
int j=1;

int blood_pressure(int sys,int dia)
{
    int cardiac_op;
	int bp;
	int stroke_vol;
	printf("Scan for Systolic and diastolic blood pressure: ");
	scanf("%d %d",&sys,&dia);
	bp = (2*sys + dia)/3;
	cardiac_op = bp/resistance;
	int heart_rate = heart_beat(cardiac_op, stroke_vol);
	printf("The heart beat: %d Beats\n", heart_rate);
	return cardiac_op;
}

int heart_beat(int cardiac_op, int stroke_vol)
{
	int end_sys_vol = 120;
    int end_dias_vol = 50;
    stroke_vol = end_sys_vol - end_dias_vol;
	int heart_beat = (cardiac_op*1000)/stroke_vol;
	return heart_beat;
}

int Dia_calc_sys(float norm_sys_rtt, int US_vel)
{
		printf("Systolic pressure occurs due to Vasoconstriction\n");
		int dia_cal = (norm_sys_rtt*US_vel)/2;	 	
	    return dia_cal;
}

int Dia_calc_dias(float norm_dias_rtt, int US_vel)
{
	    printf("Diastolic pressure occurs due to Vasodialation\n");
		int dia_cal = (norm_dias_rtt*US_vel)/2;
		return dia_cal;
}

int nano_surgery(int dia)
{
    int cardiac_op;
    int sys, dias;
    printf("\n");
    printf("Procedure %d:\n",j++);
	while(dia<2900)
   {
    plaque_removal=1;
	printf("Surgery in process %d\n",plaque_removal);
	dia++;
   }
   printf("The plaque has been removed\n");
   printf("Scan for BP\n");
   cardiac_op = blood_pressure(sys,dias);
   return cardiac_op;
}


int navigation(int cardiac_op)
{
	int dia;
    if(cardiac_op>=7)
  {
   printf("More Cardiac Output, Check for Diameter\n");
   char direction_left[10] = "Left";
   printf("Direction of nanorobot traversal: %s\n",direction_left);
   printf("Scan for blood vessel diameter: ");
   scanf("%d",&dia);
   printf("\n");
   while(dia>=2900)
   {
   printf("Scan for blood vessel diameter: ");
   scanf("%d",&dia);
   printf("\n");
   }
   cardiac_op = nano_surgery(dia);
  }
  else if(cardiac_op<=4)
  {
   printf("Less Cardiac Output, Check for Diameter\n");
   char direction_right[10] = "Right";
   printf("Direction of nanorobot traversal: %s\n",direction_right);
   printf("Scan for blood vessel diameter: ");
   scanf("%d",&dia);
   printf("\n");
   while(dia>=2900)
   {
   printf("Scan for blood vessel diameter: ");
   scanf("%d",&dia);
   printf("\n");
   }
   cardiac_op = nano_surgery(dia);    
  }
  	return cardiac_op;
}

int main (int argc, char* argv[])
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
 
 printf("The nanorobot is in human body\n");
 if(attachment==0 || attachment==1)
 {
 printf("Scan for blood vessel diameter: ");
 scanf("%d",&dia);
  
  if(dia>=8200 && dia<=10000)
  {
	  printf("The nanorobot is in Femoral artery\n");
	  printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=8 && blood_vel<=12)
      veh_vel=20;
      else if(blood_vel<8){veh_vel=16;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
	  while(dia>=8200 && dia<=10000)
	  {
		  printf("Scan for blood vessel diameter: ");
          scanf("%d",&dia);
		  printf("\n");
	  }
	  printf("The nanorobot moves out of Femoral artery\n");
	  printf("\n");
  }
  
  if(dia>=16000 && dia<=20000)
  {
  	  printf("The nanorobot is in Common Iliac artery\n");
      printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=24 && blood_vel<=28)
      veh_vel=36;
      else if(blood_vel<24){veh_vel=31;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
      while(dia>=16000 && dia<=20000)
	  {
		  printf("Scan for blood vessel diameter: ");
          scanf("%d",&dia);
		  printf("\n");
	  }
	  printf("The nanorobot moves out of Common Iliac artery\n");
	  printf("\n");
  }
 
 if(dia>=22000 && dia<=26000)
  {
	  printf("The nanorobot is in Abdominal aorta\n");
	  printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=8 && blood_vel<=12)
      veh_vel=20;
      else if(blood_vel<8){veh_vel=16;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
	  while(dia>=22000 && dia<=26000)
	  {
		  printf("Scan for blood vessel diameter: ");
          scanf("%d",&dia);
		  printf("\n");
	  }
	  printf("The nanorobot moves out of Abdominal aorta\n");
	  printf("\n");
  }
  
  if(dia>=26000 && dia<=30000)
  {
	  printf("The nanorobot is in Descending aorta\n");
	  printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=10 && blood_vel<=14)
      veh_vel=22;
      else if(blood_vel<10){veh_vel=14;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
	  while(dia>=26000 && dia<=30000)
	  {
		  printf("Scan for blood vessel diameter: ");
          scanf("%d",&dia);
		  printf("\n");
	  }
	  printf("The nanorobot moves out of Descending aorta\n");
	  printf("\n");
  }
  
  if(dia>=30000 && dia<=40000)
  {
	  printf("The nanorobot is in Aortic arch\n");
	  printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=13 && blood_vel<=17)
      veh_vel=25;
      else if(blood_vel<13){veh_vel=20;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
	  while(dia>=30000 && dia<=40000)
	  {
		  printf("Scan for blood vessel diameter: ");
          scanf("%d",&dia);
		  printf("\n");
	  }
	  printf("The nanorobot moves out of Aortic arch\n");
	  printf("\n");
  }
     
  if(dia>=20000 && dia<=24000)
  {
	  printf("The nanorobot is in Ascending aorta\n");
	  printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=9 && blood_vel<=13)
      veh_vel=20;
      else if(blood_vel<9){veh_vel=15;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
	  while(dia>=20000 && dia<=24000)
	  {
		  printf("Scan for blood vessel diameter: ");
          scanf("%d",&dia);
		  printf("\n");
	  }
	  printf("The nanorobot moves out of Ascending aorta\n");
	  printf("\n");
  }
  
  if(dia>=3100 && dia<=4000)
  {
      printf("The nanorobot is in Coronary Artery\n");
      printf("Scan for blood velocity: ");
      scanf("%d",&blood_vel);
      if(blood_vel>=20 && blood_vel<=24)
      veh_vel=32;
      else if(blood_vel<20){veh_vel=27;}
      else {veh_vel=35;}
      printf("The vehicle velocity: %d cm/sec\n",veh_vel);
      printf("Scan for BP\n");
      cardiac_op = blood_pressure(sys,dias);
      printf("The cardiac output: %d litres/min\n",cardiac_op);
      cardiac_op = navigation(cardiac_op);
      printf("The cardiac output: %d litres/min\n",cardiac_op);
      dia=2900;
      printf("Now the diameter of the blood vessel: %d\n",dia);
      if(cardiac_op<7 || cardiac_op>4)
      {
         plaque_removed = 1;
       	 plaque_removal = 0;
         printf("The plaque has been removed: %d\n",plaque_removed);	
      }
  }
 }
 attachment=1;
 printf("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
 printf("MicroSONAR is turned ON\n");
 printf("Scan for the velocity of Ultrasound in Blood: ");
 scanf("%d",&US_vel);
 printf("\n");
 while(attachment=1)
 {
     printf("Action %d:\n",i++);
	 printf("Scan for the normal systolic and diastolic round trip time: ");
     scanf("%f %f", &norm_sys_rtt,&norm_dias_rtt);
	 printf("Scan for the fat systolic and diastolic round trip time: ");	 
	 scanf("%f %f", &fat_sys_rtt,&fat_dias_rtt);
	 if(norm_sys_rtt>3.7 && norm_sys_rtt<=4.1)
	 {
		 sys_dia=Dia_calc_sys(norm_sys_rtt,US_vel);
		 printf("The roundtrip time obtained is normal and hence the systolic blood vessel diameter: %d micrometers\n",sys_dia);		 
	 }	
	 
     if(norm_dias_rtt>4.8 && norm_dias_rtt<=5.1)
	 {
		 dias_dia=Dia_calc_dias(norm_dias_rtt,US_vel);
		 printf("The roundtrip time obtained is normal and hence the diastolic blood vessel diameter: %d micrometers\n",dias_dia);		 
	 }	 
	 
	 if(norm_sys_rtt <=3.7 && (fat_sys_rtt>4.1 && fat_sys_rtt<4.4))
	 {
		 sys_dia=Dia_calc_sys(norm_sys_rtt,US_vel);
		 printf("The roundtrip time obtained is reduced due to plaque and hence the systolic blood vessel diameter: %d micrometers\n",sys_dia);	
	 }
	 
	 if(norm_dias_rtt <=4.8 && (fat_dias_rtt>5.1 && fat_dias_rtt<5.4))
	 {
		 dias_dia=Dia_calc_dias(norm_dias_rtt,US_vel);
		 printf("The roundtrip time obtained is reduced due to plaque and hence the diastolic blood vessel diameter: %d micrometers\n",dias_dia);	
	 }
	 
         printf("Scan for blood pressure by nanorobot\n");
         cardiac_op = blood_pressure(sys,dias);
         printf("The cardiac output: %d\n",cardiac_op);
		 if(cardiac_op>=7 || cardiac_op<=4)
		 {
			 printf("The nanorobot is detached from the blood vessel\n");
			 cardiac_op = navigation(cardiac_op);
             printf("The cardiac output: %d\n",cardiac_op);
             dia=2900;
             printf("Now the diameter of the blood vessel: %d micrometers\n",dia);
             if(cardiac_op<7 || cardiac_op>4)
             {
                 plaque_removed = 1;
	             plaque_removal = 0;
                 printf("The plaque has been removed: %d\n",plaque_removed);	
             }
			 attachment=1;
             printf("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
             printf("MicroSONAR is turned ON\n");
             printf("Scan for the velocity of Ultrasound in Blood: ");
             scanf("%d",&US_vel);
		 }

	 if(sys_dia<=2900 && dias_dia<=3800)
	 {
		 attachment=0;
		 printf("MicroSONAR is turned OFF\n");
		 printf("The nanorobot is detached from the blood vessel\n");
		 cardiac_op= nano_surgery(sys_dia);
		 printf("The cardiac output: %d litres/min\n",cardiac_op); 
         sys_dia=3100;
		 dias_dia=4000;
         printf("Now the systolic diameter of the blood vessel: %d micrometers\n",sys_dia);
		 printf("Now the diastolic diameter of the blood vessel: %d micrometers\n",dias_dia);
         if(cardiac_op<7 || cardiac_op>4)
         {
            plaque_removed = 1;
	        plaque_removal = 0;
            printf("The plaque has been removed: %d\n",plaque_removed);	
         }
		 attachment=1;
         printf("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
         printf("MicroSONAR is turned ON\n");
         printf("Scan for the velocity of Ultrasound in Blood: ");
         scanf("%d",&US_vel);
	 }
	 printf("\n");
 }
 return 0;
}
