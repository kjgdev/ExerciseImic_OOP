package Bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int select = 0;
		Vehicle xe1 = new Vehicle();
		Vehicle xe2 = new Vehicle();
		Vehicle xe3 = new Vehicle();
		Scanner scan = new Scanner(System.in);
		while (select != 3) {
			System.out.println("\n1.	Nhập thông tin và tạo các đối tượng xe1, xe2, xe3\r\n"
					+ "2.	Xuất bảng kê khai tiền thuế trước bạ của các xe.\r\n" + "3.	Thoát.");
			select = scan.nextInt();

			switch (select) {
			case 1:
				xe1.nhap();
				//xe2.nhap();
				//xe3.nhap();
				break;
			case 2:
				System.out.printf("%-20s %-15s %15s %20s %20s","Ten chu xe","Loai xe","Dung tich","Gia tri","Thue");
				xe1.keKhai();
				xe2.keKhai();
				xe3.keKhai();
				break;
			case 3:
				System.exit(0);
			}
		}
	}

}
