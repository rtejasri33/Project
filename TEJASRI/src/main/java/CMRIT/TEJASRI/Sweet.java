package CMRIT.TEJASRI;


public class Sweet extends Gift {
	private Gift[] s1=new Gift[4];
	public void getList(Gift[] s) {
		for(int i=0;i<4;i++) 
			this.s1[i]=s[i];
	}
	public void sort() {
		Gift temp;
		for(int i =0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				if (s1[i].fatPercentageOfSweet>s1[j].fatPercentageOfSweet){
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
	}
	public void display() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("         The gifts are sorted based on Fat Percentage of Sweets         ");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("     S.No"+"\t"+"Name"+"\t"+"Weight"+"\t"+"Fat Percentage"+"\t"+"Cost of item     ");
		System.out.println("------------------------------------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println("     "+(i+1)+"\t\t"+s1[i].nameOfSweet+"\t"+s1[i].weightOfSweet+"g\t"+s1[i].fatPercentageOfSweet+"g\t\tRs."+s1[i].costOfSweet);
		}
		System.out.println("------------------------------------------------------------------------");
	}
		
}

