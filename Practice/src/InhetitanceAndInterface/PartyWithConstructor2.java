package InhetitanceAndInterface;

public class PartyWithConstructor2 {
    private int guests;
    
    public PartyWithConstructor2 (int newGuests) {
    	guests = newGuests;	
    }

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}
    
	public void displayInvitation() {
		System.out.println("Please come to my party!");
	}
      
}
