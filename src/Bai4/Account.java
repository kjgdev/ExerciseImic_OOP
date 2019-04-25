package Bai4;

import java.util.Scanner;

public class Account {
	final double LAISUAT = 0.035;
	final double PHI = 1000;
	private long soTK;
	private String tenTK;
	private double soTien;

	public Account(long soTK, String tenTK, double soTien) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTien = soTien;
	}

	public Account() {
	}

	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		this.soTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}

	@Override
	public String toString() {
		return "Account [soTK=" + soTK + ", tenTK=" + tenTK + ", soTien=" + soTien + " vnd]";
	}

	public Account(long soTK, String tenTK) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTien = 50;
	}

	public void napTien(double money) {
		if (money < 0) {
			System.out.println("Khong hop le, so tien be hon 0");
			return;
		}
		this.soTien = this.soTien + money;
		System.out.println("Success!");
	}

	public void rutTien(double money) {
		if ((money + PHI) > this.soTien) {
			System.out.println("Khong du so du!");
			return;
		}
		this.soTien = this.soTien - (money + PHI);
		System.out.println("Success!");
	}

	public void daoHan() {
		this.soTien = this.soTien + this.soTien * LAISUAT;
	}

	public void chuyenTien(Account tk, double money) {
		if ((money + PHI) > this.soTien) {
			System.out.println("Khong du so du!");
			return;
		}
		rutTien(money);
		tk.napTien(money);
	}
}
