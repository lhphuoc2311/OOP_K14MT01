/*
*  created date: Feb 21, 2022
*  author: cgm
*/
package oo.tuan3.buoi5;

public class Dog {

    //attribute - data - biến đối tượng
    //interface (lộ) => implementation (che giấu)
    private int size;// implementation
    /**default */ String breed;//interface
    /**default */ String name;//interface

    //=> lộ dữ liệu

    //method- behavior

    //interface
    public void setSize(int size){
        //code xử lý để ràng buộc kích thước hợp lệ
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("Kích thước không hợp lệ !!!!");
        }
        
    }

    public int getSize(){
        return this.size;
    }
    
}
