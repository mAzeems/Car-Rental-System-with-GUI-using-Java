package model;
import java.util.Date;
public class Rental {


	private int rentalNo;
	private Customer customer;
	private Car car;
	private Date startDate;
	private Date endDate;
	private double deposit;
	private Invoice invoice;
	
	
	
	
	public Rental(int rentalNo, Customer customer, Car car, Date startDate, Date endDate, double deposit,
			Invoice invoice) {
		super();
		this.rentalNo = rentalNo;
		this.customer = customer;
		this.car = car;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deposit = deposit;
		this.invoice = invoice;
	}
	public int getRentalNo() {
		return rentalNo;
	}
	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "Rental: rentalNo=" + rentalNo + ", customer=" + customer + ", car=" + car + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", deposit=" + deposit + ", invoice=" + invoice ;
	}

	
}

	



