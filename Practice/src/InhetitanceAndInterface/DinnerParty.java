package InhetitanceAndInterface;

public class DinnerParty extends PartyWithConstructor2 {
    public DinnerParty(int newGuests) {
		super(newGuests);
		// TODO Auto-generated constructor stub
	}

	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}
	
	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
   
}
