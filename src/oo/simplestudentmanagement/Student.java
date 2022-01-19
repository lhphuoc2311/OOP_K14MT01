/*
*  created date: Jan 12, 2022
*  author: cgm
*/
package oo.simplestudentmanagement;

public class Student {

    //attribute//data
    //bien
    //biến trạng thái
    //biến object
    String mssv;
    String tenSinhVien;
    String lop;
    String khoa;
    String nganh;
    double diemTB;

    //method/function
    //constructor: phương thức đặc biệt
    
    public Student(){
        //this.mssv = "1234";
        ///this.tenSinhVien = "Tèo";
    }

    public Student(String name, String mssv){
        this.tenSinhVien = name;
        this.mssv = mssv;
    }

    public Student(/*this,*/String name, String mssv, String lop, String khoa, String nganh, double diemTB){
        this(name, mssv);//gọi constructor trong cùng 1 class
        this.lop = lop;
        this.khoa = khoa;
        this.nganh = nganh;
        this.diemTB = diemTB;
    }

    //phương thức object
    void show(/**this */){
        System.out.println("mã sv " + this.mssv);
        System.out.println("ten sinh vien" + this.tenSinhVien);
        System.out.println("Diểm TB: " + this.diemTB);
        this.hoc();
    }


    void hoc(){
        System.out.println("Hoc ...");
        //thao tac len du lieu
    }

    void thamGiaHoatDong(){
        System.out.println("Da bong ...");
    }

    void thi(){
        System.out.println("Thi ...");
       // diemTB = 5.0;
    }

    void phatBieu(){
        System.out.println("Phat Bieu ...");
    }

    
    
}
