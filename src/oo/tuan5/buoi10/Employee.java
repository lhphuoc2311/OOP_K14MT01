/*
*  created date: Mar 16, 2022
*  author: cgm
*/
package oo.tuan5.buoi10;

import oo.tuan5.buoi10.testprotected.Person;///import

public class Employee extends Person{

    private double salary = 5_000_000;//luong

    @Override
    public String toString() {
        return "name : " + this.getName() + " birthday: " + this.getBirthday() + " salary: " + this.salary;
    }
    
}
