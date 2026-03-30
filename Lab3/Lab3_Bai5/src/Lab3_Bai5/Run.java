package Lab3_Bai5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
		Map<StudentType, Long> countByType = dssv.stream()
				.collect(Collectors.groupingBy(Student::getType, Collectors.counting()));
		System.out.println("Thống kê số lượng sinh viên theo loại:");
		countByType.forEach((type, count) -> System.out.println(type + ": " + count + " sinh viên"));
		Map<StudentType, Double> gpaTBbyType = dssv.stream()
				.collect(Collectors.groupingBy(Student::getType, Collectors.averagingDouble(Student::getGpa)));
		System.out.println("Điểm GPA trung bình theo từng loại sinh viên");
		gpaTBbyType.forEach((type, avgGpa) -> System.out.println(type + ": " + String.format("%.2f", avgGpa)));
		Map<StudentType, Double> gpaTB = dssv.stream()
				.collect(Collectors.groupingBy(Student::getType, Collectors.averagingDouble(Student::getGpa)));
	}
}
