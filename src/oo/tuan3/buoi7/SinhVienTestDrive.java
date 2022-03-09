/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package oo.tuan3.buoi7;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(123, "Le Van Teo", 5, 5);

        System.out.println(sv1);

        SinhVien sv3 = new SinhVien();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        sv3.setMaSV(nhap.nextInt());

        nhap.nextLine();

        System.out.print("Nhap ho ten: ");
        sv3.setHoTen(nhap.nextLine());

        System.out.print("Nhap diem LT: ");
        sv3.setDiemLT(nhap.nextFloat());

        System.out.print("Nhap diem LH: ");
        sv3.setDiemTH(nhap.nextFloat());


        System.out.printf("MSSV: %d \t\t\t ho ten SV: %20s, \t\t\t Diem TB \n" ,sv1.getMaSV(), sv1.getHoTen(), sv1.tinhDiemTB());

        System.out.printf("MSSV: %d \t\t\t ho ten SV: %20s, \t\t\t Diem TB" ,sv3.getMaSV(), sv3.getHoTen(), sv3.tinhDiemTB());



        

    }
    
}
