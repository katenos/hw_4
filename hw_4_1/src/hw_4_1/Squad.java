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

    static int startSize = 2;
    private Random rand = new Random();

    public Squad(String name) {
        this.name = name;
        for (int i = 0; i < startSize; i++) {
            if (rand.nextInt(2) == 0) {
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

    public int getRandomWarrior() {
        int warrior = 0;
        do {
            warrior = rand.nextInt(squad.size());
        } while ((squad.get(warrior).health <= 0));
        return warrior;
    }

    public boolean hasAliveWarriors() {
        for (int i = 0; i < squad.size(); i++) {
            if (squad.get(i).health > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = this.name;
        return str;
    }

    @Override
    public Squad clone(){
        Squad sq=new Squad(this.name, this.squad);  
        return sq;
    }
}
