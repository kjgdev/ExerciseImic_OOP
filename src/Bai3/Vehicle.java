package Bai3;

import java.util.Scanner;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private float giaTri;
	private float thue;
	
	public void tinhThue() {
		if (this.dungTich < 100)
			this.thue = this.giaTri * 1 / 100;
		else if (this.dungTich <= 200)
			this.thue = this.giaTri * 3 / 100;
		else
			this.thue =this.giaTri *5 / 100 ;
	}
	
	public Vehicle() {
		this.tenChuXe = "";
		this.loaiXe = "";
		this.dungTich = 0;
		this.giaTri = 0;
		this.thue = 0;
		
	}

	public void keKhai() {
		System.out.printf("\n%-20s %-15s %15d %20.2f %20.5f",this.tenChuXe,this.loaiXe,this.dungTich,this.giaTri,this.thue);
	}
	
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ten chu xe: ");
		this.tenChuXe = scan.nextLine();
		System.out.println("Loai xe: ");
		this.loaiXe = scan.nextLine();
		System.out.println("Dung tich: ");
		this.dungTich = scan.nextInt();
		System.out.println("Gia tri xe: ");
		this.giaTri = scan.nextFloat();
		tinhThue();
	}
}
