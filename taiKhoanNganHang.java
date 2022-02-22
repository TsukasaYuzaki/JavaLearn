package Thi;

import java.util.*;

public class taiKhoanNganHang extends danhSachGD{
	String soTK;
	float soDU;

	danhSachGD lstGD;

	public taiKhoanNganHang(){
		soTK = "";
		soDU = (float)0;
		lstGD = new danhSachGD();
	}

	public void nhap(){
		Scanner sc = new Scanner(System.in);

		System.out.print("\nNhap vao so tai khoan: ");
		soTK = sc.nextLine();

		
		System.out.print("\nNhap vao so du trong tai khoan: ");
		soDU = sc.nextFloat();

		sc.next();
		System.out.print("\nNhap vao thong tin giao dich: ");
		lstGD.nhap();
	}
}