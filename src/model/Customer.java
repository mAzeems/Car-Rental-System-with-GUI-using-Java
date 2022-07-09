package model;
// malak
public class Customer {
	private int customerID;
	private String name;
	private String phone;
	private String address;
	private String nationality;
	private String drivingLicence;
	
	
	public Customer(int customerID, String name, String phone, String address, String nationality,
			String drivingLicence) {

		this.customerID = customerID;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.nationality = nationality;
		this.drivingLicence = drivingLicence;
	}
	
	// setter and getter
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	@Override
	public String toString() {
		return "Customer: customerID=" + customerID + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", nationality=" + nationality + ", drivingLicence=" + drivingLicence ;
	}
	
}

