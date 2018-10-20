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
public class mymain {
    public static void main(String args[]){
        Duck wildduck=new wildDuck();
          System.out.println( wildduck.setQuackBehavior(new noQuack()));
        
    }
}
