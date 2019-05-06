package Bai8;

import java.util.Scanner;

public class CD {
	private int maCD;
	private String tuaCD;
	private String caSi;
	private int soBaiHat;
	private float gia;

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public String getCaSi() {
		return caSi;
	}

	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public CD(int maCD, String tuaCD, String caSi, int soBaiHat, float gia) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.gia = gia;
	}

	public CD() {
		super();
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", caSi=" + caSi + ", soBaiHat=" + soBaiHat + ", gia=" + gia
				+ "]\n";
	}

	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma CD: ");
		this.maCD = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap tua CD: ");
		this.tuaCD = scan.nextLine();
		System.out.println("Nhap ten ca si: ");
		this.caSi = scan.nextLine();
		while (true) {
			System.out.println("Nhap so bai hat: ");
			this.soBaiHat = scan.nextInt();
			if (this.soBaiHat > 0)
				break;
		}

		while (true) {
			System.out.println("Nhap gia: ");
			this.gia = scan.nextFloat();
			if (this.soBaiHat > 0)
				break;
		}

	}
}
