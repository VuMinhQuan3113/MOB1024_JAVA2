package Lab2_Bai3;

public class Employee {
	private String id;
	private String name;
	private double salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	public void Nhap() {
//		System.out.println("Nhập id: ");
//		setId(s.nextLine());
//		System.out.println("Nhập Name: ");
//		setName(s.nextLine());
//		System.out.println("Nhập Salary: ");
//		setSalary(s.nextDouble());
//		s.nextLine();
//	}
//
//	public void Xuat() {
//		System.out.printf("%-5s %-15s %.0f", this.id, this.name, this.salary);
//	}
	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%-5s %-15s %.0f", this.id, this.name, this.salary);
	}

}
