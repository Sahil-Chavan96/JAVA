/*
class Student{
	String name;
	int roll_no;
	
	Student(String name, int roll_no){
		this.name=name;
		this.roll_no=roll_no;
		
	}
}

class StudentDetails{
	public static void main(String[] args){
	Student s1 = new Student("John",2);
	
	System.out.println(s1.name+" "+s1.roll_no);
	}
}


class Student{
	String name;
	int roll_no;
	String address;
	String phoneno;
	
	
	Student(String name, int roll_no,String address,String phoneno){
		this.name=name;
		this.roll_no=roll_no;
		this.address=address;
		this.phoneno=phoneno;
	}
}

class StudentDetails{
	public static void main(String[] args){
	Student s1 = new Student("John",2,"USA","9865321472");
	Student s2 = new Student("Sam",3,"RUSSIA","4584946125");
	
	System.out.println(s1.name+" "+s1.roll_no+" "+s1.address+" "+s1.phoneno);
	System.out.println(s2.name+" "+s2.roll_no+" "+s2.address+" "+s2.phoneno);
	}
}


class TriangleDetails{
	int a,b,c;
	
	public void area(){
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}
	public double perimeter(){
		return (a+b+c);
	}
}

class Triangle{
	public static void main(String[] args){
		TriangleDetails t = new TriangleDetails();
		t.a=3;
		t.b=4;
		t.c=5;
		t.area();
		System.out.println(t.perimeter());
		
	}
}



class TriangleDetails{
	int a,b,c;
	
	TriangleDetails(int side1,int side2,int side3){
		a=side1;
		b=side2;
		c=side3;
	}
	public void area(){
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}
	public double perimeter(){
		return (a+b+c);
	}
}

class Triangle{
	public static void main(String[] args){
		TriangleDetails t = new TriangleDetails(3,4,5);
		t.area();
		System.out.println(t.perimeter());
	}
}



class RectangleDetails{
	int length;
	int breadth;
	
	RectangleDetails(int l,int b){
		length=l;
		breadth=b;
	}
	public double Area(){
		return length*breadth;
	}
}

class Rectangle{
	public static void main(String[] args){
		RectangleDetails r = new RectangleDetails(4,5);
		System.out.println(r.Area());
		
		RectangleDetails r1 = new RectangleDetails(5,8);
		System.out.println(r1.Area());
	}
}


import java.util.Scanner;
class Area{
	int length;
	int breadth;
	
	void setDim(int l,int b){
		length=l;
		breadth=b;
	}
	
	double get_Area(){
		return length*breadth;
	}
	
	public static void main(String[] args){
		
		Area a1 = new Area();
	  int l,b;
     Scanner s=new Scanner(System.in);
	 
     System.out.println("Enter length"); 
     l=s.nextInt();
	 
     System.out.println("Enter breadth");
     b=s.nextInt();
	 
     a1.setDim(l,b);
	 
	 System.out.println("Area is : "+a1.get_Area());
	}
}


import java.util.Scanner;
class RectangleDetails{
	int length;
	int breadth;
	
	RectangleDetails(int l,int b){
		length=l;
		breadth=b;
	}
	public double Area(){
		return length*breadth;
	}
}

class Rectangle{
	public static void main(String[] args){
	 int l,b;
     Scanner s=new Scanner(System.in);
	 
     System.out.println("Enter length"); 
     l=s.nextInt();
	 
     System.out.println("Enter breadth");
     b=s.nextInt();
	 
     RectangleDetails a=new RectangleDetails(l,b);
	 
	 System.out.println(a.Area());
	}
}


import java.util.Scanner;
class Average{
	
	double Avg(int a,int b,int c){
		return (a+b+c)/3;
	}
	
	public static void main(String[] args){
		Average a1 = new Average();
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number; "); 
        a=s.nextInt();
		System.out.println("Enter second number; "); 
		b=s.nextInt();
		System.out.println("Enter third number; "); 
		c=s.nextInt();
		
		a1.Avg(a,b,c);
		System.out.println("Average is : "+a1.Avg(a,b,c));
		
	}
}*/
/*
import java.util.*;
class Complex{
	int real;
	int imag;
	
	Complex(int r,int i){
		real = r;
		imag = i;
	}
	
	
}*/

class Employee{
	
}