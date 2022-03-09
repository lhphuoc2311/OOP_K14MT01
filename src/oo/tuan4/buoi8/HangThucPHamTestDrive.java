/*
*  created date: Mar 09, 2022
*  author: cgm
*/
package oo.tuan4.buoi8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPHamTestDrive {

    public static void main(String[] args) throws ParseException {
        HangThucPham htp = new HangThucPham("TP01");
        System.out.println(htp.getMaHang());

        

        Date date = new Date();
        System.out.println(date.toString());

        //09/3/2022 - dd/mm/yyyy

        String ngay1 = "01/03/2022";
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date ngaySX = format.parse(ngay1);

        String ngayHetHan = "08/03/2022";

         HangThucPham htp2 = new HangThucPham("TP2", "MI Hao Hao", ngaySX, format.parse(ngayHetHan), 500);

         System.out.println(htp2);

         if(htp2.kiemTraHetHan()){
             System.out.println("Het Han !!!! Dung An no!!!");
         }


    }
    
}
