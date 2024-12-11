package InhetitanceAndInterface;

public class DinnerpartyWithConstructor extends PartyWithConstructor2 {

	public DinnerpartyWithConstructor(int numGuests) {
		super(numGuests);
	}
	@Override
	public void displayInvitation() {
		System.out.println("Please come to my dinner party");
	}
}
