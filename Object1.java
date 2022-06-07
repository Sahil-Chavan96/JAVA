/*
1) Write a program to print the name, salary and date of joining 
of 10 employees in a company.
*/

class Employee{
	//declare a property
	public String emp_name;
	public double salary;
	public String date_of_joining;
	
	//constructor
	Employee(String emp_name, double salary, String date_of_joining){
		this.emp_name = emp_name;
		this.salary = salary;
		this.date_of_joining = date_of_joining;
	}
	
	//method
	void display(){
		System.out.println(this.emp_name+ " " +this.salary+ " " +this.date_of_joining);
	}
}

class Object1{
	public static void main(String[] args){
		//create an object
		Employee[] arr = new Employee[10];
		
		//initialise a value in an object
		arr[0] = new Employee("Sagar", 10000, "12-02-2022");
		arr[1] = new Employee("Renu",100000,"12-08-2022");
		arr[2] = new Employee("malkeet", 20000, "30-04-2022");
		arr[3] = new Employee("sahil",100000,"12-8-2016");
		arr[4] = new Employee("Krishna",90000,"22-08-2017");
		arr[5] = new Employee("Teju",80000,"07-06-2020");
		arr[6] = new Employee("Ram",600000,"09-11-2015");
		arr[7] = new Employee("Sham",100000,"04-07-2022");
		arr[8] = new Employee("Sohan",120000,"12-8-2015");
		arr[9] = new Employee("Pratik",100000,"12-8-2016");
		
		//call a method
		System.out.print("Employee 1 = ");
		arr[0].display();
		
		System.out.print("Employee 2 = ");
		arr[1].display();
		
		System.out.print("Employee 3 = ");
		arr[2].display();
		
		System.out.print("Employee 4 = ");
		arr[3].display();
		
		System.out.print("Employee 5 = ");
		arr[4].display();
		
		System.out.print("Employee 6 = ");
		arr[5].display();
		
		System.out.print("Employee 7 = ");
		arr[6].display();
		
		System.out.print("Employee 8 = ");
		arr[7].display();
		
		System.out.print("Employee 9 = ");
		arr[8].display();
		
		System.out.print("Employee 10 = ");
		arr[9].display();
		
	}
}