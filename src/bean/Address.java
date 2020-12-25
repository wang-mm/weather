package bean;


public class Address {
	
	    private int id;
	    private int pid;
	    private String name;
	    private int type;
	    
	    public Address() {
	    }

	    public Address(int id, int pid, String name, int type) {
	        this.id = id;
	        this.pid = pid;
	        this.name = name;
	        this.type = type;
	    }
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}

		 @Override
		    public String toString() {
		        return "Address{" +
		                "id=" + id +
		                ", pid=" + pid +
		                ", name='" + name + '\'' +
		                ", type=" + type +
		                '}';
		 }
}
