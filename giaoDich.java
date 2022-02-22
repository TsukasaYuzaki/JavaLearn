package Thi;

import java.util.*;

public class giaoDich{
	String maGD;
	String ngayGD;

	float soTienGD;
	String loaiGD;

	public giaoDich(){
		maGD = "";
		ngayGD = "";
		soTienGD = (float)0.0;
		loaiGD = "";
	}

	public void nhap(){
		Scanner sc = new Scanner(System.in);
		sc.next();
		System.out.print("\nNhap vao ma giao dich: ");
		
		maGD = sc.nextLine();

		System.out.print("\nNhap vao ngay giao dich: ");
		ngayGD = sc.nextLine();
		//sc.next();
		System.out.print("\nNhap vao so tien giao dich: ");
		soTienGD = sc.nextFloat();
		sc.next(); 

		System.out.print("\nNhap vao loai giao dich: ");
		loaiGD = sc.nextLine();
	}

	public void in(){
		System.out.print("\n--------------------------------\n");
		System.out.print("Ma giao dich: " + maGD);
		System.out.print("\nNgay giao dich: " + ngayGD);
		System.out.printf("\nSo tien giao dich: %f", soTienGD);
		System.out.print("\nLoai giao dich: " + loaiGD);
	}
}