package InhetitanceAndInterface;

public class Customer {
  private int idNumber;
  private double balanceOwed;
  
  //parametric constructor
  public Customer(int id, double bal) {
	  idNumber = id;
	  balanceOwed = bal;
  }
  
  public void display() {
	  System.out.println("Customer #"+ idNumber + " Balance $"+ balanceOwed);
  }
}
