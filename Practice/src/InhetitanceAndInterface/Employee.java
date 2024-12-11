package InhetitanceAndInterface;

public class Employee {
    private double salary;
    private int id;
    private String firstName;
    private String LastName;
    private String socialSecurityNumber;
    private String dateOfHire;
    private double rateOfPay;
    
    public Employee(char dept, double rate, int hours) {
    	
    }
   
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getDateOfHire() {
		return dateOfHire;
	}
	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}
	public double getRateOfPay() {
		return rateOfPay;
	}
	public void setRateOfPay(double rateOfPay) {
		this.rateOfPay = rateOfPay;
	}
    
	public void displayRateOfPay() {
		
	}
  
}
