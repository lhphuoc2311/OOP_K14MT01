/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKM;
    /**
     * @param maCX
     * @param tenTaiXe
     * @param soXe
     * @param doanhThu
     * @param soTuyen
     * @param soKM
     */
    public ChuyenXeNoiThanh(String maCX, String tenTaiXe, String soXe, double doanhThu, int soTuyen, double soKM) {
        super(maCX, tenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

     public ChuyenXeNoiThanh(){}
    // @Override
    // protected void nhap() {
        // super.nhap();
        // Scanner nhap = HoTroNhap.nhap;
        // System.out.print("NHap so tuyen>>");
        // this.soTuyen = nhap.nextInt();
        // System.out.print("NHap So KM>>");
        // this.soKM = nhap.nextFloat();
        // nhap.nextLine();
    // }
    
    @Override
    public String toString() {
        return "ChuyenXeNoiThanh [soKM=" + soKM + ", soTuyen=" + soTuyen + "]" + super.toString();
    }

    

    
    
}
