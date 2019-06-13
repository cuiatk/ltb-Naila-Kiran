package labTerminalB;

public class Driver {

	public static void main(String[] args) {
		
		String input = "The <b>Good</b>, the <i>Bad</i>, and the <strong>Ugly</strong>";
		String regex = "TODO 1";
		String output = input.replaceAll("<[^>]*>", "");
		System.out.println(output);
		
		
		Movie m1 = new Movie("Spancer", 0);
		Movie m2 = new Movie("Speed", 1);
		Movie m3 = new Movie("Blood Diamond",2);
		Customer me = new Customer("Nadir");
		Customer me2 = new Customer("Allah Ditta");
		Rental r1 = new Rental(m1, 23);
		Rental r2 = new Rental(m2,4);
		Rental r3 = new Rental(m3,3);
		me.addRental(r1);
		me.addRental(r2);
		me2.addRental(r3);
		System.out.println(me.statement());
		System.out.println(me2.statement());

	}
}
