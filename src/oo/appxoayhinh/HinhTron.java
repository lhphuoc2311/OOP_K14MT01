/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.appxoayhinh;

public class HinhTron {

    // attribute:
    String fileAmThanh;// xuan: xuanHT.aif// hạ: haHT.aif
    //
    // int soLanChoiNhat = 0;
    // ...
    // dai , rong
    // dien tich
    // method

    public HinhTron(String fileAmThanh){
        this.fileAmThanh = fileAmThanh;
    }

    
    void xoay() {
        System.out.println("Xoay 360 độ, kim đồng hồ");
    }

    void phatNhac() {
        System.out.println("Chơi nhạc file " + fileAmThanh);
    }

}
