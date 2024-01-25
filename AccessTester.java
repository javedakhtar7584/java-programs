class DataPacket{
	private int a= 10;
	int b= 20;
	protected int c= 30;
	public  int d=450;
}
class AccessTester{
	public static void main(String[]args){
		DataPacket dx = new DataPacket();
		//System.out.println("a="+dp.a);
		//System.out.println("b="+dp.b);
		//System.out.println("c="+dp.c);
		//System.out.println("d="+dp.d);
		dx.printer();
       }
}
