package CMRIT.TEJASRI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate s1=new Chocolate("KitKat",12.5,40,25);
		Chocolate s2=new Chocolate("Milky",8.1,25,20);
		Cookies c1=new Cookies("Unibic",23.7,100,22);
		Cookies c2=new Cookies("Chunk",26.8,100,50);
		Gift []s=new Gift[4];
		s[0]=s1;
		s[1]=s2;
		s[2]=c1;
		s[3]=c2;
		Sweet g=new Sweet();
		g.getList(s);
		g.sort();
		g.display();

	}

}
