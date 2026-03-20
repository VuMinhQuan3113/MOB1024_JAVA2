package Lab2_Bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Product> dssp = new ArrayList<>();
		// Nhập dssp từ bàn phím
//		while (true) {
//			Product sp = new Product();
//			System.out.println("Nhập mã sản phẩm: ");
//			sp.setId(s.nextLine());
//			System.out.println("Nhập tên sản phẩm: ");
//			sp.setName(s.nextLine());
//			System.out.println("Nhập giá sản phẩm: ");
//			sp.setPrice(s.nextDouble());
//			s.nextLine();
//			while (true) {
//				System.out.println("Nhập loại sản phẩm (FOOD, ELECTRONIC, CLOTHING): ");
//				String input = s.nextLine();
//				try {
//					ProductCategory category = ProductCategory.valueOf(input.toUpperCase());
//					sp.setCategory(category);
//					break;
//				} catch (IllegalArgumentException e) {
//					System.out.println("Lỗi: Không có loại sản phẩm này, vui lòng nhập lại!");
//				}
//			}
//			dssp.add(sp);
//			System.out.println("Continue? (Y/N)");
//			String check = s.nextLine();
//			if (check.equalsIgnoreCase("N")) {
//				break;
//			}
//		}
		dssp.add(new Product("P01", "Gạo ST25 5kg", 150000.0, ProductCategory.FOOD));
		dssp.add(new Product("P02", "Mì Hảo Hảo thùng 30 gói", 120000.0, ProductCategory.FOOD));
		dssp.add(new Product("P03", "Sữa tươi Vinamilk 1 lít", 35000.0, ProductCategory.FOOD));
		dssp.add(new Product("P04", "Thịt bò Kobe 1kg", 2500000.0, ProductCategory.FOOD));
		dssp.add(new Product("P05", "Điện thoại iPhone 15", 25000000.0, ProductCategory.ELECTRONIC));
		dssp.add(new Product("P06", "Laptop Dell XPS", 35000000.0, ProductCategory.ELECTRONIC));
		dssp.add(new Product("P07", "Tai nghe Bluetooth Sony", 4500000.0, ProductCategory.ELECTRONIC));
		dssp.add(new Product("P08", "Áo thun nam", 150000.0, ProductCategory.CLOTHING));
		dssp.add(new Product("P09", "Quần jean nữ", 350000.0, ProductCategory.CLOTHING));
		dssp.add(new Product("P10", "Áo khoác mùa đông", 550000.0, ProductCategory.CLOTHING));
		for (Product sp : dssp) {
			System.out.println(sp);
		}
		HashMap<ProductCategory, Integer> product = new HashMap<>();
		for (Product sp : dssp) {
			ProductCategory category = sp.getCategory();
			if (product.containsKey(category)) {
				product.put(category, product.get(category) + 1);
			} else {
				product.put(category, 1);
			}
		}

		System.out.println("Số Lượng Food: " + product.get(ProductCategory.FOOD));
		System.out.println("Số Lượng Electronic: " + product.get(ProductCategory.ELECTRONIC));
		System.out.println("Số Lượng CLOTHING: " + product.get(ProductCategory.CLOTHING));
		Map<ProductCategory, Double> tongTienTheoLoai = new HashMap<>();
		for (Product sp : dssp) {
			ProductCategory loai = sp.getCategory();
			double gia = sp.getPrice();
			tongTienTheoLoai.put(loai, tongTienTheoLoai.getOrDefault(loai, 0.0) + gia);
		}
		System.out.println("\n--- TỔNG GIÁ TRỊ THEO TỪNG LOẠI ---");
		for (Map.Entry<ProductCategory, Double> entry : tongTienTheoLoai.entrySet()) {
			System.out.println("- Loại " + entry.getKey() + ": " + entry.getValue());
		}
	}
}
