package C4_Bai1;

import java.util.ArrayList;
import java.util.List;

public class ListCX {
	private List<ChuyenXe> listCX = new ArrayList<ChuyenXe>();
	private float sum1,sum2 = 0.0f;
	
	public void nhapList(int type) {
		switch (type) {
		case 1:
			ChuyenXeNoiThanh cxNoiThanh = new ChuyenXeNoiThanh();
			cxNoiThanh.nhap();
			listCX.add(cxNoiThanh);
			sum1 += cxNoiThanh.getDoanhThu();
			break;
		case 2:
			ChuyenXeNgoaiThanh cxNgoaiThanh = new ChuyenXeNgoaiThanh();
			cxNgoaiThanh.nhap();
			listCX.add(cxNgoaiThanh);
			sum2 += cxNgoaiThanh.getDoanhThu();
			break;
		}
	}

	public float getSum1() {
		return sum1;
	}

	public float getSum2() {
		return sum2;
	}
	
	
}
