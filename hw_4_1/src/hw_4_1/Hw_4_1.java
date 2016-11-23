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
public class Hw_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException  {
        // TODO code application logic here
        Squad ot1=new Squad("otr1");
        Squad ot2=new Squad("otr2");
        for (int i = 0; i < ot1.squad.size(); i++) {
            System.out.println(ot1.squad.get(i).toString());            
        }
        
        System.out.println("");
        for (int i = 0; i < ot2.squad.size(); i++) {
            System.out.println(ot2.squad.get(i).toString());            
        }
        
        
        
        
//        System.out.println("изм\n");
//        ot1.squad.get(1).health=30;
//        System.out.println("");
//        Squad ot3 =ot1.clone();
//        for (int i = 0; i < ot3.squad.size(); i++) {
//            System.out.println(ot3.squad.get(i).toString());            
//        }
//        
//        System.out.println("изм\n");
//        ot1.squad.get(1).health=5;
//        
//         for (int i = 0; i < ot1.squad.size(); i++) {
//            System.out.println(ot1.squad.get(i).toString());            
//        }
//          System.out.println("");
//        
//        for (int i = 0; i < ot3.squad.size(); i++) {
//            System.out.println(ot3.squad.get(i).toString());            
//        }
        
        
    }
    
}
