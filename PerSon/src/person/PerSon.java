/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PerSon implements Serializable {
    public static final long  serialVersionUID = 1L;

    /**
     * @param args the command line arguments
     */
    
		
    private String name;
    Date birthDay = new Date();
    SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
    PerSon(){};
    PerSon(String name, Date birthDay){
        this.name = name;
        this.birthDay = birthDay;
    }
    
    public void setNam(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+" BirthDay: "+this.format.format(birthDay);
    }
    
}
