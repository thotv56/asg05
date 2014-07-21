/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GRU-PC
 */
public class Employee extends PerSon{
    public static final long  serialVersionUID = 1L;
    private double salary;
    
    public Employee(String name, Date birth, double salary){
        super(name, birth);
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString()+" Salary: "+this.salary;
    }
    
}
