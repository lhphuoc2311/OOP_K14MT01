/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.Date;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrang;//false - moi

    /**
     * @param maSach
     * @param ngayNhap
     * @param donGia
     * @param soLuong
     * @param tinhTrang
     */
    public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong, boolean tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "SachGiaoKhoa [tinhTrang=" + tinhTrang + "]" + super.toString();
    }

    @Override
    protected double tinhTien() {
        double tien = 0;
        if(!this.tinhTrang){
            tien = this.getSoLuong() * this.getDonGia();
        }else{
            tien = this.getSoLuong() * (this.getDonGia() * 0.5);
        }
        return tien;
    }

    //getter/setter

    

    
}
