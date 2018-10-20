/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Ismath
 */
public class Contaxt {
    private Strategy strategy;
    
    public Contaxt(Strategy strategy){
        this.strategy=strategy;
    }
    
    public int executeoperation(int num1,int num2){
        
            return strategy.doOperation(num1, num2);
    }
    
    
    
    
}
