public class ReturnArray{
	public static void main(String[] args){
		double[] values;
		values = getArray();
		for(int index=0;index<values.length;index++){
			System.out.print(values[index]+" ");
		}
	}
	public static double[] getArray(){
		double[] array = {1.2,2.3,4.5,6.7,8.9};
		return array;
	}
}