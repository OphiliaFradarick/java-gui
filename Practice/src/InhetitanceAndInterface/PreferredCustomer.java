package InhetitanceAndInterface;

public class PreferredCustomer extends Customer{

	double discountrate;
	
	public PreferredCustomer(int id, double bal, double rate) {
		super(id, bal);
		discountrate = rate;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(" Discount rate is "+ discountrate);
	}

	
	
}
