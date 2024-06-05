package polymerphism;

public class MainProducts {
	public static void main(String args[]) {
		Products products = new Products();
		products.setBrand("onePlus");
		products.setPrice("3000");
		
		Electronics electronics = new Electronics();
		electronics.setBettery(10000);
		electronics.setWireless(true);
		
		Foods foods =new Foods();
		foods.setExpiryDate("04-12-2025");
		foods.setVeg(false);
		
	}
}
