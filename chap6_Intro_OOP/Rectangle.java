public class Rectangle{
	//program 6.1
	private double length;
	private double width;
	public void setLength(double len){
		length=len;
	}
	//program 6.8
	public Rectangle(double len, double w){
		length = len;
		width = w;
	}
	//program 6.10
	public Rectangle(){
		length = 0.0;
		width = 0.0;
	}
	//program 6.3
	public void setWidth(double w){
		width=w;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getArea(){
		return length*width;
	}
}