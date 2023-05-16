package AccessModifier;


class B{
	int a =100;
	public void method1() {
		System.out.println("Inside method1 ");
	}
	protected int val=123;
	protected void method2() {
		
		System.out.println("Inside method 2");
	}
	
	
	
	
}

public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj=new B();
		int x=obj.val;
		System.out.println("value"+x);
		obj.method1();
		obj.method2();
		

	}

}
