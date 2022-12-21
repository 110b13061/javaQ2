package javaQ2;
interface IArea{
	void area();
}
class Circle implements IArea {
	private double r;
	public Circle(double r) {
		this.r=r;
	}
	public void area() {
		System.out.println("圓形面積:"+3.1416*r*r);
	}
}
class Rectangle implements IArea{
	private double width;
	private double height;
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public void area() {
		System.out.println("長方形面積:"+width*height);
	}
}
class Triangle implements IArea{
	private double bottom;
	private double height;
	public Triangle(double bottom,double height) {
		this.bottom=bottom;
		this.height=height;
	}
	public void area() {
		System.out.println("三角形面積:"+bottom*height/2);
	}
}
public class Class03 {
	public static void main(String args[]) {
		IArea a;
		Circle c = new Circle(6.0);
		Rectangle r = new Rectangle(10.0,15.0);
		Triangle t = new Triangle(20.0,15.0);
		for(int i=1;i<=3;i++) {
			if(i==1){
				a=c;
				a.area();
			}
			else if(i==2) {
				a=r;
				a.area();
			}
			else {
				a=t;
				a.area();
			}
		}
		
	}
	
}
