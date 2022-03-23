/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import oo.tuan3.buoi6.ShapeTestDrive;

public class SachMain {
    public static void main(String[] args) {
        DanhSachSach danhSachSach = new DanhSachSach();

        Sach sach = danhSachSach.timKiemSachTheoMa("SGK01");

        danhSachSach.xoaSach(sach);

       int viTri =  danhSachSach.timSachTheoMa_Vitri(sach);

       //sua - thong in moi
       sach.setDonGia(4000);
       sach.setSoLuong(100);

       danhSachSach.suaSach(viTri, sach);
    }


    
}
