package capgeminiprogram.com.polymerphismpart2;

public class NewsPaper {
	private String NewsPaperName;
	private boolean JobAdvertisment;
	public NewsPaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsPaper(String newsPaperName, boolean jobAdvertisment) {
		super();
		NewsPaperName = newsPaperName;
		JobAdvertisment = jobAdvertisment;
	}
	public String getNewsPaperName() {
		return NewsPaperName;
	}
	public void setNewsPaperName(String newsPaperName) {
		NewsPaperName = newsPaperName;
	}
	public boolean isJobAdvertisment() {
		return JobAdvertisment;
	}
	public void setJobAdvertisment(boolean jobAdvertisment) {
		JobAdvertisment = jobAdvertisment;
	}
	@Override
	public String toString() {
		return "NewsPaper [NewsPaperName=" + NewsPaperName + ", JobAdvertisment=" + JobAdvertisment + "]";
	}
	
}
