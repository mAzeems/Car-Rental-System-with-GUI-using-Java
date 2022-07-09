package model;
import java.time.LocalDate;
import java.util.Date;
public class Visitor extends Customer {
// malak

	private int passportNo;
	private LocalDate entryDate;
	private LocalDate visaExpiryDate;
	//const
	public Visitor(int customerID, String name, String phone, String address, String nationality, String drivingLicence,
			int passportNo, LocalDate entryDate, LocalDate visaExpiryDate) {
		super(customerID, name, phone, address, nationality, drivingLicence);
		this.passportNo = passportNo;
		this.entryDate = entryDate;
		this.visaExpiryDate = visaExpiryDate;
	}
	// setter and getter
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}	

	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	public LocalDate getVisaExpiryDate() {
		return visaExpiryDate;
	}
	public void setVisaExpiryDate(LocalDate visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}
	@Override
	public String toString() {
		return "Visitor: passportNo=" + passportNo + ", entryDate=" + entryDate + ", visaExpiryDate=" + visaExpiryDate;
	}
	
	

	
}
