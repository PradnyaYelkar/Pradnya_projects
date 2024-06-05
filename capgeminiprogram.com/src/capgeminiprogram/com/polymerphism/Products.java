package capgeminiprogram.com.polymerphism;

public class Products {
	private String price;
	private String brand;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(String price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Products [price=" + price + ", brand=" + brand + "]";
	}
	
	
}
