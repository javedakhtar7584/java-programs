class MyClass{
	int a;
	float b;
	boolean c;
	String d;
	public static void main(){
		System.out.println(a+" "+b+" "+c+" "d);
	}
	MyClass(){
		a=20;
		b=3.5f;
		c=true;
		d="lucknow";
	}
}


class Tester{
	public static void main(String[] args){
		MyClass m = new MyClass();
		m.show();
	}
}
