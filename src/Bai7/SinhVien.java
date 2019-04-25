package Bai7;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private String diaChi;
	private double soDT;
	public SinhVien(int soNguyen, String hoTen, String diaChi, double soDT) {
		super();
		this.maSV = soNguyen;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDT = soDT;
	}
	public SinhVien() {
		super();
	}
	
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double getSoDT() {
		return soDT;
	}
	public void setSoDT(double soDT) {
		this.soDT = soDT;
	}
	@Override
	public String toString() {
		return "SinhVien [soNguyen=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDT=" + soDT + "]\n";
	}
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien: ");
		this.maSV = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap ho ten: ");
		this.hoTen = scan.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = scan.nextLine();
		System.out.println("Nhap so dien thoai: ");
		this.soDT = scan.nextDouble();
	}
}
