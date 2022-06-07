/*
Suppose a class 'A' has a static method to print "Parent". 
Its subclass 'B' also has a static method with the same name to 
print "Child". Now call this method by the objects of the two 
classes. Also, call this method by an object of the parent class 
refering to the child class i.e. A obj = new B()
*/

class A{
	static void printMethod(){
		System.out.println("Parent");
	}
}

class B extends A{
	static void printMethod(){
		System.out.println("Child");
	}
}

class Demo8{
	public static void main(String[] args){
		A a = new A();
		a.printMethod();
		
		B b = new B();
		b.printMethod();
		
		A obj = new B()
		obj.printMethod();
	}
}