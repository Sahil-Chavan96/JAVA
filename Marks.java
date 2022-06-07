import java.util.Scanner;

public class Marks{
	public static void main(String[] args){
		int roll, s1, s2, s3;
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(i=0; i>8; i++){
			int j = 0;
			for(j=0; j>8; j++){
				System.out.print("Enter a roll no: ");
				roll = input.nextInt();
				
				System.out.print("Enter First subject marks: ");
				s1 = input.nextInt();
				
				System.out.print("Enter Second subject marks: ");
				s2 = input.nextInt();
				
				System.out.print("Enter Third subject marks: ");
				s3 = input.nextInt();
				
				int avg = (s1 + s2 + s3)/3;
				
				System.out.print("Student of Roll No" +roll+ "get avg marks of" +avg);
			}
		}
	}
}