package Lab2_Bai3;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		EmployeeService nv = new EmployeeService();
		Scanner s = new Scanner(System.in);
		int choose;
		do {
			System.out.println("-------------QUẢN LÝ NHÂN VIÊN-------------");
			System.out.println("1. Nhập ds.");
			System.out.println("2. Xuất ds.");
			System.out.println("3. Tìm nhân viên theo mã.");
			System.out.println("4. Cập nhật lương của nhân viên.");
			System.out.println("0. Thoát.");
			System.out.print("Mời nhập chức năng: ");
			choose = s.nextInt();
			s.nextLine();
			switch (choose) {
			case 1:
				nv.nhapDanhSach();
				break;
			case 2:
				nv.xuatDanhSach();
				break;
			case 3:
				System.out.println("Hãy nhập Id nhân viên bạn muốn tìm:");
				String idSearch = s.nextLine();
				nv.timViTri(idSearch);
				nv.timKiem(idSearch);
				break;
			case 4:
				System.out.println("Hãy nhập Id nhân viên bạn muốn Cập nhật:");
				String idSearch2 = s.nextLine();
				nv.timKiem(idSearch2);
				nv.updateSalary(idSearch2);
				break;
			case 0:
				System.out.println("Kết thúc chương trình!");
				System.exit(0);
			default:
				System.out.println("Vui lòng chọn lại (0 - 4)!");
			}
		} while (true);
	}
}
