package model;
import java.util.ArrayList;
import java.util.Date;
public class Invoice {
	// haya alsulaiti
	
	private int invoiceNo;
	private Date invoiceDate;
	// we use ArrayList for payments and we use Payment class 
	private ArrayList<Payment> payments=new ArrayList<Payment>();

	// constructor
	
	public Invoice() {
	}

	public Invoice(int invoiceNo, Date invoiceDate, ArrayList<Payment> payments) {
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.payments = payments;
	}
	
	//setters and getters

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}
	// methods 
	// modifying old payments with new new payments 
	public String modifiyPayment(Payment payment) {
		// searching for the payments
		// searching p in list payments and Payment is class that have all information about the payment.
		for(Payment p :payments) { 
			/*using p.getPaymentId() and payment.getPaymentId() to compare the old payment id with the new one if it equals set the old payment
			 * with the new */
			if(p.getPaymentId() == payment.getPaymentId()) { 
				p.setPaymentDate(payment.getPaymentDate());
				p.setPaymentDescription(payment.getPaymentDescription());
				p.setPaymentId(payment.getPaymentId());
				p.setPrice(payment.getPrice());
			} 
		}
				return "updated payment successfully";
	}			
				
				
	// deleting payment
	// taking a paymentId as a parameter
	public String deletePayment(int paymentId) {
		// searching for the payment 
		for(Payment p :payments) { 
			// if the getPaymentId equals payment id  then reomve it
			if(p.getPaymentId() == paymentId) { 
			payments.remove(p);
			return "delete payment successfully";
			}
		}
		return "delete payment not successfully";

	}

	//adding payment 
	public String addPayment(Payment payment) {
		// adding payment to the list
		payments.add(payment);
		return "--> add payment successfully <--";
		
	}
		//getting payment
		public Payment getPayment(int paymentId) {
			// searching in list for specific payment using Id if it in inside the list return it else return null
				for(Payment p :payments) 
					if(p.getPaymentId() == paymentId)
						return p;
				
					return null;
		
	}
	//calculate the total payment
	double total=0;
	// create total=0 so we can calculate the total payment price
	public double calculateTotalPayment() {
		//using enhanced loop so we can use each price in the payment and calculate it 
		for(Payment p :payments) 
		 	total= total+p.getPrice();
		 return total;
			
		}

	@Override
	public String toString() {
		return "Invoice: invoiceNo= " + invoiceNo + " ,Date= " + invoiceDate+ " ,payments=" + payments+"\n"  ;
	}

	}




