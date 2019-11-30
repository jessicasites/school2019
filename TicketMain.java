import java.text.NumberFormat;

public class TicketMain {

	public static void main(String[] args) {

		Ticket ticket1 = new WalkupTicket(11566, 50);
		
		System.out.println(ticket1.getPrice());
		System.out.println(ticket1.getNumber());
		System.out.println();
		System.out.println(ticket1.toString());
	}

}
