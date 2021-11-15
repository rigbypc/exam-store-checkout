package point.of.sale;

public class StoreInfo {

	private static StoreInfo instance = null;
	private String name = "No Name";
	
	private StoreInfo() {

	}
	
	public static StoreInfo getInstance() {
		if (instance == null) {
			instance = new StoreInfo();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static StoreInfo TestResetStoreInfo() {
		instance = new StoreInfo();
		return instance;
	}

}
