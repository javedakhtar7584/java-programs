class MyClass{
	int a;
	String b;
	MyClass(){}
	MyClass(){a=10;b="kanpur";}
//	MyClass(int x){
//		a=x;
//	}
	MyClass(int x,String y){
		a=x;
		b=y;
	}
	public void show(){
		System.out.println(a+" "+b);
	}
}


class Tester{
	public static void main(String[] args){
		MyClass m1=new MyClass();
		MyClass m2= new MyClass();
		MyClass m3= new MyClass(15,"lucknow");
		m1.show();
		m2.show();
		m3.show();
	}
}
