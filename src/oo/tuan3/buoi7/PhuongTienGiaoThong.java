/*
*  created date: Mar 07, 2022
*  author: cgm
*/
package oo.tuan3.buoi7;

public class PhuongTienGiaoThong {

    //
    private String chuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;

    public PhuongTienGiaoThong(){

    }


    public PhuongTienGiaoThong(String chuXe, String loaiXe, int dungTich, float triGia){
        this.chuXe = chuXe;
        this.dungTich = dungTich;
        this.loaiXe = loaiXe;
        this.triGia = triGia;
    }

    /**
     * @return the chuXe
     */
    public String getChuXe() {
        return chuXe;
    }

    /**
     * @param chuXe the chuXe to set
     */
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    /**
     * @return the loaiXe
     */
    public String getLoaiXe() {
        return loaiXe;
    }

    /**
     * @param loaiXe the loaiXe to set
     */
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    /**
     * @return the dungTich
     */
    public int getDungTich() {
        return dungTich;
    }

    /**
     * @param dungTich the dungTich to set
     */
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    /**
     * @return the triGia
     */
    public float getTriGia() {
        return triGia;
    }

    /**
     * @param triGia the triGia to set
     */
    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public float tinhThue(){
        float thue = 0.0f;
        if(this.dungTich < 100){
            thue = triGia * 0.01f;
        } else if(this.dungTich >= 100 && this.dungTich <= 200){
            thue = this.triGia * 0.03f;
        }else{
            thue = this.triGia * 0.05f;
        }
        return thue;
    }
    
}
