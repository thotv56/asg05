/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package defaultpackage;
import java.text.SimpleDateFormat;
import java.util.Date;
import person.Employee;

/**
 *
 * @author GRU-PC
 */
public class Manager extends Employee{
    private Employee assistent;
    public Manager(String name, Date birth, double salary) {
        super(name, birth, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public void setAssistent(Employee assistent){
        this.assistent = assistent;
    }
    public Employee getAssistent(){
        return this.assistent;
    }
   
    
}
