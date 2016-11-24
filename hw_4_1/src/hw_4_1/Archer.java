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
public class Archer extends Warrior {

    public Archer(String nameSquad, int i) {
        this.damage = 40;
        this.health = 70;
        setSquadName(nameSquad);
        this.warriorName="Лучник "+(i+1);
    }
    
     public Archer(Warrior w) {
         this.damage=w.damage;
         this.health=w.health;
         this.squadName=w.squadName;
         this.warriorName=w.warriorName;
     }
     
    
}
