/*class ReplaceEvenOdd{
	static String swap(String s){
		char[] s1= s.toCharArray();
		
		for(int i=0;i<s1.length-1;i+=2){
			char temp = s1[i];
			s1[i]=s1[i+1];
			s1[i+1]=temp;
		}
		return new String(s1);
	}
	public static void main(String[] args){
		String s = "abcd";
		System.out.println(swap(s));
	}
}*/

/*class replace{
	public static void main(String[] args){
		String s = "CIVICS";
		String s2= "";
		System.out.println(s);
		for(int i=0; i<s.length();i=i+2){
			s2+=s.charAt (i+1);
			s2+=s.charAt (i);
		}	
		System.out.println(s2);
	}
}*/
import java.lang.*;
class JavaStringsQuiz 
{
    public static void main(String[] args) 
    {
        String str = "  Java\tConceptby\tCDAC\tMUMBAI    ";
        
        System.out.println(str.strip());
    }
}
