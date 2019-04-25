package Bai5;

public class PhanSo {
	private int num;
	private int deno;

	public PhanSo(int num, int deno) {
		super();
		this.num = num;
		this.deno = deno;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDeno() {
		return deno;
	}

	public void setDeno(int deno) {
		this.deno = deno;
	}

	public int ucln() {
		int num = Math.abs(this.num);
		int deno = Math.abs(this.deno);

		if (num * deno == 0)
			return 1;

		while (num != deno) {
			if (num > deno)
				num -= deno;
			else
				deno -= num;
		}
		return num;
	}

	public void reduce() {
		this.num = this.num / ucln();
		this.deno = this.deno / ucln();
	}

	public void reciprocal() {
		int temp = this.num;
		this.num = this.deno;
		this.deno = temp;
	}

	public PhanSo add(PhanSo ps) {
		int num = this.num * ps.getDeno() + this.deno * ps.getNum();
		int deno = this.deno * ps.getDeno();
		PhanSo result = new PhanSo(num, deno);
		return result;
	}

	public PhanSo subtract(PhanSo ps) {
		int num = this.num * ps.getDeno() - this.deno * ps.getNum();
		int deno = this.deno * ps.getDeno();
		PhanSo result = new PhanSo(num, deno);
		return result;
	}

	public PhanSo mltiply(PhanSo ps) {
		int num = this.num * ps.getNum();
		int deno = this.deno * ps.getDeno();
		PhanSo result = new PhanSo(num, deno);
		return result;
	}

	public PhanSo divide(PhanSo ps) {
		ps.reciprocal();
		int num = this.num * ps.getNum();
		int deno = this.deno * ps.getDeno();
		PhanSo result = new PhanSo(num, deno);
		return result;
	}

	public int compare(PhanSo ps) {
		int num1, num2;
		num1 = this.num * ps.getDeno();
		num2 = this.deno * ps.getNum();
		if (num1 > num2)
			return 1;
		else if (num1 < num2)
			return -1;
		else
			return 0;
	}
}
