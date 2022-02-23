/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class HinhTamGiac {

    private String fileAmThanh ; // Tet.hif
    
    public HinhTamGiac(){}

    public HinhTamGiac(String _fileAmThanh){
        this.fileAmThanh = _fileAmThanh ;
    }

    public void setFile(String fileAmThanh){
        this.fileAmThanh =fileAmThanh;
    }

    public String getFile (){
        return this.fileAmThanh ;
    }



    void choiNhac(){
        System.out.println("Dang choi nhac ----"+fileAmThanh);
    }

    void xoayHinh(){
        System.out.println("Xoay 360 ...");
    }
    
}
