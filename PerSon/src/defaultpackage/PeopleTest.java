/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package defaultpackage;

import java.util.Date;
import person.Employee;
import person.PerSon;

/**
 *
 * @author GRU-PC
 */
public class PeopleTest {
    public static void main(String [] args){
        Employee newbie = new Employee("NewBie", new Date("21/2/1993"), 10000);
        Manager boss = new Manager("Boss", new Date("2/23/1989"), 40000);
        boss.setAssistent(newbie);
        Manager biggerBoss = new Manager("Big Boss",new Date ("3/12/1969"), 100000);
        System.out.println(newbie);
        System.out.println(boss);
        System.out.println(biggerBoss);
        
        System.out.println("------------------------------------------------");
        PerSon [] per = new PerSon[3];
        per[0] = newbie;
        per[1] = boss;
        per[2] = biggerBoss;
        for(int i=0; i<per.length;i++){
            System.out.println(" "+per[i]);
        }
    }
}
