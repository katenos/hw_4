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
public class Battle {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) { 
        DateHelper d = new DateHelper();   
        Squad ot1 = new Squad("1-й отряд",5);
        Squad ot2 = new Squad("2-й отряд",3);  
        System.out.println("Список бойцов");
         for (int i = 0; i < ot1.squad.size(); i++) {
            System.out.println(ot1.squad.get(i).toString());            
        }        
        System.out.println("");
        for (int i = 0; i < ot2.squad.size(); i++) {
            System.out.println(ot2.squad.get(i).toString());            
        }
        System.out.println("\nСражение началось!");
        System.out.println(d.getFormattedStartDate());        
        String nameWinner=battle(ot1, ot2, d);       
        System.out.println("\nПобедил "+nameWinner);
        System.out.println("Общее время поединка "+d.getFormattedDiff());

    }
    
    public static String battle(Squad ot1, Squad ot2, DateHelper d){
        int ind1, ind2, i=0;
        String nameWinner="";
         while (nameWinner.equals("")) {
            System.out.println("\nРаунд "+(++i));
            ind1 = ot1.getNumberRandomWarrior();
            ind2 = ot2.getNumberRandomWarrior();
            Warrior w1= ot1.squad.get(ind1);
            Warrior w2= ot2.squad.get(ind2);
            System.out.println("Боец - "+w1.toString()+" атакует бойца\n       "+w2.toString());           
            w2.takeDamage(w1.attack());            
            d.skipTime();
            if(!ot2.hasAliveWarriors()){
                nameWinner=ot1.toString();
                break;
            }            
            ind1 = ot1.getNumberRandomWarrior();
            ind2 = ot2.getNumberRandomWarrior();
            w1= ot1.squad.get(ind1);
            w2= ot2.squad.get(ind2);
            System.out.println("Боец - "+w2.toString()+" атакует бойца\n       "+w1.toString());  
            w1.takeDamage(w2.attack());
            d.skipTime();
            if(!ot1.hasAliveWarriors()){
                nameWinner=ot2.toString();
                break;
            }            
        }
         return nameWinner;
    }

}
