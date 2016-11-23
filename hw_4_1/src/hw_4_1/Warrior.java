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
public class Warrior implements WarriorInterface{

    public int health;
    public int damage;
    public String squadName;
    public String wariorName = "Боец";
    
    
    
    @Override
    public int attack() {
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void setSquadName(String name) {
        this.squadName = name;
    }

    @Override
    public String toString() {
        String str = "Имя бойца " + this.wariorName + ". Имя отряда " + this.squadName + ". Класс " + this.getClass()+"healt "+this.health;
        return str;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
