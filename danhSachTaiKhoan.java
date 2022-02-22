package Thi;

import java.util.*;

public class danhSachTaiKhoan{
	ArrayList <taiKhoanNganHang> lstTK;

	public danhSachTaiKhoan(){
		lstTK = new ArrayList<taiKhoanNganHang>();
	}

	public void nhap(){
		taiKhoanNganHang gd = new taiKhoanNganHang();

		gd.nhap();
		lstTK.add(gd);
	}

	public void in(){
		int i = 0;

		for (i = 0; i<lstTK.size(); i+=1){
			lstTK.get(i).in();
		}
	}
}