package Bai4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Account tk = new Account(1753062, "Le Minh Khang");
		Account tk2 = new Account(1753000, "Le Thi Thuc Man");
		double money;
		while (true) {
			System.out.println("\t\t\t Ngan Hang MK\n1. Nap tien\n2. Rut tien \n3. Chuyen tien\n4. Thoat\n");
			Scanner scan = new Scanner(System.in);
			System.out.println("Lua chon: ");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("Nhap so tien can nap: ");
				money = scan.nextDouble();
				tk.napTien(money);
				break;

			case 2:
				System.out.println("Nhap so tien can rut: ");
				money = scan.nextDouble();
				tk.rutTien(money);
				break;

			case 3:
				System.out.println("Nhap so tien can chuye: ");
				money = scan.nextDouble();
				tk.chuyenTien(tk2, money);
				break;

			case 4:
				System.exit(0);
				break;
			}
		}
	}
}
