class RabinKarp{
	int hashCalculator(String s, int si, int li){
		int hash=0;
         	for(int i=si; i<=li; i++){
			hash=hash+s.charAt(i);
		}
		return (hash%13);
	}


    int matchPattern (String str, String ptr){
		int hashptr=hashCalculator(ptr,0,ptr.length()-1);
		int[] hash= new int[str.length()-ptr.length()+1];
		for(int i=0; i<=(str.length()-ptr.length()); i++){
			hash[i]=hashCalculator(str,i,i+ptr.length()-1);
		}

		for(int i=0; i<hash.length; i++){
			if(hash[i]==hashptr){
				int j=0;
				while(j<ptr.length()){
					if(str.charAt(i+j)!=ptr.charAt(j))break;
					j++;
				}
				if(j==ptr.length())return i;
			}
		}
		return -1;
	}
}

class hashCalculator{
	public static void main(String[]args){
	matchPattern pm= new matchPattern();
	int result=pm.RabinKarp("lucknow junction eeast","nct");
	if(result==-1){
		System.out.println("not found");
	}else{
		System.out.println("found at:"+result);
	}
    }
}
