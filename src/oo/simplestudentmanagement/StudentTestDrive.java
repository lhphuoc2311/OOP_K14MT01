/*
*  created date: Jan 12, 2022
*  author: cgm
*/
package oo.simplestudentmanagement;

public class StudentTestDrive {

    public static void main(String[] args) {
        //khoi tao doi tuong
        Student phongStudent = new Student();

        phongStudent.thamGiaHoatDong();
        phongStudent.thi();
        phongStudent.show();

        //khai bao 1 bien tham chieu
        Student sonStudent = new Student();
        sonStudent.thamGiaHoatDong();
        sonStudent.phatBieu();
        sonStudent.show();

        //tao doi tuong thu 3

        Student thuStudent = new Student();
        thuStudent.phatBieu();
        thuStudent.thi();

        Student datStudent = new Student("dat", "001");


        Student quanStudent = new Student("Quân KK", "002");






    }
    
}
