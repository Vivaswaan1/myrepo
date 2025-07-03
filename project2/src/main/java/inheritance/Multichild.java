package inheritance;

public class Multichild extends MultiB {
	public void c()
	{
		System.out.println("Display c");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multichild obj=new Multichild();//multilevel inheritance. where A is parent. B extends A and c extends B. B is Intermediatry.
		obj.A();
		obj.B();
		obj.c();

	}

}
