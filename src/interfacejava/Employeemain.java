package interfacejava;

class Emoloyee {
	Emoloyee(int id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private int id;
	private String name;
	private String salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}

class Manager extends Emoloyee {
	private String department;

	Manager(int id, String name, String salary, String department) {
		super(id, name, salary);
		this.department = department;

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

public class Employeemain {
	public static void main(String[] args) {
		Emoloyee employeobj = new Emoloyee(1234, "Rose", "$350");
		Manager mangerobj = new Manager(1294, "Kev", "$450", "IT");
		employeobj.setId(1234);
		employeobj.setName("Rose");
		employeobj.setSalary("$350");
		System.out.println("Employee id: " + employeobj.getId());
		System.out.println("Employee Name: " + employeobj.getName());
		System.out.println("Employee Salary: " + employeobj.getSalary());
		mangerobj.setId(1294);
		mangerobj.setName("Kev");
		mangerobj.setSalary("$450");
		mangerobj.setDepartment("IT");
		System.out.println("Manager id: " + mangerobj.getId());
		System.out.println("Manager Name: " + mangerobj.getName());
		System.out.println("Manager Salary: " + mangerobj.getSalary());
		System.out.println("Manager Department: " + mangerobj.getDepartment());

	}

}