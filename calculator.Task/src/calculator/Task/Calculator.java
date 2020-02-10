package calculator.Task;

import java.util.Scanner;

public class Calculator {
	public char sym;
	public int number1;
	public int number2;

	public void operation(char symbol,int num1,int num2) {
		this.sym=symbol;
		this.number1=num1;
		this.number2=num2;
		if (sym=='+'){
			System.out.println(number1+number2);
		}
		else if (sym=='-'){
			System.out.println(number1-number2);
		}
		else if (sym=='*'){
			System.out.println(number1*number2);
		}
		else if (sym=='/'){
			try {
				System.out.println(number1/number2);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("Invalid operation");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter + for Addition\nEnter - for Subtraction\nEnter * for Multiplication\nEnter / for division");
		int contiune;
		char symbol;
		do {
		System.out.println("Enter the numbers to perform calculaton");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter the Operation to perform: ");
		symbol=scan.next().charAt(0);
		c.operation(symbol,num1,num2);
		System.out.println("Press any number from 1-9 to continue Except 0");
		contiune=scan.nextInt();
		}while(contiune!=0);
		scan.close();
	}
}


