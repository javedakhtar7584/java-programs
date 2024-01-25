class StringAlgo{
	String reverseString(String s){
		char[] ca= s.toCharArray();
		int i=0, j=ca.length-1;
		char temp;
           		while(i<j){
	        	temp=ca[i];
		       ca[i]=ca[j];
			ca[j]=temp;
			i++;
			j--;
		}
		return new String(ca);

	}
}


class StringTest{
	public static void main(String[]args){
		String s="lucknkow";
		StringAlgo sal=new StringAlgo();
		String result=sal.reverseString(s);
		System.out.println(result);
	}
}
