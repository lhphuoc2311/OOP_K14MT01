/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class HinhChuNhat {

    //attribute - data 
    //implementation - che giấu
    private float chieuDai;
    private float chieuRong;


    //interface - lộ ra bên ngoài
    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuDai
     */
    public float getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    /**
     * @return the chieuRong
     */
    public float getChieuRong() {
        return chieuRong;
    }

    //interface
    public float tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }

    public float tinhChuVi(){
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public String toString(){

        String str = "Chieu dai: " + this.chieuDai + ", chieu rong: " + this.chieuRong;

        str = str + " dien tich: " + this.tinhDienTich() + " chu vi: " + this.tinhChuVi();

        return str;

    }
    
}
