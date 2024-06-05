package capgeminiprogram.com.polymerphismpart2;

public class Magzines {
	private String ModelName;
	private String PublisherBrand;
	public Magzines() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magzines(String modelName, String publisherBrand) {
		super();
		ModelName = modelName;
		PublisherBrand = publisherBrand;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getPublisherBrand() {
		return PublisherBrand;
	}
	public void setPublisherBrand(String publisherBrand) {
		PublisherBrand = publisherBrand;
	}
	@Override
	public String toString() {
		return "Magzines [ModelName=" + ModelName + ", PublisherBrand=" + PublisherBrand + "]";
	}
	
}
