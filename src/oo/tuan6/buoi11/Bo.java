/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi11;

public class Bo extends DongVat  {

    public Bo(){

        super();//goi ham tao mac dinhcla ongVat

        System.out.println("Ham mac dinh cua Class Bo");

        

    }

    private float sua;

    public Bo(String name, float sua){
        super(name);//goi HT 1 TS cua Dong Vat
        //super(name);
        System.out.println("Sua: " + sua);
        this.sua = sua;


    }

    @Override
    protected void keu() {
        System.out.println("Um bo bo ....");
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Bo [sua=" + sua + "] " + super.toString();
    }

    
    
}
