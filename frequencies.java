class StringAlgo{
	void printFrequency(String s){
		for(int i=0; i<s.length(); i++){
			int count=0;
			if(s.charAt(i)==' ')continue;
			for(int j=0; j<s.length(); j++){
				if((j<i)&&(s.charAt(i)==s.charAt(j))){
					break;
				}else if((j>=i)&&(s.charAt(i)==s.charAt(j))){
					count++;
			}
			if(count>0){
				System.out.println(s.charAt(i)+" "+count);
			}
		}
	}
}

