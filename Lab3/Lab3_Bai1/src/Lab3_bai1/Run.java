package Lab3_bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<String> danhSachTen = new ArrayList<>(
				Arrays.asList("Giangg", "Bình", "Dũng", "Em", "Chi", "Hươngg", "Khánh", "Linh", "An", "Minh"));
		danhSachTen.forEach(System.out::println);
		System.out.println("Các tên có độ dài > 5 là:");
		danhSachTen.stream().filter(name -> name.length() > 5).forEach(System.out::println);
		System.out.println("Sắp xếp A - Z: ");
		danhSachTen.stream().sorted().forEach(System.out::println);
		System.out.println("Sắp xếp theo độ dài tăng dần: ");
		danhSachTen.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
	}
}
