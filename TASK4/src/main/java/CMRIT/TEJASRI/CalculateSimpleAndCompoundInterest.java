package CMRIT.TEJASRI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateSimpleAndCompoundInterest 
{
   private static final Logger LOGGER=LogManager.getLogger(CalculateSimpleAndCompoundInterest.class);
   void getSimpleAndCompoundInterest(double principalAmount,double timeInYears,double rateOfInterest)
   {
	   double simpleInterest = (principalAmount*timeInYears*rateOfInterest)/100;
       LOGGER.info("Simple Interest: Rs."+simpleInterest);
	   double compoundInterest=0;
	   int i;
	   for(i=0;i<timeInYears;i++) {
		   if(timeInYears-i>=1)
			   compoundInterest=compoundInterest+((principalAmount+compoundInterest)*rateOfInterest)/100;
		   else
			   compoundInterest=compoundInterest+((principalAmount+compoundInterest)*(timeInYears-i)*rateOfInterest)/100;
	   }
	   LOGGER.info("Compound Interest: Rs."+compoundInterest);
	   }
   
}
