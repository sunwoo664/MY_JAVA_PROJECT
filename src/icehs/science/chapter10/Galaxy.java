package icehs.science.chapter10;

public class Galaxy extends Moblie {
	private String osVersion;
	
	
	
	
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public Galaxy() {
		super("Galaxy");
	}
	
	@Override
	public void charge(int time) {
		System.out.println("Galaxy : " + this.osVersion);
		System.out.println("Galaxy : 보조 배터리 " + time + "분 충전" );
	
	}
	
}
