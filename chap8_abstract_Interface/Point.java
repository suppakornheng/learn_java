public class Point{
	int x,y;
	public Point(){
		x=y=0;
	}
	public Point(int a, int b){
		x=a;
		y=b;
	}
	public boolean equals(Point p){
		return(p.x==x && p.y==y);
	}
	public static void main(String[] args){
		Object a;
		Object b;
		a = new Point(3,4);
		//b = new Point(3,4); //false
		b = a;              //true
		System.out.println(a.equals(b));
	}
}
