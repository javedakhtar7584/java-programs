class RecursionDemo{
	int fact(int x, int n){
		if(n==0)return 1;
		if(n==1)return x;
		return x* power(x,n-1);
	}
}

class RecursionTest{
	public static void main(String[]args){
		RecursionDemo rd= new RecursionDemo();
		int result = rd.power(2,3);
		System.out.println(result);
	}
}
