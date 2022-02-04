abstract class Shape {
    abstract public String draw();
}
class Rectangle extends Shape {
    @Override
    public String draw() {
	return "Draw a Rectangle";}
	}

class Line extends Shape{
    @Override
    public String draw() {
	return "Draw a Line";}
	}

class Cube extends Shape {
    @Override
    public String draw() {
	return "Draw a Cube";
	}
}
public class Assignment2Q5 {
	 public static void main(String[] args) {
	    	Shape s1=new Cube();
	    	Shape s2=new Line();
	    	Shape s3=new Rectangle();
	    	System.out.println(s1.draw());
	    	System.out.println(s2.draw());
	    	System.out.println(s3.draw());
	    }

}