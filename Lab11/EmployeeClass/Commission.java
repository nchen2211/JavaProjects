/*  Java Class: Commission.java
    Author: Noreen Chrysilla
    Class: CSCI 145
    Date: Due on 4/21/14
    Description: Add new class Commission that is extended from hourly. It returns the total salary + commission
    I certify that the code below is my own work.

	Exception(s): N/A

*/
public class Commission extends Hourly {
	
	private double totalSales;
	private double commission;
	
	public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commissionRate)
	{
		super(eName,eAddress, ePhone, socSecNumber, rate);
		commission = commissionRate;
	}
	
	public void addSales(double totSales)
	{
		totalSales = totSales;
	}
	
	public double pay()
	{
		double payment = super.pay() + (totalSales * commission);
		totalSales = 0;

	    return payment;
	}
	
	public String toString()
	   {
	      String result = super.toString();

	      result += "\nTotal Sales: " + totalSales;

	      return result;
	   }
	
	

}
