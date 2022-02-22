package Thi;

import java.util.*;

public class danhSachGD{
	ArrayList <giaoDich> lstGD;

	public danhSachGD(){
		lstGD = new ArrayList<giaoDich>();
	}

	public void nhap(){
		giaoDich gd = new giaoDich();

		gd.nhap();
		lstGD.add(gd);
	}

	public void in(){
		int i = 0;

		for (i = 0; i<lstGD.size(); i+=1){
			lstGD.get(i).in();
		}
	}
}