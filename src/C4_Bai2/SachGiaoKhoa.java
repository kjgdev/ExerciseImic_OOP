package C4_Bai2;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang; // true: moi false: cu
	
	Scanner scan = new Scanner(System.in);
	
	public SachGiaoKhoa() {
		super();
	}


	public void nhap() {
		super.nhap();
		System.out.println("- Nhap tinh trang sach(true: moi): ");
		this.tinhTrang = scan.nextBoolean();
		if(tinhTrang) {
			this.thanhTien = this.soLuong * this.donGia;
		}
		else {
			this.thanhTien = this.soLuong * this.donGia * (50/100);
		}
		
	}


	@Override
	public String toString() {
		return "SachGiaoKhoa [" + super.toString() +"tinhTrang=" + tinhTrang  +  "]";
	}



}
