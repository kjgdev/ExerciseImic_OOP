package Bai6;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private Calendar ngaySX;
	private double donGia;
	private Calendar ngayHH;

	public HangThucPham(String maHang) {
		super();
		this.maHang = maHang;
	}

	public HangThucPham(String maHang, String tenHang, Calendar ngaySX, double donGia, Calendar ngayHH) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.ngaySX = ngaySX;
		this.donGia = donGia;
		this.ngayHH = ngayHH;
	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public Calendar getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(Calendar ngaySX) {
		this.ngaySX = ngaySX;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Calendar getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(Calendar ngayHH) {
		this.ngayHH = ngayHH;
	}

	public HangThucPham() {
		super();
		this.ngaySX = Calendar.getInstance();
		this.ngayHH = Calendar.getInstance();
	}

	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t\tNhap thong tin");
		System.out.println("Ma Hang:");
		this.maHang = scan.nextLine();
		System.out.println("Ten hang:");
		this.tenHang = scan.nextLine();
		while (true) {
			System.out.println("Don gia: ");
			this.donGia = scan.nextDouble();
			if (donGia > 0)
				break;
		}
		System.out.println("Ngay san xuat:");
		this.ngaySX.set(Calendar.DAY_OF_MONTH, scan.nextInt());
		this.ngaySX.set(Calendar.MONTH, scan.nextInt());
		this.ngaySX.set(Calendar.YEAR, scan.nextInt());
		while (true) {
			System.out.println("Ngay het han:");
			this.ngayHH.set(Calendar.DAY_OF_MONTH, scan.nextInt());
			this.ngayHH.set(Calendar.MONTH, scan.nextInt());
			this.ngayHH.set(Calendar.YEAR, scan.nextInt());
			if (ngayHH.after(this.ngaySX))
				break;
		}
	}

}
