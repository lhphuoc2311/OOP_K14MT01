/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.ArrayList;
import java.util.List;

public class DanhSachChuyenXe {
    //private List<ChuyenXeNgoaiThanh> listNgoaiThanh = new ArrayList<>();

    //private List<ChuyenXeNoiThanh> listXeNoiThanh = new ArrayList<>();

    //KIeu du lieu class cha
    private List<ChuyenXe> danhSach = new ArrayList<>();

    private int demTongCX = 0;
    private double doanhThuNgoaiThanh;
    private double doanhThuNoiThanh;

    public void xuat(){

        // for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : listNgoaiThanh) {
            // System.out.println(chuyenXeNgoaiThanh);
        // }

        // for (ChuyenXeNoiThanh chuyenXeNoiThanh : listXeNoiThanh) {
            // System.out.println(chuyenXeNoiThanh);
            // 
        // }
        for (ChuyenXe chuyenXe : danhSach) {
            System.out.println(chuyenXe);
        }

    }

    public void them(ChuyenXe chuyenXe){//1-NoiThanh -2-Ngoai THanh
        // if(loaiXe ==1){
            // ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            // chuyenXeNoiThanh.nhap();
            // this.listXeNoiThanh.add(chuyenXeNoiThanh);
        // }else{

            // ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            // chuyenXeNgoaiThanh.nhap();
            // this.listNgoaiThanh.add(chuyenXeNgoaiThanh);

        // }
        danhSach.add(chuyenXe);

    }

    /**
     * @return the doanhThuNgoaiThanh
     */
    public double getDoanhThuNgoaiThanh() {
        return doanhThuNgoaiThanh;
    }


    public void tinhDoanhThuMoiLoai(){

        
        // for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : listNgoaiThanh) {

            // this.doanhThuNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            // 
        // }

        // for (ChuyenXeNoiThanh chuyenXeNoiThanh : listXeNoiThanh) {

            // this.doanhThuNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            // 
        // }

        for (ChuyenXe chuyenXe : danhSach) {
            if(chuyenXe instanceof ChuyenXeNgoaiThanh){
                this.doanhThuNgoaiThanh += chuyenXe.getDoanhThu();
            }else{
                this.doanhThuNoiThanh += chuyenXe.getDoanhThu();
            }
        }

    }

    /**
     * @return the doanhThuNoiThanh
     */
    public double getDoanhThuNoiThanh() {
        return doanhThuNoiThanh;
    }

    public void demTongChuyenXe(){
        // for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : listNgoaiThanh) {
            // this.demTongCX++;
        // }

        // for (ChuyenXeNoiThanh chuyenXeNgoaiThanh : listXeNoiThanh) {
            // this.demTongCX++;
        // }
        this.demTongCX++;
    }

    /**
     * @return the demTongCX
     */
    public int getDemTongCX() {
        return demTongCX;
    }
    
}
