interface MyInterface{
	public static final  int x=10;
	public abstract void printer();
}

class InterfaceDemo implements MyInterface{
	public static	int x=20;
	public  void printer(){
		System.out.println("printer method");
	}
}

class Itest{
	public static void main(String[]args){
		InterfaceDemo id= new InterfaceDemo();
			/*id.printer();
			System.out.println(id.x);*/
			//MyInterface.x(20);
			System.out.println(id.x);
			System.out.println(MyInterface.x);
			System.out.println(InterfaceDemo.x);
	}
}
