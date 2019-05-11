package C4_Bai1;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgay;
	Scanner scan = new Scanner(System.in);
	
	
	public ChuyenXeNgoaiThanh() {
		super();
	}
	public ChuyenXeNgoaiThanh(int mSoChuyen, String hoTen, int soXe, float doanhThu, String noiDen, int soNgay) {
		super(mSoChuyen, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("- Nhap noi den: ");
		this.noiDen = scan.nextLine();
		System.out.println("- Nhap so ngay di duoc: ");
		this.soNgay = scan.nextInt();
		scan.nextLine();
	}

}
