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
public class Viking extends Warrior {

    public Viking(String nameSquad, int i) {
        this.damage = 30;
        this.health = 100;
        setSquadName(nameSquad);
        this.wariorName = "Викинг " + (i + 1);
    }

    public Viking(Warrior w) {
        this.damage = w.damage;
        this.health = w.health;
        this.squadName = w.squadName;
        this.wariorName = w.wariorName;
    }

}
