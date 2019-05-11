package C4_Bai1;

import java.util.Scanner;

public class ChuyenXe {
	private int mSoChuyen;
	private String hoTen;
	private int soXe;
	private float doanhThu;
	
	public ChuyenXe() {
		super();
	}
	public ChuyenXe(int mSoChuyen, String hoTen, int soXe, float doanhThu) {
		super();
		this.mSoChuyen = mSoChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	Scanner scan = new Scanner(System.in);
	public int getmSoChuyen() {
		return mSoChuyen;
	}
	public void setmSoChuyen(int mSoChuyen) {
		this.mSoChuyen = mSoChuyen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public float getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	public void nhap() {
		System.out.println("- Nhap ma so chuyen xe: ");
		this.mSoChuyen = scan.nextInt();
		scan.nextLine();
		System.out.println("- Nhap ho ten tai xe: ");
		this.hoTen = scan.nextLine();
		System.out.println("- Nhap so xe: ");
		this.soXe = scan.nextInt();
		System.out.println("- Nhap doanh thu: ");
		this.doanhThu = scan.nextFloat();
		scan.nextLine();
	}
}
