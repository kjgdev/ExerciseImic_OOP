package C4_Bai2;

import java.util.Scanner;

public class SachThamKhao extends Sach {
	private double thue;

	Scanner scan = new Scanner(System.in);
	
	public SachThamKhao() {
		super();
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("- Nhap thue: ");
		this.thue = scan.nextDouble();
		scan.nextLine();
		this.thanhTien = this.soLuong * this.donGia + this.thue;
	}

	@Override
	public String toString() {
		return "SachThamKhao [" + super.toString() + "thue=" + thue +  "]";
	}
	
}
