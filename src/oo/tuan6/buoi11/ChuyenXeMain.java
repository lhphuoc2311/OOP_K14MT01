/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi11;

public class ChuyenXeMain {

    public static void main(String[] args) {
        DanhSachChuyenXe danhSachChuyenXe = new DanhSachChuyenXe();

        danhSachChuyenXe.them(1);
        danhSachChuyenXe.them(1);
        //danhSachChuyenXe.them(2);

        danhSachChuyenXe.xuat();

        danhSachChuyenXe.tinhDoanhThuMoiLoai();

        System.out.println("Noi THanh" + danhSachChuyenXe.getDoanhThuNoiThanh());

        danhSachChuyenXe.demTongChuyenXe();
        System.out.println("Tong: " + danhSachChuyenXe.getDemTongCX());
    }
    
}
