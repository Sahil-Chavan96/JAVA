class Palindrome{
	public static void main(String[] args){
		String s="civics";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		if(s.toLowerCase().equals(s1.toLowerCase())){
			System.out.println(s+" is palindrome.");
		}else{
			System.out.println(s+" is not palindrome.");
		}
	}
}

