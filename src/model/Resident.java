package model;

public class Resident extends Customer{
// malak
	private int qatarID;

	public int getQatarID() {
		return qatarID;
	}

	public void setQatarID(int qatarID) {
		this.qatarID = qatarID;
	}
	
	
	//constructor
	public Resident(int customerID, String name, String phone, String address, String nationality,
			String drivingLicence, int qatarID) {
		super(customerID, name, phone, address, nationality, drivingLicence);
		this.qatarID = qatarID;
	}

	@Override
	public String toString() {
		return "Resident: qatarID=" + qatarID ;
	}
	
	
	


}
