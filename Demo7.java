/*
A class has an integer data member 'i' and a method named 
'printNum' to print thevalue of 'i'. Its subclass also has an 
integer data member 'j' and a method named 'printNum' to print 
the value of 'j'. Make an object of the subclass and use it to 
assign a value to 'i' and to 'j'. Now call the method 'printNum' 
by this object.
*/

class A{
	static int i;
	static void printNum(int i){
		System.out.println("value of i is: "+i);
	
	}
}

class B extends A{
	static int j;
	static void printNum(int j){
		System.out.println("value of j is: "+j);
	}
	
}

class Demo7{
	public static void main(String[] args){
		A a = new A();
		a.printNum(10);
		
		B b = new B();
		b.printNum(20);
	}
}