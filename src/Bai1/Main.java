package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int chieuDai,chieuRong;

		System.out.println("Nhap chieu dai, rong: ");
		chieuDai = new Scanner(System.in).nextInt();
		chieuRong = new Scanner(System.in).nextInt();
		
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.setChieuDai(chieuDai);
		hcn.setChieuRong(chieuRong);
		
		System.out.println(hcn.toString());
	}
}
