interface I1{
	I2 printer();
}
interface I2{
	I3 show();
}
interface I3{
	void display();
}


class C1 implements I1{
	public I2 printer(){
		System.out.println("printer");
		return new C2();
	}
}


class C2 implements I2{
	public I3 show(){
		System.out.println("show");
		return new C3();
	}
}


class C3 implements I3{
	public void display(){
		System.out.println("Display");
	}
}


class Factory{
	public static I1 getInstance(){
		return new C1();

	}
}



class MATester{
	public static void main(String[]args){
		I1 i1= Factory.getInstance();
		I2 i2 = i1.printer();
		I3 i3 = i2.show();
		i3.display();
	}
}
