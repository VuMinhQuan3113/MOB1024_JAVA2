package Lab2_Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	private List<Employee> dsnv = new ArrayList<>();
	private static Scanner s = new Scanner(System.in);

	public void nhapDanhSach() {
		while (true) {
			System.out.println("Nhập Id: ");
			String id = s.nextLine();
			System.out.println("Nhập Name: ");
			String name = s.nextLine();
			System.out.println("Nhập Salary: ");
			double salary = s.nextDouble();
			s.nextLine();
			dsnv.add(new Employee(id, name, salary));
			System.out.print("Continue? (Y/N): ");
			if (s.nextLine().equalsIgnoreCase("n"))
				break;
		}
	}

	public void xuatDanhSach() {

		if (dsnv.isEmpty()) {
			System.out.println("Không có nhân viên trong danh sách!");
			return;
		}
		System.out.printf("%-5s %-15s %-10s\n", "Id", "Name", "Salary");
		dsnv.forEach(System.out::println);
	}

	public int timViTri(String idSearch) {
		for (int i = 0; i < dsnv.size(); i++) {
			if (dsnv.get(i).getId().equalsIgnoreCase(idSearch))
				return i;
		}
		return -1;
	}

	public void timKiem(String idSearch) {
		int vitri = timViTri(idSearch);
		if (vitri == -1) {
			System.out.println("Không tìm thấy nhân viên mã: " + idSearch);
		} else {
			System.out.printf("%-5s %-15s %-10s\n", "Id", "Name", "Salary");
			System.out.println(dsnv.get(vitri));
		}
	}

	public void updateSalary(String idSearch) {
		int vitri = timViTri(idSearch);
		if (vitri == -1) {
			System.out.println("Không tìm thấy nhân viên mã: " + idSearch);
		} else {
			System.out.println("Cập nhật lương mới cho Nhân viên mã" + idSearch + ": ");
			double luongNew = Double.parseDouble(s.nextLine());
			dsnv.get(vitri).setSalary(luongNew);
			System.out.println("Cập nhật thành công!");
		}
	}
}
