/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class HinhTrungBienHinh {
    private String fileAmThanh;//HIF
    private int xPoint;
    private int yPoint;

    public void xoayHinh(){
        System.out.println("Xoay theo diem x: " + this.xPoint +", " + this.yPoint);
    }

    public void choiNhac(){
        //code xu ly de phat am thanh .HIF
        System.out.println("Phat am thanh file: " + this.fileAmThanh);
    }
    
}
