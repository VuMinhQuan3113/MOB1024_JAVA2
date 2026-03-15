package Lab1_Bai2;

import java.util.ArrayList;

public class Lab1_Bai2 {
	public static void main(String[] args) {
		ArrayList<Employee> dsnv = new ArrayList<>();
		dsnv.add(new FullTimeEmployee("NV01", "Nguyen Van A", 10000000, 2000000, 500000));
		dsnv.add(new FullTimeEmployee("NV02", "Tran Thi B", 12000000, 1000000, 0));
		dsnv.add(new FullTimeEmployee("NV03", "Le Van C", 15000000, 3000000, 1000000));
		dsnv.add(new PartTimeEmployee("NV04", "Pham D", 0, 120, 50000));
		dsnv.add(new PartTimeEmployee("NV05", "Hoang E", 0, 80, 60000));
		System.out.println("=== DANH SÁCH NHÂN VIÊN ===");
		for (Employee emp : dsnv) {
			System.out.println(emp.toString());
		}
		dsnv.sort((emp1, emp2) -> Double.compare(emp2.income(), emp1.income()));
		Employee maxIncomeEmp = dsnv.get(0);
		System.out.println("\n=== NHÂN VIÊN CÓ THU NHẬP CAO NHẤT ===");
		System.out.println(maxIncomeEmp.toString());
	}

}
