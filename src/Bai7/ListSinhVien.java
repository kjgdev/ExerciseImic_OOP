package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSinhVien {
	List<SinhVien> listSV;

	public ListSinhVien() {
		super();
		listSV = new ArrayList<>();
	}

	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			SinhVien sv = new SinhVien();
			sv.inputData();
			listSV.add(sv);
		}
		sapXep();
	}

	public void sapXep() {
		for (int i = 0; i < listSV.size(); i++) {
			for (int j = 1; j < listSV.size(); j++) {
				if (listSV.get(j).getMaSV() < listSV.get(i).getMaSV())
					swap(listSV.get(i), listSV.get(j));
			}
		}
	}

	public void swap(SinhVien sv1, SinhVien sv2) {
		SinhVien temp = sv1;
		sv1 = sv2;
		sv2 = temp;
	}

	public void printOut() {
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println(listSV.get(i).toString());
		}
	}
}
