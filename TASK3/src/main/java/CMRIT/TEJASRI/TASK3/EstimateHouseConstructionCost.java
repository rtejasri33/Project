package CMRIT.TEJASRI.TASK3;
import java.util.Scanner;

public class EstimateHouseConstructionCost {
	void getConstructionCost() {
		Scanner scannerObject = new Scanner(System.in); 
	    System.out.format("\n"+"%s","Select Material Standard:"+"\n"+"1.Standard Materials 2.Above Standard Materials 3.High Standard Materials");
	    int choiceOfMaterialStandard= scannerObject.nextInt();
	    int choiceOfFullyAutomatedHouse=0;
	    if(choiceOfMaterialStandard==3) {
	    	System.out.format("%s","Do you want Fully Automated House:"+"\n"+"1.Yes 2.No");
	    	choiceOfFullyAutomatedHouse= scannerObject.nextInt();
	    }
	    System.out.format("%s","Enter total area of the House");
	    double TotalAreaOfHouse=scannerObject.nextDouble();
	    double finalConstructionCost=0;
	    switch(choiceOfMaterialStandard) {
	    case 1:  finalConstructionCost = TotalAreaOfHouse*1200;break;
	    case 2:  finalConstructionCost = TotalAreaOfHouse*1500;break;
	    case 3:  
	    	if(choiceOfFullyAutomatedHouse==1) {
	    		finalConstructionCost=TotalAreaOfHouse*2500;break;
	    	}
	    	else if(choiceOfFullyAutomatedHouse==2) {
	    		finalConstructionCost=TotalAreaOfHouse*1800;break;
	    	}
	    	else {
	    		System.out.format("\n"+"%s","Please select a valid option");break;
	    	}	
	    default: System.out.format("\n"+"%s","Please select a valid option");	
	    }
	    
	    System.out.format("%s","Estimated House Construction cost:");
	    System.out.format("%.2f",finalConstructionCost);
	    scannerObject.close();
	}
}
