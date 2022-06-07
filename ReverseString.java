/*class StringFormat{
	static String reverse(String s){
		char ch[]=s.toCharArray();
		String r="";
		for (int i=ch.length-1;i>=0;i--){
			r+=ch[i];
		}
		return r;
	}
}

class ReverseString{
	public static void main(String[] args){
		System.out.println(StringFormat.reverse("My name is Khan"));
	}
}*/

class Reverse{
	public static void main(String[] args){
		String s="CDAC KHARGHAR";
		
		String s1="";
		
		for (int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}