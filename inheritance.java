class Parent{
	private void printer(){
		System.out.println("printer method");
	}

	public void show(){
		System.out.println("show methd");
	}

	Parent(int x){
		System.out.println("cons of parent");
	}
}



class Child extends Parent{
	Child(){
		super(5);
		System.out.println("cons of child");
	}

	public void display(){
		System.out.println("Display method");	
	}

	public void show(){
		System.out.println("show of child");
	}

}
