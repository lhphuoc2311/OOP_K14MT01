/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.Date;

public class Sach {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    /**
     * @param maSach
     * @param ngayNhap
     * @param donGia
     * @param soLuong
     */
    public Sach(String maSach, Date ngayNhap, double donGia, int soLuong) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the maSach
     */
    public String getMaSach() {
        return maSach;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @return the donGia
     */
    public double getDonGia() {
        return donGia;
    }

    public Sach(){}

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Sach [donGia=" + donGia + ", maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", soLuong=" + soLuong
                + "]";
    }

    protected double tinhTien(){
        return 0;
    }


    //getter/setter

    
    
    
}
