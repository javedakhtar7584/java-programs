class MethodPtring{
	public static void main(String[]args){
		String s=" lucknow junction ";
		System.out.println(s.length());
		s=s.trim();
		System.out.println(s.length());
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
		s=s.toLowerCase();
		System.out.println(s);

		String s= "lucknow junction";
		char[] ca= s.toCharArray();
		for(int i=0; i<ca.length; i++){
			System.out.println(ca[i]+" ");
		}
		System.out.println();
		String s1= new String(ca);
		System.out.print(s1);


		String s=" lucknow junction";
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('n'));
	//	System.out.println(s.startstWith("luck"));
	//	System.out.println(s.endsWith("aom"));
	

		String s="lucknow junction";
		String s1= s.substring(4,7);
		System.out.println(s1);
		String s2= s.substring(4);
		System.out.println(s2);
		String s3= s.substring(12,16);
		System.out.println(s3);
	}
}
