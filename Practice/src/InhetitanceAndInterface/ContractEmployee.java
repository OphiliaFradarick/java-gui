package InhetitanceAndInterface;

public class ContractEmployee extends Employee{
	
	public ContractEmployee(char dept, double rate, int hours) {
		super(dept, rate, hours);
		// TODO Auto-generated constructor stub
	}

	private double rateOfPay = 2000.00;

	public double getRateOfPay() {
		return rateOfPay;
	}

	public void setRateOfPay(double rateOfPay) {
		this.rateOfPay = rateOfPay;
	}

	@Override
	public void displayRateOfPay() {
	
		System.out.println("Pay is "+ rateOfPay + " per contract.");
	}
	
}
