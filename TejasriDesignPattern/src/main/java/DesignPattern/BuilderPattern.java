package DesignPattern;
class McMeal {
	private String MealType;
	private String MealSize;

	McMeal(String MealType,String MealSize ){
		this.MealType = MealType;
		this.MealSize = MealSize;
	}
	
	void BillOfYourOrder() {
		System.out.println("--------------------------------");
		System.out.println("           McDonald's        ");
		System.out.println("--------------------------------");
		System.out.println("Meal Type\t\t"+MealType);
		System.out.println("Meal Size\t\t"+MealSize);
		System.out.println("Coke     \t\t"+MealSize); // Additional you will get
		System.out.println("FrenchFries \t\t"+MealSize); // Additional you will get
		System.out.println("--------------------------------");
	}
}
public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		McMeal M1 = new McMeal("Veg","Small");
		System.out.println("Order 1");
		M1.BillOfYourOrder();
		System.out.println();
		
		McMeal M2 = new McMeal("Veg","Medium");
		System.out.println("Order 2");
		M2.BillOfYourOrder();
		System.out.println();
		
		McMeal M3 = new McMeal("Non-Veg","Large");
		System.out.println("Order 3");
		M3.BillOfYourOrder();

	}

}