/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package oo.tuan3.buoi7;

public class PTGTTestDrive {
    public static void main(String[] args) {

        PhuongTienGiaoThong ptgt1 = new PhuongTienGiaoThong("Le Van A", "Future Neo", 125, 37_000_000);

        PhuongTienGiaoThong ptgt2 = new PhuongTienGiaoThong("Le Mih Tinh", 
"Ford Ranger", 300, 800_000_000);

PhuongTienGiaoThong ptgt3 = new PhuongTienGiaoThong("Nguyen Minh Triet", 
"LandScape", 1500, 2_000_000_000);

        System.out.println("Chu xe \t\t\t Loai xe \t\t  Dung Tich \t\tTri Gia \t\tThue Phai Tra");
        System.out.printf("%-24s %-24s %9d %19.2f %29.2f \n", ptgt1.getChuXe(), ptgt1.getLoaiXe(), ptgt1.getDungTich(), ptgt1.getTriGia(), ptgt1.tinhThue());

        System.out.printf("%-24s %-24s %9d %19.2f %29.2f", ptgt2.getChuXe()
        , ptgt2.getLoaiXe(), ptgt2.getDungTich(), ptgt2.getTriGia(), ptgt2.
        tinhThue());
        
    }
    
}
