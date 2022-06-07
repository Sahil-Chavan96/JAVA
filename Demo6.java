/*
We have to calculate the area of a rectangle, a square and a circle. 
Create an abstract class 'Shape' with three abstract methods namely
 'RectangleArea' taking two parameters, 'SquareArea' and 
 'CircleArea' taking one parameter each. The parameters of 
 'RectangleArea' are its length and breadth, that of 'SquareArea' 
 is its side and that of 'CircleArea' is its radius. Now create 
 another class 'Area' containing all the three methods 
 'RectangleArea', 'SquareArea' and 'CircleArea' for printing 
 the area of rectangle, square and circle respectively. 
 Create an object of class 'Area' and call all the three methods.
*/

abstract class Shape{
	abstract void rectangleArea(int length, int breadth);
	abstract void squareArea(int side);
	abstract void circleArea(double radius);
	
}

class Area{
	void rectangleArea(int length, int breadth){
		int rect = length * breadth;
		System.out.println("Are of Rectangle is: " +rect);
	}
	
	void squareArea(int side){
		int sqr = side * side;
		System.out.println("Are of Square is: " +sqr);
	}
	
	void circleArea(double radius){
		double cir = 3.14 * radius * radius;
		System.out.println("Area of Square is: " +cir);
	}
	
	}


class Demo6{
	public static void main(String[] args){
		Area a = new Area();
		a.rectangleArea(10,20);
		a.squareArea(30);
		a.circleArea(10);
	}
}