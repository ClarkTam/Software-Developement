import java.awt.*;

//import java.awt.*;
public class Exercise09_01 {
		
	}
	class Rectangle {
		double width;
		double height;
		
		Rectangle(){
		}
		
		Rectangle(double width, double height) {
		}
		
		Rectangle Rectangle1 = new Rectangle();
		
		public static double getArea(Rectangle Rectangle1) {
			double width = Rectangle1.width;
			double height = Rectangle1.height;
			double area = width * height;
			return area;
		}
		
		public static double getPerimeter(Rectangle Rectangle1) {
			double width = Rectangle1.width;
			double height = Rectangle1.height;
			double perimeter = (width*2)+(height*2);
			return perimeter;
		}
	}