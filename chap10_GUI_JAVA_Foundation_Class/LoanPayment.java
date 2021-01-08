public class LoanPayment{
	public static double getPayment(double amount, double interest, double years){
		double payment = amount*((interest/1200.0)/(1-Math.pow(1+interest/1200.0,-years*12)));
		return(Math.round(payment*100))/100.00;
	}
}