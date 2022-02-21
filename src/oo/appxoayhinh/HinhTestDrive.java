/*
*  created date: Jan 19, 2022
*  author: cgm
*/
package oo.appxoayhinh;

public class HinhTestDrive {

    public static void main(String[] args) {

        HinhTamGiac hinhTamGiac = new HinhTamGiac("musicTGHa.aif");

        hinhTamGiac.phatNhac();//message

        hinhTamGiac.xoay();//message


        HinhTron hinhTron = new HinhTron("musicDong.aif");
        hinhTron.phatNhac();//message
    }
    
}
