/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package oo.tuan3.buoi7;
public class SinhVien {

    //implementation - che giấu
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    //interface - lộ ra ngoài
    public SinhVien (){
        this.maSV = 0;
        this.diemLT = 0f;
        this.diemTH = 0f;
        this.hoTen = null;
    }

    public SinhVien(int maSV, String hoTen, float diemTH, float diemLT){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    /**
     * @return the maSV
     */
    public int getMaSV() {
        return maSV;
    }

    /**
     * @param maSV the maSV to set
     */
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }


    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    /**
     * @return the diemLT
     */
    public float getDiemLT() {
        return diemLT;
    }

    /**
     * @param diemLT the diemLT to set
     */
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }


    /**
     * @return the diemTH
     */
    public float getDiemTH() {
        return diemTH;
    }

    /**
     * @param diemTH the diemTH to set
     */
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB(){
        float diemTB = 0.0f;
        diemTB = (this.diemLT + this.diemTH) / 2;
        return diemTB;
    }

    public String toString(){
        String str = "Ma SV: " + this.maSV;
        str += " Ho Ten SV: " + this.hoTen;
        str += " Diem TB" + this.tinhDiemTB();

        return str;
    }
}
