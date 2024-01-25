/*class ArrayDemo{
	public static void main(String[]args){
		int[] arr={2,3,5,9,14,8};
		int max=arr[0];
	//	int smax=arr[0];
		for(int i=1;i<arr.length; i++){
			if(max<arr[i]){
				max=arr[i];
			}
			//System.out.println(max+" ");
		}
		System.out.println(max);
	}
}*/


class ArrayDemo{
	public static void main(String[]args){
		int[] arr={2,3,5,9,14,8};
		int max=arr[0];
		int smax=arr[0];
		for(int i=1; i<length; i++){
			if(max<arr[i]){
			smax=max;
			max=arr[i];
		           }else{
		              	if(arr[i]>smax){
			            smax=arr[i];
		}
	System.out.println(smax);

      }
}
