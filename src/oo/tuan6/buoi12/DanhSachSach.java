/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {

    private List<Sach> danhSach = new ArrayList<>();


    public void them(Sach sach){
        danhSach.add(sach);
    }


    public void inSach(){
        for (Sach sach : danhSach) {
            System.out.println(sach);
        }
    }


    public Sach timKiemSachTheoMa(String maSach){
        Sach sach = null;


        for (Sach s : danhSach) {
            if(s.getMaSach().equals(maSach)){
                sach = s;
            }
        }

        return sach;

    }

    
    public SachGiaoKhoa timKiemSachGKTheoMa(String maSach){
        SachGiaoKhoa sachGiaoKhoa = null;


        for (Sach s : danhSach) {
            if(s.getMaSach().equals(maSach) && s instanceof SachGiaoKhoa){
                sachGiaoKhoa = (SachGiaoKhoa) s;//ep kieu
            }
        }

        return sachGiaoKhoa;

    }
    //-1: khong tim thay
    public int timSachTheoMa_Vitri(Sach sach){
        int viTri = -1;
        viTri = danhSach.indexOf(sach);
        return viTri;
    }

    public void xoaSach(Sach sach){
        danhSach.remove(sach);
    }

    public void suaSach(int viTri, Sach sach){
        danhSach.set(viTri, sach);
    }
    
    
}
