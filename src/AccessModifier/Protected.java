package AccessModifier;

public class Protected extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Protected obj=new Protected();
		int op=obj.val;
		System.out.println("value"+op);
		obj.method2();
		

	}

}
