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
public class noQuack implements Iquackbehavior{
    public String quack(){
        return "This is no quack";
    }
    public String toString(){
        return quack();
    }
    
}
