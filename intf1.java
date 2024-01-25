interface I1{
	void printer();
}

class Myclass{
	public void m1(I1 i1){
		i1.printer();
	}
}


class Mclass implements I1{
	public void printer(){
		System.out.println("printer method");
	}
}

class Tester{
	public static void main(String[]args){
		Myclass c1 = new Myclass();
		c1.m1(new Mclass());
	}
}
