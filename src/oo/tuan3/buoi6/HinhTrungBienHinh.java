/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class HinhTrungBienHinh extends Hinh {
    private int xPoint;
    private int yPoint;

    /**
     * @param xPoint the xPoint to set
     */
    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    /**
     * @param yPoint the yPoint to set
     */
    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    /**
     * @return the xPoint
     */
    public int getxPoint() {
        return xPoint;
    }

    /**
     * @return the yPoint
     */
    public int getyPoint() {
        return yPoint;
    }

    // public void xoayHinh(){
    // // System.out.println("Xoay theo diem x: " + this.xPoint +", " +
    // this.yPoint);
    // }

    // public void choiNhac(){
    // code xu ly de phat am thanh .HIF
    // // System.out.println("Phat am thanh file: " + this.fileAmThanh);
    // }

    // override: ghi de/thay the

    @Override//GHI ĐÈ
    public void choiNhac() {//HIF
        System.out.println("Phat am thanh file .hif: " + this.getFile());
    }

    @Override
    public void xoayHinh() {

        System.out.println("Xoay theo diem x: " + this.xPoint + ", " + this.yPoint);
    }
}
