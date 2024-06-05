package polymerphism;

public class Electronics {
	private int bettery;
	private boolean wireless;
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int bettery, boolean wireless) {
		super();
		this.bettery = bettery;
		this.wireless = wireless;
	}
	public int getBettery() {
		return bettery;
	}
	public void setBettery(int bettery) {
		this.bettery = bettery;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
}
