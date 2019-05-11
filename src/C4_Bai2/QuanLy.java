package C4_Bai2;

import java.util.Scanner;

public class QuanLy {
	public static void main(String[] args) {
		ListSach listSach = new ListSach();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. Nhap sach giao khoa");
			System.out.println("2. Nhap sach tham khao");
			System.out.println("3. Xuat danh sach");
			System.out.println("4. Tinh tong thanh tien tung loai");
			System.out.println("5. Trung binh cong don gia sach tham khao");
			System.out.println("6. Sach giao khoa nha xuat ban X");
			System.out.println("7. Thoat");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				listSach.nhapList(1);
				break;
			case 2:
				listSach.nhapList(2);
				break;
			case 3:
				listSach.xuatList();
				break;
			case 4:
				System.out.println("Thanh tien sach giao khoa: " + listSach.getSum1());
				System.out.println("Thanh tien sach tham khao: " + listSach.getSum2());
				break;
			case 5:
				System.out.println(listSach.TinhTBDonGia());
				break;
			case 6:
				System.out.println("Nhap nha xuat ban X");
				String nxb = scan.nextLine();
				listSach.xuatSGKofNXB(nxb);
				break;
			case 7:
				System.exit(0);
			}
		}
	}
}
