package Cmrit.Tejasri.Tdd_and_Junit;

public class RemoveAFromFirst2Charecters {

	public String removeA(String string) {
		String result = string;
    	if(string == "" || string == "A" || string == "AA") 
    		result = "";	
    	else if(string.length() > 1){
    		char firstChar = string.charAt(0);
    		char secondChar = string.charAt(1);
    		if(firstChar == 'A' && secondChar == 'A') 
    			result = string.substring(2);   				
       		else if(firstChar == 'A' && secondChar != 'A') 
    			result = string.substring(1);
    		else if(secondChar == 'A')
    			result = "" + firstChar + string.substring(2);
    	}
    	return result;
	}

}
