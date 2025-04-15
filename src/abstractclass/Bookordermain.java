package abstractclass;

class Customer {
	private String customerName;
	private String custmerId;

	public Customer(String customerName, String custmerId) {
		this.customerName = customerName;
		this.custmerId = custmerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustmerId() {
		return custmerId;
	}

}

class Bookorder extends Customer {
	private double orderAmount;

	public Bookorder(String customerName, String custmerId, double orderAmount) {
		super(customerName, custmerId);

		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

}

public class Bookordermain {
	public static void main(String[] args) {

		Bookorder bookorder = new Bookorder("Deepak Jha", "TYP00145", 452.35);
		System.out.println("Book Order Details for Customer:");
		System.out.println("Customer Name: " + bookorder.getCustomerName());
		System.out.println("Customer ID: " + bookorder.getCustmerId());
		System.out.println("Order Amount: $" + bookorder.getOrderAmount());

	}

}
