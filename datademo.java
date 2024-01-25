class DataDemo{
	int x=10;
	float y=3.5f;
	String z="lucknow";
	void printer(){
	System.out.println(x+" "+y+" "+z);
	}
}

class DemoTest{
	public static void main(String[]args){
		DataDemo dd= new DataDemo();
		DataDemo d2 = new DataDemo();
	/*	System.out.println(dd.x);
		System.out.println(dd.y);
		System.out.println(dd.z);*/
		dd.x=15;
		dd.y=37.29f;
		dd.z="javed akhtar";
		dd.printer();
		d2.printer();
	}
}
