/*
  	ISYS 320
  	Name(s):Patrick Quirk	
 	Date:11/4/17 
*/

public class RestaurantBillComputer {

	
	
	public static void main(String args[]) {
		
		 double subTotal = 20;
		 double taxRate = .05;
		 double total;
		
		total = subTotal +  (subTotal * taxRate);
				
		System.out.println("With a 15% tip your total would be $" + Calculate(.15, subTotal, total));
		System.out.println("With a 18% tip your total would be $" + Calculate(.18, subTotal, total));
		System.out.println("With a 20% tip your total would be $" + Calculate(.20, subTotal, total));
		
	}
	
	public static double Calculate(double tipRate, double subTotal, double total)
	{
		double tip = subTotal * tipRate;
		return tip + total;
	}
}
