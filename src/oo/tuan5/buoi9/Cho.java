/*
*  created date: Mar 14, 2022
*  author: cgm
*/
package oo.tuan5.buoi9;

public class Cho extends DongVat {

    //1. tu dong thừa hưởng của cha
    //2. bổ sung thêm đặc trưng như thuộc tính, phương thức
    public void duoiMeo(){
        System.out.println("Duoi meo ...");
    }
    //3. thừa kế và ghi đè
    @Override
    public void keu() {
        System.out.println("Cho sua ...");
    }

    @Override
    public void an() {
        System.out.println("Cho an com, xuong, ...");
    }


    
}
