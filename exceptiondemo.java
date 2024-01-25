import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x,y,z=0;
		System.out.println("enter numerator");
		x=sc.nextInt();
		System.out.println("enter denominator");
		y=sc.nextInt();
		z=x/y;
		System.out.println("result="+z);
	}

}



/*import java.util.Scanner;
	class ExceptionDemo{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int [] arr={5,7,9,8,4,3};
			int n;
			System.out.println("enter count");
			n=sc.nextInt();
			for(int i=0; i<n; i++){
				System.out.println(arr[i]);
			}
		}
	}
*/



/*import java.io.*;
import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		String path;
		System.out.println("enter file name with path");
		path= sc.nextLine();
		try{
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		}catch(FileNotFoundException cnf){
			cnf.printStackTrace();
		}
	}
}*/































