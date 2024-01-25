class Myclass{
	private int x;
	public void setx(int x){
		this.x=x;
	}
	public int getx(){
		return x;
	}
	private Myclass(){}
	private static  Myclass instance;
	public static Myclass getInstance(){
		return instance;
	}

	static{
		instance =new Myclass();
	}

	public void printer(){
		System.out.println("printer method");
	}
}


class Tester{
	public static void main(String[]args){
		Myclass m = Myclass.getInstance();
		m.setx(10);
		System.out.println(m.getx());
		Myclass m1= Myclass.getInstance();
		System.out.println(m1.getx());
	}
}
