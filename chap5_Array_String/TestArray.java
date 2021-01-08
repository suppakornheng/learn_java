public class TestArray{
	public static void main(String[] args){
		int[] num = new int[8];
		num[0]=2;
		num[1]=4;
		num[2]=6;
		num[3]=8;
		System.out.println("num[0]= "+num[0]);
		System.out.println("num[1]= "+num[1]);
		System.out.println("num[2]= "+num[2]);
		System.out.println("num[3]= "+num[3]);
		System.out.println("num[4]= "+num[4]);
		num[3] = num[1+1]+num[0];
		System.out.println("num[3]= "+num[3]);
		System.out.println("Length= "+num.length);
	}
}