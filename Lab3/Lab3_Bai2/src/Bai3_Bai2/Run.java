package Bai3_Bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {
	public static void main(String[] args) {
		List<Employee> dsnv = new ArrayList<>();
		dsnv.add(new Employee("NV01", "An", 1500.0));
		dsnv.add(new Employee("NV02", "Bình", 1200.5));
		dsnv.add(new Employee("NV03", "Chi", 2000.0));
		dsnv.add(new Employee("NV04", "Dũng", 1850.0));
		dsnv.add(new Employee("NV05", "Em", 1100.0));
		dsnv.add(new Employee("NV06", "Anh", 2500.0));
		dsnv.add(new Employee("NV07", "Hương", 1400.0));
		dsnv.add(new Employee("NV08", "Khánh", 1700.0));
		Stream<Employee> nhanVienLuongCao = dsnv.stream().filter(nv -> nv.salary >= 1200);
		System.out.println("NHÂN VIÊN CÓ LƯƠNG >= 1000");
		nhanVienLuongCao.forEach(System.out::println);
		System.out.println("Sắp xếp nhân viên theo salary giảm dần");
		dsnv.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("danh sách tên nhân viên");
		List<String> employeeNames = dsnv.stream().map(Employee::getName).collect(Collectors.toList());
		employeeNames.forEach(System.out::println);
		long count = dsnv.stream().filter(emp -> emp.getName().trim().startsWith("A")).count();
		System.out.println("Số người có tên bắt đầu bằng chữ A: " + count);
	}
}
