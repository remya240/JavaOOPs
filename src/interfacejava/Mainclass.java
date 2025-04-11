package interfacejava;

class Vehicle {
	private String make;
	private String model;
	private int year;
	private double rentalPricePerDay;
    public Vehicle(String make, String model, int year, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}

}

class Car extends Vehicle {
	private int numSeats;
     Car(String make, String model, int year, double rentalPricePerDay, int numSeats) {
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
    }
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public int getNumSeats() {
		return numSeats;
	}

}

class Truck extends Vehicle {
	private double cargoCapacity;
     Truck(String make, String model, int year, double rentalPricePerDay, double cargoCapacity) {
        super(make, model, year, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
    }

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
}

	public class Mainclass {
		
		public static void main(String[] args){
		Vehicle vehicleobj= new Vehicle("Toyota", "Corolla", 2020, 50.0);
		Car carobj=  new Car("Honda", "Civic", 2022, 65.0, 5);
		Truck truckobj= new Truck("Ford", "F-150", 2021, 80.0, 3.5);
		vehicleobj.setMake("Toyota");
		vehicleobj.setModel("Camry");
		vehicleobj.setYear(2022);
		vehicleobj.setRentalPricePerDay(79.99);
		System.out.println("VehicleModel: " + vehicleobj.getModel());
		System.out.println("Make: " + vehicleobj.getMake());
		System.out.println("Year: " + vehicleobj.getYear());
		System.out.println("RentalPricePerday: " + vehicleobj.getRentalPricePerDay());
		carobj.setMake("Honda");
		carobj.setModel("Civic");
		carobj.setYear(2023);
		carobj.setRentalPricePerDay(39.99);
		carobj.setNumSeats(5);
    	System.out.println("VehicleModel: "  + carobj.getModel());
		System.out.println("Make: "  + carobj.getMake());
		System.out.println("Year: " + carobj.getYear());
		System.out.println("RentalPricePerday: " + carobj.getRentalPricePerDay());
		System.out.println("Numberof Seats: " + carobj.getNumSeats());

		truckobj.setMake("Ford");
		truckobj.setModel("F-150");
		truckobj.setYear(2021);
		truckobj.setRentalPricePerDay(79.99);
		truckobj.setCargoCapacity(3.5); 
		System.out.println("VehicleModel: "  + truckobj.getModel());
		System.out.println("Make: " + truckobj.getMake());
		System.out.println("Year: " + truckobj.getYear());
		System.out.println("RentalPricePerday: " + truckobj.getRentalPricePerDay());
		System.out.println("Cargocapacity: " + truckobj.getCargoCapacity());

	
		}
	}
