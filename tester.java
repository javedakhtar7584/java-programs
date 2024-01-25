class MyClass{
	private static MyClass m=null;
	private int age;
	private MyClass(int x){age=x;}
	void printer(){
		System.out.println(age);
	}
	public static MyClass getInstance(int a){
		if(m==null){
		MyClass m1 = new MyClass(a);
		}
		return m;
	}
}

class Tester{
	public  static void main(String[]args){
		MyClass m= MyClass.getInstance(20);
		m.printer();
		MyClass m2= MyClass.getInstance(15);
		m2.printer();
	}
}
