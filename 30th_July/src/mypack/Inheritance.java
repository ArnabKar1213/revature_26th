package mypack;
import java.util.*;
public class Inheritance {
	public void area() {
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Square s = new Square();
		Trapezoid t = new Trapezoid();
		System.out.println("Enter the length , breadth and height");
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		int b =sc.nextInt();
		int h = sc.nextInt();
		System.out.println("Enter the side of a square");
		int s1 = sc.nextInt();
		r.area(l,b);
		s.area(s1);
		t.area(l,b,h);
	}

}
class Rectangle extends Inheritance{
	public void area(int l , int b){
		int ar = l * b;
		System.out.println("Area of Rectangle is: " + ar);
	}
}
class Square extends Inheritance{
	public void area(int s){
		int ar = s * s;
		System.out.println("Area of Square is: " + ar);
	}
}
class Trapezoid extends Inheritance{
	public void area(int a,int b,int h){
		double ar =(double)(a + b) * h * 0.5;
		System.out.println("Area of Trapezoid is: " + ar);
	}
}