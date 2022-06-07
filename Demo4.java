/*
An abstract class has a construtor which prints "This is constructor
 of abstract class", an abstract method named 'a_method' and a 
 non-abstract method which prints "This is a normal method of 
 abstract class". A class 'SubClass' inherits the abstract class 
 and has a method named 'a_method' which prints "This is abstract 
 method". Now create an object of 'SubClass' and call the abstract 
 method and the non-abstract method. (Analyse the result)
*/
//abstract class
abstract class Cls{
	//abstract method
	abstract void a_method();
	
	//non-abstract method
	void n_method(){
		System.out.println("This is a normal method of abstract class");
	}
	
	Cls(){
		System.out.println("This is constructor of abstract class");
	}
}

class SubClass extends Cls{
	public void a_method(){
		System.out.println("This is abstract method");
	}
}

//main class
class Demo4{
	public static void main(String[] args){
		//create an object
		SubClass s = new SubClass();
		
		//call a method
		s.a_method();
		s.n_method();
	}
}