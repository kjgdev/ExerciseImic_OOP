package Bai2;

public class SinhVien {
	private int mSSV;
	private String hoTen;
	float diemLT, diemTH;

	public int getmSSV() {
		return mSSV;
	}

	public void setmSSV(int mSSV) {
		this.mSSV = mSSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	public SinhVien() {
		this.mSSV = 0;
		this.hoTen = "";
		this.diemLT = 0;
		this.diemTH = 0;
	}

	public SinhVien(int mSSV, String hoTen, float diemLT, float diemTH) {
		this.mSSV = mSSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	
	public float diemTB() {
		return (this.diemLT + this.diemTH) /2;
	}

	@Override
	public String toString() {
		return "SinhVien [mSSV=" + mSSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH
				+ ", diemTB()=" + diemTB() + "]";
	}
	
	

}
