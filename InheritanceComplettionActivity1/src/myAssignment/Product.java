package myAssignment;

import java.text.NumberFormat;

public abstract class Product {
	private String code;
	private String description;
	private double price;
	protected static int count = 0; // a protected
									// static variable

	public Product() {
		setCode("");
		setDescription("");
		setPrice(0);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// get and set accessors for the code, description,
	// and price instance variables
	@Override
	public String toString() {
		return "Code:        " + getCode() + "\n" + "Description: "
				+ getDescription() + "\n" + "Price:       "
				+ this.getFormattedPrice() + "\n";
	}

	private String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getPrice());

	}

	// create public access for the count variable
	public static int getCount() {
		return count;
	}

	public String whoAmI() {
		return "Product";
	}

	public boolean equals(Object o) {
		Product p = (Product) o;
		if (p.getCode().equalsIgnoreCase(this.getCode())
				&& p.getDescription().equalsIgnoreCase(this.getDescription())
				&& p.getPrice() == this.getPrice())

			return true;
		else
			return false;
	}
}