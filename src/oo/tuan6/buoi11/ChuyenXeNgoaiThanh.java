/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi11;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private float soNgayDi;

    /**
     * @param maCX
     * @param tenTaiXe
     * @param soXe
     * @param doanhThu
     * @param noiDen
     * @param soNgayDi
     */
    public ChuyenXeNgoaiThanh(String maCX, String tenTaiXe, String soXe, double doanhThu, String noiDen,
            float soNgayDi) {
        super(maCX, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public ChuyenXeNgoaiThanh(){}
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    protected void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        Scanner nhap = HoTroNhap.nhap;
        nhap.nextLine();
        System.out.print("NHap Noi Den>>");
        this.noiDen = nhap.nextLine();
        System.out.print("NHap So NGya Di>>");
        this.soNgayDi = nhap.nextFloat();

    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + "]" + super.toString();
    }

}
