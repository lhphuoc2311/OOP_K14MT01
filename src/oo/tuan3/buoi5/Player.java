/*
*  created date: Feb 21, 2022
*  author: cgm
*/
package oo.tuan3.buoi5;

public class Player {

    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing "+number);
    }
    
}
