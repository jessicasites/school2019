import java.text.NumberFormat;

public abstract class Ticket  {
	
	//private int number;
	//private double price;

	//public Ticket(int n, double p) {
	//	number = n;
//	double price = p;
//}
	public abstract int getNumber();
	//{
	//	return number;
//}

//public void setPrice(double price) {
//	this.price = price;
//}
	public abstract double getPrice();
//	{
//	return price;
//}
//public void setNumber(int number) {
//	this.number = number;
//}
	public abstract String toString();
	//{

	//	return "Number: " + number + "\n" + "Price: " + getPriceFormatted();

//	}

//public String getPriceFormatted() {
//String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);

// return formattedPrice;
//}
}