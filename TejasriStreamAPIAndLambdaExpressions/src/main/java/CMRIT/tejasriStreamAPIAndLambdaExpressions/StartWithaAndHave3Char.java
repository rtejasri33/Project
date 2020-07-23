package CMRIT.tejasriStreamAPIAndLambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class StartWithaAndHave3Char {
	
	private static void stringStartWithaAndHave3char(List<String> lst) {
		lst.stream()
		   .filter(str -> str.startsWith("a") && str.length() == 3)
		   .map(str -> str)
		   .forEach(str -> System.out.print(str + " "));
	}

	public static void main(String[] args) {
		
		/*
		 * The list contain -> ["abc","bcd","aka","che"]
		 * In the list Strings which are starting with 'a' and having length of 3 are -> ["abc","aka"]
		 * In the list Strings which are not starting with 'a' and don't having length of 3 are -> ["bcd","che"]
		 */
		
		List<String> lst = Arrays.asList("abc","bcd","aka","che");
		System.out.print("Strings starting with char 'a' and having a length of '3' are : ");
		stringStartWithaAndHave3char(lst);

	}
}
