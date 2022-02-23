/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class HinhVuong {
    private String fileAmThanh ; // Tet.AIF
    
    public HinhVuong(){}

    public HinhVuong(String _fileAmThanh){
        this.fileAmThanh = _fileAmThanh ;
    }

    public void setFile(String fileAmThanh){
        this.fileAmThanh =fileAmThanh;
    }

    public String getFile (){
        return this.fileAmThanh ;
    }



    void choiNhac(){
        System.out.println("Dang choi nhac ---- "+ fileAmThanh);
    }

    void xoayHinh(){
        System.out.println("Xoay 360 ...");
    }
}
