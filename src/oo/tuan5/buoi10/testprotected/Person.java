/*
*  created date: Mar 16, 2022
*  author: cgm
*/
package oo.tuan5.buoi10.testprotected;

public class Person {

   //implementation - che giấu
   /**default */private String name = "Teo";
   /**default */private String birthday = "22/2/2002";//ngay sinh

   //interface
   /**
    * @return the name
    */
   protected String getName() {
       return name;
   }

   /**
    * @return the birthday
    */
   protected String getBirthday() {
       return birthday;
   }
    
}
