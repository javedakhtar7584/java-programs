class Parent{
	public void printer(){
		System.out.println("show of parent");
	}

}

class child extends Parent {
	public void printer(){
		//super.printer();
		System.out.println("printer of child");
	}
	public void show(){
		System.out.println(" show of child x2");
	}
}

