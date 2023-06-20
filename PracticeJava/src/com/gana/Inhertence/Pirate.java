package com.gana.Inhertence;

public class Pirate extends Person {
	//state or data
	private String presentTitle;
	private String bounty;
	private String power;
	
	//constructor
	public Pirate(String name,String Id,String title,String presentTitle,String bounty,String power){
		super(name,Id,title);
		this.presentTitle = presentTitle;
		this.bounty = bounty;
		this.power = power;
		
		//behavoiur
		
	}

	public String getPresentTitle() {
		return presentTitle;
	}

	public void setPresentTitle(String presentTitle) {
		this.presentTitle = presentTitle;
	}

	public String getBounty() {
		return bounty;
	}

	public void setBounty(String bounty) {
		this.bounty = bounty;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
	public String toString() {
		return String.format("Person Name : %s\nPerson Id : %s\nPerson Title : %s\nPirate Title : %s"
				+ "\nPirate bounty : %s\nPirate power : %s",
				super.getName(),
		        super.getId(),
		        super.getTitle(),
				presentTitle,bounty,power);
	}
	

}
