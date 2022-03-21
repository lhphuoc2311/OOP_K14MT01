/*
*  created date: Mar 21, 2022
*  author: cgm
*/
package oo.tuan6.buoi11;

public class DongVat {

    public DongVat(){
        //goi HTMD cua OBject
        //super();
        System.out.println("Ham tao mac dinh class DongVat");
    }

    private String name;

    public DongVat(String name){
        this.name = name;
        System.out.println("Name: " + name);
    }

    protected void keu(){
        System.out.println("Keu ....");
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "DongVat [name=" + name + "]";
    }

    
    
}
