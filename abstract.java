abstract class MyAbstract{
	MyAbstract(){
		System.out.println("called constructor");
	}

	abstract void printer();
	void show(){
		System.out.println("show mthod");
	}
}

class MynonAbstract extends MyAbstract{
	void printer(){
		System.out.println("method printer");
	}
}

class AbstractionTest{
	public static void main(String[]args){
		MyAbstract ma = new MynonAbstract();
		ma.show();
		ma.printer();
	}
}

class Factory{
	public static MyAbstract getInstance(){
		return new MynonAbstract();
	}
}
