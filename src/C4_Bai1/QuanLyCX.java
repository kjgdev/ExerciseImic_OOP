package C4_Bai1;

import java.util.Scanner;

public class QuanLyCX {
	public static void main(String[] args) {
		ListCX qLy = new ListCX();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("\t\t\t Quan ly chuyen xe\n");
		System.out.println("1. Nhap thong tin chuyen xe noi thanh.");
		System.out.println("2. Nhap thong tin chuyen xe ngoai thanh.");
		System.out.println("3. Doanh thu xe noi thanh.");
		System.out.println("4. Doanh thu xe ngoai thanh.");
		System.out.println("5. Thoat.");
		System.out.println("Lua chon:");
		
		int select = scan.nextInt();
		scan.nextLine();
		switch(select) {
		case 1: 
			qLy.nhapList(1);
			break;
		case 2:
			qLy.nhapList(2);
			break;
		case 3:
			System.out.println("Doanh thu: " + qLy.getSum1());
			break;
		case 4:
			System.out.println("Doanh thu: " + qLy.getSum2());
			break;
		case 5:
			System.exit(0);
		}
	}
	
	}
}
