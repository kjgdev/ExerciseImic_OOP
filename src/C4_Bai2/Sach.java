package C4_Bai2;

import java.util.Calendar;
import java.util.Scanner;

import sun.security.jca.GetInstance;

public class Sach {
	private int maSach;
	private Calendar ngayNhap;
	protected double donGia;
	protected int soLuong;
	private String nhaXuatBan;
	protected double thanhTien;
	
	Scanner scan = new Scanner(System.in);
	

	public Sach() {
		super();
		this.ngayNhap = Calendar.getInstance();
	}


	public void nhap() {
		System.out.println("- Nhap ma sach: ");
		this.maSach = scan.nextInt();
		System.out.println("- Nhap ngay nhap (dd/mm/yyyy): ");
		
		this.ngayNhap.set(Calendar.DAY_OF_MONTH, scan.nextInt());
		this.ngayNhap.set(Calendar.MONTH, scan.nextInt());
		this.ngayNhap.set(Calendar.YEAR, scan.nextInt());
		System.out.println("- Nhap don gia: ");
		this.donGia = scan.nextDouble();
		System.out.println("- Nhap so luong: ");
		this.soLuong = scan.nextInt();
		scan.nextLine();
		System.out.println("- Nhap ten nha xuat ban: ");
		this.nhaXuatBan = scan.nextLine();
	}


	public String getNhaXuatBan() {
		return nhaXuatBan;
	}


	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}


	public double getThanhTien() {
		return thanhTien;
	}


	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}


	@Override
	public String toString() {
		return "maSach=" + maSach + ", ngayNhap=" + ngayNhap.get(Calendar.DAY_OF_MONTH)+ngayNhap.get(Calendar.MONTH) + ngayNhap.get(Calendar.YEAR) + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + ", thanhTien=" + thanhTien;
	}
	
	
	
}
