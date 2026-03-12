package silde1;

public class Xe {
	private int namSanXuat;
	private String hangXe;
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public String getHangXe() {
		return hangXe;
	}
	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	public void xuat() {
		System.out.println("Hãng xe: "+ this.hangXe + "\n" + "Năm sản xuất: " + this.namSanXuat);
	}
}
