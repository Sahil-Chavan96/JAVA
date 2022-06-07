class Employee{
	String name;
	int yr_of_joining;
	String address;
	
	Employee(String name,int yr_of_joining,String address){
		this.name=name;
		this.yr_of_joining=yr_of_joining;
		this.address=address;
	}
	
	void print(){
		System.out.println(this.name+"  "+this.yr_of_joining+"  "+this.address);
	}
}

class Demo9{
	public static void main(String[] args){
		Employee e1=new Employee("Robert",1994,"64C-WallsStreatR");
		e1.print();
		Employee e2=new Employee("Sam",2000,"68D- WallsStreat");
		e2.print();
		Employee e3=new Employee("John",1999,"26B- WallsStreat");
		e3.print();
	}
}