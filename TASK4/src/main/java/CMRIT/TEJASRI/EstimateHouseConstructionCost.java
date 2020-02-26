package CMRIT.TEJASRI;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EstimateHouseConstructionCost {
	private static final Logger LOGGER=LogManager.getLogger(EstimateHouseConstructionCost.class);
	void getConstructionCost() {
		Scanner scannerObject = new Scanner(System.in); 
	    LOGGER.info("Select Material Standard:"+"\n"+"1.Standard Materials 2.Above Standard Materials 3.High Standard Materials");
	    int choiceOfMaterialStandard= scannerObject.nextInt();
	    LOGGER.info("You have selected option: "+choiceOfMaterialStandard);
	    
	    if(choiceOfMaterialStandard>0 && choiceOfMaterialStandard<4) {
		    int choiceOfFullyAutomatedHouse=0;
		    if(choiceOfMaterialStandard==3) {
		    	LOGGER.info("Do you want Fully Automated House:"+"\n"+"1.Yes 2.No");
		    	choiceOfFullyAutomatedHouse= scannerObject.nextInt();
		    	LOGGER.info("You have selected option: "+choiceOfFullyAutomatedHouse);
		    	if(!(choiceOfFullyAutomatedHouse==1 || choiceOfFullyAutomatedHouse==2)) {
		    		LOGGER.info("Please select a valid option");
		    		System.exit(0);
		    	}
		    }
		    LOGGER.info("Enter total area of the House");
		    double TotalAreaOfHouse=scannerObject.nextDouble();
		    LOGGER.info("Total area of the House: "+TotalAreaOfHouse+"square feet");
		    double finalConstructionCost=0;
		    switch(choiceOfMaterialStandard) {
		    case 1:  finalConstructionCost = TotalAreaOfHouse*1200;break;
		    case 2:  finalConstructionCost = TotalAreaOfHouse*1500;break;
		    case 3:  
		    	finalConstructionCost=(choiceOfFullyAutomatedHouse==1)?(TotalAreaOfHouse*2500):(TotalAreaOfHouse*1800);break;	
		    }
		    LOGGER.info("Estimated House Construction cost: Rs."+finalConstructionCost);
	    }
	    else 
    		LOGGER.info("Please select a valid option");
	    
	   scannerObject.close();
	}
}
