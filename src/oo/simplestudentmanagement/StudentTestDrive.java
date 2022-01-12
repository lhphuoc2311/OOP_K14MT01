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

        //khai bao 1 bien tham chieu
        Student sonStudent = new Student();
        sonStudent.thamGiaHoatDong();
        sonStudent.phatBieu();

        //tao doi tuong thu 3

        Student thuStudent = new Student();
        thuStudent.phatBieu();
        thuStudent.thi();




    }
    
}
