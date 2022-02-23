/*
*  created date: Feb 23, 2022
*  author: cgm
*/
package oo.tuan3.buoi6;

public class Hinh {

    private String fileAmThanh; // Tet.AIF
    

    public Hinh() {
    }

    public Hinh(String _fileAmThanh) {
        this.fileAmThanh = _fileAmThanh;
    }

    public void setFile(String fileAmThanh) {
        this.fileAmThanh = fileAmThanh;
    }

    public String getFile() {
        return this.fileAmThanh;
    }

    public void choiNhac() {
        System.out.println("Dang choi nhac .aif ---- " + fileAmThanh);
    }

    public void xoayHinh() {
        System.out.println("Xoay 360 ...");
    }

}
