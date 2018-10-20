/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

public class main {
        public static void main(String args[]){
        
         //we cant create strategy class objects since its an interface
         Strategy s=new OperationAdd();   
        Contaxt ob=new Contaxt(s );
        
        System.out.println(ob.executeoperation(5, 6));
        
        }
    
}
