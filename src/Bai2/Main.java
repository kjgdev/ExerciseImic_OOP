package Bai2;

import java.util.Scanner;

public class Main {
	public static void printInfor(SinhVien sv) {
		System.out.printf("%-10d %-20s %-7.2f %-7.2f\n", sv.getmSSV(), sv.getHoTen(), sv.getDiemLT(), sv.getDiemTH());
	}

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(1753001, "Le Thi Thuc Man", 10f, 10f);
		SinhVien sv2 = new SinhVien(1753062, "Le Minh Khang", 10f, 10f);
		SinhVien sv3 = new SinhVien();

		Scanner scan = new Scanner(System.in);
		
		System.out.println("MSSV: ");
		sv3.setmSSV(scan.nextInt());
		scan.nextLine();
		System.out.println("Ho Ten: ");
		sv3.setHoTen(scan.nextLine());
		System.out.println("Diem LT: ");
		sv3.setDiemLT(scan.nextFloat());
		System.out.println("Diem TH: ");
		sv3.setDiemTH(scan.nextFloat());

		printInfor(sv1);
		printInfor(sv2);
		printInfor(sv3);
	}

}
