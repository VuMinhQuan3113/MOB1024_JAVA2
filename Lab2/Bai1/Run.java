package Lab2_Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Student> dssv = new ArrayList<>();
		System.out.println("Nhập thông tin sinh viên");
		while (true) {
			Student sv = new Student();
			System.out.println("Nhập id sinh viên: ");
			sv.setId(s.nextLine());
			System.out.println("Nhập tên sinh viên: ");
			sv.setName(s.nextLine());

			while (true) {
				System.out.println("Nhập loại sinh viên (REGULAR / PART_TIME / INTERNATIONAL) : ");
				String input = s.nextLine();
				try {
					StudentType type = StudentType.valueOf(input.toUpperCase());
					sv.setType(type);
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Lỗi: Không có loại sinh viên này, vui lòng nhập lại!");
				}
			}
			dssv.add(sv);
			System.out.println("Continue? (Y/N)");
			String check = s.nextLine();
			if (check.equalsIgnoreCase("N")) {
				break;
			}
		}

		System.out.println("Danh sách sinh viên:");
		for (Student sv : dssv) {
			System.out.println(sv);
		}
		System.out.println("Danh sách sinh viên theo từng loại:");
		for (StudentType type : StudentType.values()) {
			System.out.println(type);
			for (Student sv : dssv) {
				if (sv.getType() == type) {
					System.out.println(sv);
				}
			}
		}
		System.out.println("Hiện thị số lượng sinh viên theo từng loại:");
		for (StudentType type : StudentType.values()) {
			int count = 0;
			System.out.println(type);
			for (Student sv : dssv) {
				if (sv.getType() == type) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
