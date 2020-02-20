package CMRIT.TEJASRI.TASK3;


public class CalculateSimpleAndCompoundInterest 
{
   void getSimpleAndCompoundInterest(double principalAmount,double timeInYears,double rateOfInterest)
   {
	   double simpleInterest = (principalAmount*timeInYears*rateOfInterest)/100;
	   System.out.format("%s","Simple Interest:");
	   System.out.format("%.2f",simpleInterest);
	   System.out.format("\n");
	   double compoundInterest=0;
	   int i;
	   for(i=0;i<timeInYears;i++) {
		   if(timeInYears-i>=1)
			   compoundInterest=compoundInterest+((principalAmount+compoundInterest)*rateOfInterest)/100;
		   else
			   compoundInterest=compoundInterest+((principalAmount+compoundInterest)*(timeInYears-i)*rateOfInterest)/100;
	   }
	   System.out.format("%s","Compound Interest:");
	   System.out.format("%.2f",compoundInterest);
   }
   
}
