/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class ShapeTestDrive {
    public static void main(String[] args) {

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setFile("hinhVuong.aif");
        hinhVuong.xoayHinh();
        hinhVuong.choiNhac();

        HinhTron hinhTron = new HinhTron();
        hinhTron.setFile("hinhTron.aif");
        hinhTron.xoayHinh();
        hinhTron.choiNhac();

        HinhTrungBienHinh hinhTrungBienHinh = new HinhTrungBienHinh();
        hinhTrungBienHinh.setFile("amoeba.hif");

        hinhTrungBienHinh.setxPoint(10);
        hinhTrungBienHinh.setyPoint(5);

        hinhTrungBienHinh.xoayHinh();
        hinhTrungBienHinh.choiNhac();
        
    }
    
}
