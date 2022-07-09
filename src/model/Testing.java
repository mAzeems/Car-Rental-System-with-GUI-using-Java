package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Testing {

	public static void main(String[] args) {
		FcomCarRentalSystem fcomCarRentalSystem= new FcomCarRentalSystem();
		Invoice invoice = new Invoice();
		Car car1 = new Car("67387", "2019",CarType.SUV, true);
		Car car2 = new Car("38849", "2022",CarType.SEDAN, true);
		Car car3 = new Car("89302", "2018",CarType.TRUCK, false);

		// Making object of FcomCarRentalSystem
		
		//haya
		
		// testing invoice class
		Date paymentDate1 = new Date(2022, 11, 12);
		Date paymentDate2 =new Date(2021, 9, 12);
		Date paymentDate3 = new Date(2021, 10, 21);
		
		Payment payment1= new Payment("cash",14424, 293.800 , paymentDate1 ); 
		Payment payment2= new Payment("card",24134, 500.101 , paymentDate2 ); 
		Payment payment3= new Payment("cheques",29857, 450.011 , paymentDate3 );
		System.out.println(payment1.toString());
		System.out.println(payment2.toString());
		System.out.println(payment3.toString());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		ArrayList <Payment> payments = new ArrayList<>();
		payments.add(payment1);
		payments.add(payment2);
		payments.add(payment3);

		System.out.println("-befor modiyfing:"+payment2.toString());

		
		//the object of invoice class so i can access the all functions
		Invoice invoice1 = new Invoice(1, new Date(), payments);
		
		Payment Modify = new Payment("cash",24134, 600.666, new Date() );
		invoice1.modifiyPayment(Modify);
		System.out.println("-after modifying:"+payment2.toString());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		Payment addPayment = new Payment("card",77683, 30.333,new Date() );
		System.out.println(invoice1.addPayment(addPayment));
		System.out.println(invoice1.toString());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		//invoice1.customerID;
		System.out.println(invoice1.deletePayment(24134));
		System.out.println(invoice1.toString());
		System.out.println(invoice1.deletePayment(44677));
		System.out.println(invoice1.toString());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(invoice1.getPayment(14424));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("searching for wrong payment id :"+invoice1.getPayment(45224));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("total payment"+ invoice1.calculateTotalPayment());
		System.out.println(fcomCarRentalSystem.addCar(car1));
		System.out.println(fcomCarRentalSystem.addCar(car2));
		System.out.println(fcomCarRentalSystem.addCar(car3));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(fcomCarRentalSystem.getCars());
		System.out.println(fcomCarRentalSystem.findCar("67387"));
		System.out.println(fcomCarRentalSystem.findCar("68528"));
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		
		
		//malak
		
		// Added three cars in the rental system
		System.out.println(fcomCarRentalSystem.deleteCar("1234"));
		System.out.println(fcomCarRentalSystem.deleteCar("4567"));
		System.out.println(fcomCarRentalSystem.deleteCar("8911"));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		// Adding customers
		
		Customer cus1 = new Customer(1,"Ali","123","Qatar","Qatar","123");
		Customer cus2 = new Customer(2,"shahwaiz","456","Qatar","Qatar","123");
		Customer cus3 = new Customer(3,"ikram","789","Qatar","Qatar","123");
		fcomCarRentalSystem.addCustomrt(cus1);
		fcomCarRentalSystem.addCustomrt(cus3);
		fcomCarRentalSystem.addCustomrt(cus3);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		//finded three customers
		System.out.println(fcomCarRentalSystem.findCustomer(1));
		System.out.println(fcomCarRentalSystem.findCustomer(2));
		System.out.println(fcomCarRentalSystem.findCustomer(3));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");



		//finded three customers
		System.out.println(fcomCarRentalSystem.findCustomer(1));
		System.out.println(fcomCarRentalSystem.findCustomer(2));
		System.out.println(fcomCarRentalSystem.findCustomer(3));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		// deleted three customers
		System.out.println(fcomCarRentalSystem.DeleteCustomer(1));
		System.out.println(fcomCarRentalSystem.DeleteCustomer(2));
		System.out.println(fcomCarRentalSystem.DeleteCustomer(3));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		//get car by availability
		System.out.println(fcomCarRentalSystem.getCarByAvailability(true));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

		
		//alreem
		//testing car by availability function
			ArrayList< Car> CarByAvailability = new ArrayList<>();
			CarByAvailability = fcomCarRentalSystem.getCarByAvailability(false);

			for(Car c : CarByAvailability) {
				System.out.println(c.toString());
			}
			CarByAvailability = fcomCarRentalSystem.getCarByAvailability(true);

			for(Car c : CarByAvailability) {
				System.out.println(c.toString());
			}
			
			 //object of rent
			Rental bookCarRental = new Rental(1 ,cus1, car1, new Date(2021, 10,14), new Date(),3000, invoice1);
			//testing book rental function
			fcomCarRentalSystem.bookCarRental(bookCarRental);

			//testing return car function
			Invoice invoiceOfReturnCar = new Invoice();
			invoiceOfReturnCar = fcomCarRentalSystem.returnCar("6738");
			CarByAvailability = fcomCarRentalSystem.getCarByAvailability(true);

			for(Car c : CarByAvailability) {
				System.out.println(c.toString());
			}
			if(invoiceOfReturnCar != null) //if the return invoice is null  then wrong plate number was added
				System.out.println(invoiceOfReturnCar.toString());
			//rental object 
			Rental bookCarRental1 = new Rental(2 ,cus1, car1, new Date(2021, 10,14), new Date(),3000, invoice1);
			Rental bookCarRental2 = new Rental(3 ,cus1, car2, new Date(2021, 10,14), new Date(),4000, invoice1);
			fcomCarRentalSystem.bookCarRental(bookCarRental1);
			Rental bookCarRental3 = new Rental(3 ,cus2, car2, new Date(2021, 10,14), new Date(),4000, invoice1);
			fcomCarRentalSystem.bookCarRental(bookCarRental2);
			fcomCarRentalSystem.bookCarRental(bookCarRental3);
			//testing find car by customer id function
			ArrayList<Rental> rent = new ArrayList<>();
			rent = fcomCarRentalSystem.findCarRentalByCustomerID(cus1.getCustomerID());
			for(Rental r : rent) {
				System.out.println(r.toString());
			}
			
			//Testing delete car rental function
			fcomCarRentalSystem.deleteCarRental(cus1.getCustomerID());
			ArrayList<Rental> rent1 = new ArrayList<>();
			rent1 = fcomCarRentalSystem.findCarRentalByCustomerID(cus2.getCustomerID());
			
			for(Rental r : rent1) {
				System.out.println(r.toString());
				
			}
			
	}
	



}




			
			
						

		
		

	

	


