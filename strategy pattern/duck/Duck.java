/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Ismath
 */
public class Duck {
    Iquackbehavior behavior;
    
    
    public void display(){
        System.out.println("Duck class");
    }
    
    public String setQuackBehavior(Iquackbehavior behavior){
             this.behavior=behavior;
             return "behavior : " + behavior.toString();
    }
    public void behavior(){
            behavior.quack();
    }
    
}
