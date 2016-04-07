#include<stdio.h>
#include<stdlib.h>

int resistance = 20;
int plaque_removal=0;
int plaque_removed =0;

int blood_pressure(int sys,int dia)
{
    int cardiac_op;
	int bp;
	printf("Scan for Systolic and diastolic blood pressure: ");
	scanf("%d %d",&sys,&dia);
	bp = (2*sys + dia)/3;
	cardiac_op = bp/resistance;
	return cardiac_op;
}

int nano_surgery(int dia)
{
    int cardiac_op;
    int sys, dias;
	while(dia<2500)
   {
    plaque_removal=1;
	printf("%d\n",plaque_removal);
	dia++;
   }
   printf("The plaque has been removed\n");
   printf("Scan for BP\n");
   cardiac_op = blood_pressure(sys,dias);
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
 int sys, dias;
 
 printf("The nanorobot is in human body\n");
 if(attachment==0 || attachment==1)
 {
 printf("Scan for blood velocity: ");
 scanf("%d",&blood_vel);
 if(blood_vel>=20 && blood_vel<=25)
   veh_vel=30;
 else{veh_vel=35;}
 printf("Scan for blood vessel diameter: ");
 scanf("%d",&dia);
 if(dia>=3100 && dia<=4000)
 {
  printf("In Coronary Artery\n");
  printf("Scan for BP\n");
  cardiac_op = blood_pressure(sys,dias);
  printf("The cardiac output: %d\n",cardiac_op);
  if(cardiac_op>=7)
  {
   printf("More Cardiac Output, Check for Diameter\n");
   char direction_left[10] = "Left";
   printf("Direction of nanorobot traversal: %s\n",direction_left);
   printf("Scan for blood vessel diameter: ");
   scanf("%d",&dia);
   cardiac_op = nano_surgery(dia);
   printf("The cardiac output: %d\n",cardiac_op);
  }
  else if(cardiac_op<=4)
  {
   printf("Less Cardiac Output, Check for Diameter\n");
   char direction_right[10] = "Right";
   printf("Direction of nanorobot traversal: %s\n",direction_right);
   printf("Scan for blood vessel diameter: ");
   scanf("%d",&dia);
   cardiac_op = nano_surgery(dia);
   printf("The cardiac output: %d\n",cardiac_op); 
  }
  if(cardiac_op<7 || cardiac_op>4)
   {
    plaque_removed = 1;
	plaque_removal = 0;
    printf("The plaque has been removed: %d\n",plaque_removed);	
   }
   /*else
   {
	 while(dia<3000)
     {
      plaque_removal=1;
	  printf("%d\n",plaque_removal);
	  dia++;
     }  
	 plaque_removed = 1;
	 plaque_removal = 0;
     printf("The plaque has been removed: %d\n",plaque_removed);
	 printf("Scan for BP\n");
     cardiac_op = blood_pressure(sys,dias);
     printf("The cardiac output: %d\n",cardiac_op);
   }*/
  }
 }
 attachment=1;
 printf("The nanorobot has been successfully attached to the walls of the Coronary Artery\n");
 return 0;
}
