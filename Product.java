
// Jessica Sites 
// Assignment 9: Product Class 
// 11/25/19
import java.text.NumberFormat;

public class Product {

	public static void main(String[] args) {
	}
	// product code, description, price and product count.

	int productCode;
	String productDescription;
	double productPrice;
	int productCount;

	// constructor
	Product(int pc, String pd, double d, int pC) {
		productCode = pc;
		productDescription = pd;
		productPrice = d;
		productCount = pC;
	}

//methods
	public String toString() {
		return "Product Code: " + productCode + "\n" + "Product Description: " + productDescription + "\n"
				+ "Product Price: " + getPriceFormatted() + "\n" + "Product Count: " + productCount;

	}

	// methods getter
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
        return formattedPrice;
    }


	public int getproductCode() {
		int code;
		code = getproductCode();
		return code;
	}

	public String getproductDescription() {
		String description;
		description = getproductDescription();
		return description;
	}

	public double getproductPrice() {
		double price;
		price = getproductPrice();
		return price;
	}

	public int getproductCount() {
		int count;
		count = getproductCount();
		return count;
	}

//methods setter
	public void setproductCode(int productCode) {
		this.productCode = productCode;
	}

	public void setproductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setproductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public void setproductCount(int productCount) {
		this.productCount = productCount;
	}
}
