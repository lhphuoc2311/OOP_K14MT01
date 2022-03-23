/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.Scanner;

public class ChuyenXe {
    private String maCX;
    private String tenTaiXe;
    private String soXe;
    private double doanhThu;
    /**
     * @param maCX
     * @param tenTaiXe
     * @param soXe
     * @param doanhThu
     */
    public ChuyenXe (){}
    public ChuyenXe(String maCX, String tenTaiXe, String soXe, double doanhThu) {
        this.maCX = maCX;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "ChuyenXe [doanhThu=" + doanhThu + ", maCX=" + maCX + ", soXe=" + soXe + ", tenTaiXe=" + tenTaiXe + "]";
    }

    // protected void nhap(){
        // Scanner nhap = HoTroNhap.nhap;
    //    nhap.nextLine();
        // System.out.print("NHap ma >>:");
        // this.maCX = nhap.nextLine();
        // // System.out.print("Nhap doanh thu >>:");
        // this.doanhThu = nhap.nextDouble();
    //    
    //    
    // 
        // 
        // nhap.close();

    // }

    /**
     * @return the doanhThu
     */
    public double getDoanhThu() {
        return doanhThu;
    }

    
    
}
