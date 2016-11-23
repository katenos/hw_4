/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_4_1;

/**
 *
 * @author kate_
 */
public interface WarriorInterface {   
    int attack();
    void takeDamage(int damage);
    boolean isAlive();
    void setSquadName(String name);        
}
