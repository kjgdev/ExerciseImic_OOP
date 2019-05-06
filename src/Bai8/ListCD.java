package Bai8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListCD {
	List<CD> listCD;

	public ListCD() {
		super();
		listCD = new ArrayList<CD>();
	}
	
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t\t Them 1 CD");
		CD cd = new CD();
		cd.inputData();
		listCD.add(cd);
	}
	
	public int soLuongCD() {
		return listCD.size(); 
	}
	
	public float tongGiaCD() {
		float gia=0;
		for(int i=0;i<listCD.size();i++) {
			gia += listCD.get(i).getGia();
		}
		return gia;
	}
	
	public void printData() {
		for(int i=0;i<listCD.size();i++) {
		System.out.println(listCD.get(i).toString());
		}
	}
	
}
