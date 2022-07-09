package model;
import java.util.Date;
//haya alsulaiti 

public class Payment {

private String paymentDescription;
private int paymentId;
private double price;
private Date paymentDate;
//constructor
public Payment(String paymentDescription, int paymentId, double price, Date paymentDate) {
	this.paymentDescription = paymentDescription;
	this.paymentId = paymentId;
	this.price = price;
	this.paymentDate = paymentDate;
}
//setters and getter
public String getPaymentDescription() {
	return paymentDescription;
}
public void setPaymentDescription(String paymentDescription) {
	this.paymentDescription = paymentDescription;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Date getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(Date paymentDate) {
	this.paymentDate = paymentDate;
}
@Override
public String toString() {
	return " Payment: paymentDescription=" + paymentDescription + " paymentId=" + paymentId +"\n"+ "price=" + price
			+ " paymentDate=" + paymentDate;
}


}