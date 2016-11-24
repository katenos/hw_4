/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_4_1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kate_
 */
public class Squad implements Cloneable {

    public String name;
    public ArrayList<Warrior> squad = new ArrayList<Warrior>();

    public int startSize;
    private Random rand = new Random();

    public Squad(String name, int startSize) {
        this.startSize=startSize;
        this.name = name;
        for (int i = 0; i < startSize; i++) {
            if (rand.nextInt(2) == 0) { //привязка к рандому и конкретному списку бойцов.
                //а как иначе мне заполнять отряды? Вручную?
                Viking v = new Viking(name, i);
                squad.add(v);
            } else {
                Archer ar = new Archer(name, i);
                squad.add(ar);
            }

        }
    }
    
     public Squad(String name, ArrayList<Warrior> oldSquad ) {
        this.name = name;
        ArrayList<Warrior> newSquad = new ArrayList<Warrior>();
        for (int i = 0; i < oldSquad.size(); i++) {
            if(oldSquad.get(i).getClass().getName().equals("Viking")){
//                нельзя привязываться к именам классов и их количеству! если набор бойцов изменится, отряд меняться не должен!
//                проблемы бы не было, если бы методом clone обладал каждый боец.
//Но в этом конструкторе я клонирую отряд, соответсвенно если я клонирую отряд, то должна клонировать и бойцов
//в вызове конструктора бойцов с этим параметров как раз и происходит клонирование
                Viking v = new Viking(oldSquad.get(i));
                newSquad.add(v);
            }
            else{
                Archer ar = new Archer(oldSquad.get(i));
                newSquad.add(ar);
            }
            
        }
        this.squad=newSquad;
    }

    public int getNumberRandomWarrior() { 
        int warrior = 0;
        do {
            warrior = rand.nextInt(squad.size());
        } while ((squad.get(warrior).isAlive()));
        return warrior;
    }

    public boolean hasAliveWarriors() {
        for (int i = 0; i < squad.size(); i++) {
            if (squad.get(i).isAlive()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {        
        return this.name;
    }

    @Override
    public Squad clone(){        
        return new Squad(this.name, this.squad);
    }
}
