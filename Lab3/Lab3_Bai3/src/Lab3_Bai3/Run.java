package Lab3_Bai3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Run {
	public static void main(String[] args) {
		List<Employee> dsnv = new ArrayList<>();
		dsnv.add(new Employee("NV01", "An", 1500.0));
		dsnv.add(new Employee("NV02", "Bình", 1200.5));
		dsnv.add(new Employee("NV03", "Chi", 2000.0));
		dsnv.add(new Employee("NV04", "Dũng", 1850.0));
		dsnv.add(new Employee("NV05", "Em", 1100.0));
		dsnv.add(new Employee("NV06", "Anh", 2500.0));
		dsnv.add(new Employee("NV07", "Hương", 2500.0));
		dsnv.add(new Employee("NV08", "Khánh", 1700.0));
		double totalSalary = dsnv.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Tổng lương của tất cả nhân viên: " + totalSalary);
		OptionalDouble average = dsnv.stream().mapToDouble(Employee::getSalary).average();
		System.out.println("Lương trung bình: " + average.getAsDouble());
		Optional<Employee> topEmployee = dsnv.stream().max(Comparator.comparingDouble(Employee::getSalary));
		topEmployee.ifPresent(emp -> System.out.println(
				"Nhân viên lương cao nhất là " + emp.getName() + " id " + emp.getId() + ": " + emp.getSalary()));

	}
}
