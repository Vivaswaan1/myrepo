package inheritance;

public class Child extends Parent {
	
	public void show()
	{
		System.out.println("please show the method");
	}
	public static void main(String[] args)
	{
		Parent obj=new Parent();
		obj.display();  //when we call parent class using obj, only parent class properties are  shown.
		//when we call child class using obj, both the properties are displayed
		
		
/*Child obj=new Child();
obj.show();
obj.display();*/
}
}
