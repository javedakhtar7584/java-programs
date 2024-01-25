int naiveAlgo(String str, String pattern){
	int flag=0;
		ab:
		for(int i=0; i<=(Str.length()-pattern.length()); i++){
			flag=0;
			if(str.charAt(i)==pattern.charAt(0)){
				for(int j=1; j<pattern.length(); j++){
					if(str.charAt(i+j)!=pattern.charAt(j)){
						flag=-1;
						continue ab;
					}
				}
	             		if(flag==0)return i;
			}
		}
		return -1;
	}




class PatternMatching{
	public static void main(String[]args){
		PatternMatching pm= new PatternMatching();
		int result=pm.naiveAllgo("lucknow junction east","nct");
		if(result==-1){
			System.out.println("Not found");
		}else{
			System.out.println("found at:"+ result);
		}
}

