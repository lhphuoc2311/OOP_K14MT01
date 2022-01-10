/*
*  created date: Jan 10, 2022
*  author: cgm
*/
package structured;

import java.util.Scanner;

public class BankStructured {

    // data
    //bien toan cuc :global
    static int account_number = 12345;// số tk
    static int account_balance = 0;// số dư

    //Nhan vien - Employee
    static String emName;//ten nhan vien
    static double salary;//luong


    //Khach Hang - Customer
    static String cusName;
    static String address;

    public static void main(String[] args) {
        
        // operation: thao tác lên dữ liệu
        // deposit
        // số tiền gửi được nhập từ bàn phím
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so tien gui> ");
        int depositAmount = input.nextInt();
        account_balance += depositAmount;
        // show
        show();
        
        // with draw: rut tien
        int withdrawAmount = 0;
        System.out.print("Nhap so tien muon rut> ");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        // show
        show();
        
        // with draw: rut tien
        System.out.print("Nhap so tien muon rut> ");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        // show
        show();
        
    }

    static void show(){
        System.out.println("Thong tin tai khoan:");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }

    static void showEmployee(){

        cusName = "";// khong on
        account_number  = 0;//rat nguy hiem
        salary = 500;


    }


    static void showCustomer(){
        account_balance = 0;//==>
        salary  = 0;// ==>>


    }

}
