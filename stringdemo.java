class StringDemo{
	public static void main(String[]args){
		String s1="lucknow";
		String s3="lucknow";
		String s2= new String("lucknow");
		String s4=new String("lucknow");
		System.out.println(s1);
		System.out.println(s2);
		boolean b1= (s1==s3);
		boolean b2=(s2==s4);
		boolean b3=(s1==s4);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

