package polymerphism;

public class Foods {
		private String ExpiryDate;
		private boolean veg;
		public Foods() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Foods(String expiryDate, boolean veg) {
			super();
			ExpiryDate = expiryDate;
			this.veg = veg;
		}
		public String getExpiryDate() {
			return ExpiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			ExpiryDate = expiryDate;
		}
		public boolean isVeg() {
			return veg;
		}
		public void setVeg(boolean veg) {
			this.veg = veg;
		}
		
		
}
