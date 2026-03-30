package Lab3_Bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
	public static void main(String[] args) {
		List<Student> dssv = new ArrayList<>(
				Arrays.asList(new Student("S01", "Nguyen Van An", StudentType.REGULAR, 3.5),
						new Student("S02", "Tran Thi Binh", StudentType.PART_TIME, 3.2),
						new Student("S03", "Lê Hoang Chuc", StudentType.INTERNATIONAL, 4.0),
						new Student("S04", "Pham Minh Dung", StudentType.REGULAR, 3.8),
						new Student("S05", "Doan Thu Giang", StudentType.PART_TIME, 3.5),
						new Student("S06", "Hoang Van Hai", StudentType.INTERNATIONAL, 3.1),
						new Student("S07", "Bui Thi Khanh", StudentType.REGULAR, 3.5),
						new Student("S08", "Vu Duc Loc", StudentType.PART_TIME, 3.0),
						new Student("S09", "Truong Gia Nghi", StudentType.INTERNATIONAL, 3.8),
						new Student("S10", "Phan Thanh Tam", StudentType.REGULAR, 3.0)));
		System.out.println("Danh sách sinh viên INTERNATIONAL có GPA >= 3.2");

		List<Student> filterStudents = dssv.stream()
				.filter(s -> s.getType() == StudentType.INTERNATIONAL && s.getGpa() >= 3.2)
				.collect(Collectors.toList());
		if (filterStudents.isEmpty()) {
			System.out.println("Không có sinh viên nào thỏa mãn điều kiện.");
		} else {
			filterStudents.forEach(
					s -> System.out.println(s.getName() + "  Type: " + s.getType() + " có GPA: " + s.getGpa()));

		}
		System.out.println("Top 3 sinh viên có GPA cao nhất");
		List<Student> top3Students = dssv.stream().sorted(Comparator.comparingDouble(Student::getGpa).reversed())
				.limit(3).collect(Collectors.toList());
		top3Students.forEach(s -> System.out
				.println("Hạng " + (top3Students.indexOf(s) + 1) + ": " + s.getName() + " có GPA: " + s.getGpa()));
		List<String> partTimeNames = dssv.stream().filter(s -> s.getType() == StudentType.PART_TIME)
				.map(Student::getName).collect(Collectors.toList());
		System.out.println("Tên các sinh viên học PART_TIME:");
		partTimeNames.forEach(System.out::println);
	}
}
