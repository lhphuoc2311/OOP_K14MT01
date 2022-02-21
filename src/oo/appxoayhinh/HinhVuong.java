/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.appxoayhinh;

public class HinhVuong {

    //attribute:
    String fileAmThanh;// xuan: xuanHV.aif// hạ: haHV.aif
    //
    //int soLanChoiNhat = 0;
    //...
    //dai , rong
    // dien tich

    //method

    //constructor
    public HinhVuong(String fileAmThanh){
        this.fileAmThanh = fileAmThanh;
    }
    
    void xoay(){
        System.out.println("Xoay 360 độ, kim đồng hồ");
    }

    void phatNhac(){
        System.out.println("Chơi nhạc file " + fileAmThanh);
    }
    
}
