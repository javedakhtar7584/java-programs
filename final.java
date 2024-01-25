/*class Parent{
	public final void printer(){
		System.out.println("printing parent final method");
	}
}*/

class Child {
	public final  void  printer(){
		System.out.println("printing child final method"); 
		final int x=10;
		//x= 20;
		System.out.println("x="+x);

	}
}

class Tester{
	public static void main(String[]args){
		Child c = new Child();
		c.printer();
	}
}

