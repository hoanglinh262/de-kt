package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * text 1.1 && 1.2
		 */
		Scanner sc = new Scanner(System.in);
		double a, b, c, chuvi, canhDay, chieuCao, dientich;
		System.out.print(" Nhap canh 1 ");
		a = sc.nextDouble();
		System.out.print(" Nhap canh 2 ");
		b = sc.nextDouble();
		System.out.print(" Nhap canh 3 ");
		c = sc.nextDouble();
		if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
			System.out.println(" La tam giác ");
			chuvi = a + b + c;
			System.out.println(" Chu vi tam giac" + chuvi);
			System.out.println("Nhap chieu dai canh day: ");
			canhDay = sc.nextDouble();
			System.out.println("Nhap chieu cao: ");
			chieuCao = sc.nextDouble();
			dientich = canhDay * chieuCao / 2;
			System.out.println("Dien tich hinh tam giac la: " + dientich);
		} else {
			System.out.println(" Khong phai tam giac ");
		}
		/**
		 * text 1.3
		 */
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" Nhap dtb cua sinh vien: ");
		double dtb = sc2.nextDouble();

		if (dtb >= 8) {
			System.out.println(" Hoc luc loai Gioi ");
		} else if (dtb >= 6.5) {
			System.out.println(" Hoc luc loai Kha ");
		} else {
			System.out.println(" Hoc luc loai Trung Binh ");
		}
		/**
		 * text 1.4
		 */
		Scanner scanner3 = new Scanner(System.in);
		int m = sc.nextInt();
		if (m % 2 == 0) {
			System.out.println(" Day la so chan ");
		} else {
			System.out.println(" Day la so le ");
		}
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(" Day la so chan ");
		} else {
			System.out.println(" Day la so le ");
		}
		int p = sc.nextInt();
		if (p % 2 == 0) {
			System.out.println(" Day la so chan ");
		} else {
			System.out.println(" Day la so le ");
		}
		int k = sc.nextInt();
		if (k % 2 == 0) {
			System.out.println(" Day la so chan ");
		} else {
			System.out.println(" Day la so le ");
		}
		/**
		 * text 1.5
		 */
		Scanner sc4 = new Scanner(System.in);
		System.out.println(" Nhap so chu dien tieu dung: ");
		int soChuDien = sc.nextInt();
		int donGia = 0;
		if (soChuDien <= 100) {
			donGia = 1800;
		} else if (soChuDien <= 200) {
			donGia = 3000;
		} else {
			donGia = 3000;
		}
		int soTien = soChuDien * donGia;
		System.out.println(" So tien phai tra: " + soTien + "VND");
	}
}
