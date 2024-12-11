package InhetitanceAndInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Employee receptionist = new Employee();
//		Employee deliveryPerson = new Employee();
//		
//		EmployeeWithTerritory northernRep = new EmployeeWithTerritory();
		
//		northernRep.getId();
//		northernRep.getSalary();
//		northernRep.getTerritory();
		
//		northernRep.setId(915);
//		northernRep.setSalary(210.00);
//		northernRep.setTerritory(5);
		
		int guests = 0;
		//PartyWithConstructor2  aParty = new PartyWithConstructor2 (guests);
		Scanner keyboard = new Scanner(System.in);
		
//		System.out.println("Enter the number of guests for the party >> ");
//		guests = keyboard.nextInt();
//		aParty.setGuests(guests);
//		System.out.println("The part has "+ aParty.getGuests() + "guests.");
//		aParty.displayInvitation();
		
//		int choice;
//		DinnerParty aDinnerParty = new DinnerParty();
//		System.out.println("Enter the number of guests for the Dinner party >> ");
//		choice = keyboard.nextInt();
//		aDinnerParty.setDinnerChoice(choice);
//		System.out.println("Enter the menu options ---1 for chicken or 2 for beef>> ");
//		choice = keyboard.nextInt();
//		aDinnerParty.setDinnerChoice(choice);
		
		DinnerpartyWithConstructor aDinnerParty = new DinnerpartyWithConstructor(guests);
		
		
	}

}
