/*
We have to calculate the percentage of marks obtained in three 
subjects (each out of 100) by student A and in four subjects 
(each out of 100) by student B. Create an abstract class 'Marks' 
with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name 
which returns the percentage of the students. The constructor of 
student A takes the marks in three subjects as its parameters and 
the marks in four subjects as its parameters for student B. Create 
an object for eac of the two classes and print the percentage of 
marks for both the students.
*/

abstract class Marks{
	abstract void getPercentage();
}
class A extends Marks{
	int m1;
	int m2;
	int m3;
	
	A(int m1, int m2, int m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	void getPercentage(){
		float avg;
		avg = (m1+m2+m3)/3;
		
		System.out.println("Avg marks of student A is: "+avg);
	}
	
}
class B extends Marks{
	int m1;
	int m2;
	int m3;
	int m4;
	
	B(int m1, int m2, int m3, int m4){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	void getPercentage(){
		float avg;
		avg = (m1+m2+m3+m4)/4;
		
		System.out.println("Avg marks of student B is: "+avg);
	}
}

class Demo3{
	public static void main(String[] args){
		A a = new A(75,96,64);
		B b = new B(85,63,78,92);
		
		a.getPercentage();
		b.getPercentage();
	}
}