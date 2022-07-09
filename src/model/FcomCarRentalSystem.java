package model;

import java.util.ArrayList;
import java.util.Date;

public class FcomCarRentalSystem {
	private ArrayList< Car>  cars = new ArrayList<>();
	private ArrayList< Customer> customers   = new ArrayList<>();
	private ArrayList< Rental>  rental  = new ArrayList<>();

	
	public FcomCarRentalSystem() {
	}

	public FcomCarRentalSystem(ArrayList<Car> cars, ArrayList<Customer> customers, ArrayList<Rental> rental) {
		this.cars = cars;
		this.customers = customers;
		this.rental = rental;
	}
	
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public ArrayList<Rental> getRental() {
		return rental;
	}
	public void setRental(ArrayList<Rental> rental) {
		this.rental = rental;
	}
	//haya
	// adding a new car to the system and return that it added successfully 
	public String addCar(Car tcar) {
		cars.add(tcar);
		return "added Car successfully";
		
	}
	//haya
	// using for loop to find the car and using the plate number as  parameter and if it equals to the plate number return it else null
	public Car findCar(String PlateNumber) {
			for(Car C : cars)
				if(C.getPlateNo() == PlateNumber)
			return C;
			
			return null;
			
	}
	//malak
	
	public String addCustomrt(Customer customer)   //Adding the customer to customers array
	{	customers.add(customer);
		return "add customer successfully";}
	
	
	public Customer findCustomer(int customerId )
	{
		for(Customer c : customers)
		{
			if( c.getCustomerID()==customerId)
				return c;
		}
		
		return null;
	}
	

	
	
	public String DeleteCustomer( int customerId)    //getting the customer id and deleting it
	{
		
		for(Customer c : customers)
			if( c.getCustomerID()== customerId)
				{customers.remove(c);
				return " delete customer successfully";
				}
		
		return " customer not deleted successfully";
		
	}
	
		
	public String deleteCar(String PlateNumber )   //Deleting car for its PlateNumber
	{
		
		for(Car car : cars)
		{
			if(car.getPlateNo().equalsIgnoreCase(PlateNumber))
				{cars.remove(car);
				return "car deleted successfully";
				}

		}		
		return " car is not deleted successfully";
		
	}
	
	

	// alreem	
		
		public ArrayList< Car> getCarByAvailability (boolean Available){
		
			ArrayList<Car> av =new ArrayList<>();
			for( Car car : cars) {
				if(car.isAvailable() ==  Available)
					av.add(car);
			//getCarByAvailability
			}
			
			return av;
			
		}
		
		
		
		
		public Invoice returnCar( String PlateNo)
		{
			
			
			for( Rental rent :rental) 
			{ 
				if(rent.getCar().getPlateNo()==PlateNo)
					{ 
					for(Car car :cars )  // for return car the car status will be avalibale 
					{
						if(car.getPlateNo()==PlateNo)
							car.setAvailable(true);
					}
					rental.remove(rent); // remove the contract from rental arraylist
					return rent.getInvoice();	
					}
			}
			
			
			
			
			return null; // if the car  is  not found in the rental arraylist
		}
		
		
		
		
		public void bookCarRental(Rental rent) 
		{	
			for( Car c :cars )
			{	
				if(rent.getCar().getPlateNo().equals(c.getPlateNo()))
				{ 	c.setAvailable(false); // car is not longer available 
					rental.add(rent);	//add the rented car to rental array list
				}		
			}
			
		}
		
		
		
		
		
		
		
	public ArrayList<Rental> findCarRentalByCustomerID(int customerID){
		
		ArrayList<Rental> myrentCars = new ArrayList<>();
		for (Rental r:rental) {
			if(r.getCustomer().getCustomerID()==customerID) {
				
				 myrentCars.add(r);
			}
		}
		return  myrentCars;
		
	}

	public void deleteCarRental(int customerid) {
		ArrayList<Rental> d = new ArrayList<>();	//make a new array list 
		for(Rental r:rental) {
			if(r.getCustomer().getCustomerID()==customerid) 
				{
				r.getCar().setAvailable(true);
				}
			else	//if the customer id is different the rent will be added in the new array list
				d.add(r);
		}
		rental.clear();//delete every thing inside the rental
		for( Rental i : d) {	//copy all the rental back to rental array list
			rental.add(i);
		}
		
	}
	public ArrayList<Car>  getAvailableCarByDate(Date date){

		 ArrayList<Car> carbydate= new ArrayList<>();
		 
		for (Rental r: rental ) {
			if (r.getEndDate().before(date))	
				carbydate.add(r.getCar());
		}
		
		for (Car c:cars) {
			if (c.isAvailable()==true)
				for (Rental r: rental ) // make sure that this car not in rent array
					if(r.getCar().getPlateNo().equals(c.getPlateNo()))
						break;
					
					carbydate.add(c);
		}
		
		
		return carbydate;
	}
			




		
	}





