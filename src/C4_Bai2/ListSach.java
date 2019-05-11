package C4_Bai2;

import java.util.ArrayList;
import java.util.List;

public class ListSach {
	private List<Sach> listSach;
	private double sum1,sum2=0;

	public ListSach() {
		super();
		listSach = new ArrayList<Sach>();
	}
	
	public void nhapList(int type) {
		switch(type) {
		case 1:
			SachGiaoKhoa sgk = new SachGiaoKhoa();
			sgk.nhap();
			listSach.add(sgk);
			sum1 +=sgk.getThanhTien();
			
			break;
		case 2:
			SachThamKhao stk = new SachThamKhao();
			stk.nhap();
			listSach.add(stk);
			sum2 +=stk.getThanhTien();
			break;
		}
	}
	 
	public void xuatList() {
		for(int i=0;i<listSach.size();i++) {
			System.out.println(listSach.get(i).toString());
		}
	}
	
	
	public double getSum1() {
		return sum1;
	}

	public void setSum1(double sum1) {
		this.sum1 = sum1;
	}

	public double getSum2() {
		return sum2;
	}

	public void setSum2(double sum2) {
		this.sum2 = sum2;
	}

	public double TinhTBDonGia() {
		double sum = 0;
		int count = 0;
		for(int i=0;i<listSach.size();i++) {
			if(listSach.getClass().equals(SachThamKhao.class)) {
				sum += listSach.get(i).getDonGia();
				count++;
			}
		}
		return sum/count;
	}
	
	public void xuatSGKofNXB(String nxb) {
		for(int i=0;i<listSach.size();i++) {
			if(listSach.getClass().equals(SachGiaoKhoa.class)) {
			if(listSach.get(i).getNhaXuatBan().equals(nxb)) {
				System.out.println(listSach.get(i).toString());
			}
		}
	}}
}
