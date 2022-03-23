/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.Date;

public class SachThamKHao extends Sach {
    private double thue;

    /**
     * @param maSach
     * @param ngayNhap
     * @param donGia
     * @param soLuong
     * @param thue
     */
    public SachThamKHao(String maSach, Date ngayNhap, double donGia, int soLuong, double thue) {
        super(maSach, ngayNhap, donGia, soLuong);
        this.thue = thue;
    }

    //getter setter

    public SachThamKHao(){}

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "SachThamKHao [thue=" + thue + "]" + super.toString();
    }

    @Override
    protected double tinhTien() {
        double tien = 0;
        tien = this.getSoLuong() * this.getDonGia() + this.thue;
        return tien;

    }

    
    
}
