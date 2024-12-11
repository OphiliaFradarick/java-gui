package InhetitanceAndInterface;

public class EmployeeWithTerritory extends Employee {
    public EmployeeWithTerritory(char dept, double rate, int hours) {
		super(dept, rate, hours);
		// TODO Auto-generated constructor stub
	}

	private int territory;

	public int getTerritory() {
		return territory;
	}
	
	public void setTerritory(int territory) {
		this.territory = territory;
	}
   
   
}
