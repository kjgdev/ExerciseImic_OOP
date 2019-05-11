package C4_Bai1;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKM;
	
	public ChuyenXeNoiThanh(int mSoChuyen, String hoTen, int soXe, float doanhThu, int soTuyen, int soKM) {
		super(mSoChuyen, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	
	public ChuyenXeNoiThanh() {
		super();
	}


	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("- Nhap so tuyen: ");
		this.soTuyen = scan.nextInt();
		System.out.println("- Nhap so km: ");
		this.soKM = scan.nextInt();
		scan.nextLine();
	}
}
