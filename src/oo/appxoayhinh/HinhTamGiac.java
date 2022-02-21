/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.appxoayhinh;

public class HinhTamGiac {

    // attribute:
    String fileAmThanh;// xuan: xuanHTG.aif// hạ: haHTG.aif
    //
    // int soLanChoiNhat = 0;
    // ...
    // dai , rong
    // dien tich
    // method

    public HinhTamGiac(String fileAmThanh){
        this.fileAmThanh = fileAmThanh;
    }

    

    void xoay() {
        System.out.println("Xoay 360 độ, kim đồng hồ");
    }

    void phatNhac() {
        System.out.println("Chơi nhạc file " + fileAmThanh);
    }

}
