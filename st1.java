class Parent{
	public void printer(){
		System.out.println("printer method of parent");
	}
}

class Child extends Parent{
	public void printer(){
		System.out.println("printer method of child");
	}
}

class Factory{
	public static Parent getInstance(){
		return new Child();
	}
}


class Tester{
	public static void main(String[]args){
		Parent p = Factory.getInstance();
		p.printer();
	}
}

