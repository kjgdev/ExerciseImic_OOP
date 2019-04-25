package Bai1;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public int chuVi() {
		return (this.chieuDai + this.chieuRong)*2;
	}
	
	public int dienTich() {
		return this.chieuDai*this.chieuRong;
	}
	@Override
	public String toString() {
		return "HinhChuNhat [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", chuVi()=" + chuVi()
				+ ", dienTich()=" + dienTich() + "]";
	}
	
	
	
}
