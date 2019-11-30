import java.text.NumberFormat;

public class WalkupTicket extends Ticket {

	//WalkupTicket(int n, double p) {
//	 super(n, p);
	// }

	private int number;
	private double price;

	public WalkupTicket(int number, double price) {
	this.number = number;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	// public void setNumber(int number) {
	// this.number = number;
//	}

	// public void setPrice(double price) {
	// this.price = price;
//	}

	public double getPrice() {
		return price;

	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.getPrice());
		return formattedPrice;
	}

	@Override
	public String toString() {

		return "Ticket number: " + number + "\n" + "Price: " + getPriceFormatted();

	}

}