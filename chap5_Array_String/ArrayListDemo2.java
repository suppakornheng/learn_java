import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args){
		ArrayList band = new ArrayList();
		band.add("Paul");
		band.add("Peter");
		band.add("John");
		band.add("George");
		System.out.println(band);
		int location = band.indexOf("Pete");
		band.remove(location);
		System.out.println(band);
		System.out.println("At index 1: "+band.get(1));
		band.add(2,"Ringo");
		System.out.println(band);
		System.out.println("Size of the band: "+band.size());
	}    
}