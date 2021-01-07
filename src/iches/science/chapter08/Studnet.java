package iches.science.chapter08;

public class Studnet {
	private String name;
	private String id;
	private String phone;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Studnet(String name, String id, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
	}
	
	public void printStedentInfo() {
		System.out.println(this.name + "(" + this.id + ") / " + this.phone);
	}
}
