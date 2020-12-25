package bean;


public class County {
	private int id;
    private  String name;
    private String weatherId;
    
    public County() {
    }

    public County(int id, String name, String weatherId) {
        this.id = id;
        this.name = name;
        this.weatherId = weatherId;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeatherId() {
		return weatherId;
	}
	public void setWeatherId(String weatherId) {
		this.weatherId = weatherId;
	}
	 @Override
	    public String toString() {
	        return "County{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", weatherId='" + weatherId + '\'' +
	                '}';
	 }
}
