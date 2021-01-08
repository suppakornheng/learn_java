public class SomeClass{
	public static void compareNumbers(Student s1, Student s2){
		if(s1.getStudentNumber()==s2.getStudentNumber()){
			System.out.println(s1.getName()+" has the same number as "+s2.getName());
		}else{
			System.out.println(s1.getName()+" has a different number than "+ s2.getName());
		}
	}
	public static void main(String[] args){
		Student studentObject = new Student("Teerawat",1234);
		Undergraduate undergradObject = new Undergraduate("Tanawut",1234,3);
		SomeClass.compareNumbers(studentObject,undergradObject);
		
		Student s =  new Student("Best",5555);
		Undergraduate ug = new Undergraduate("Bestza",6666,4);
		
		Person p1 = s;
		Person p2 = ug;
		
		System.out.println("p1.getName()= "+p1.getName());
		//System.out.println("p1.getStudentNumber()= "+p1.getStudentNumber()); // ????????? ???????? person p1 = s ??? p1 ???? person ???????? name ????? studentNumber
	}
}