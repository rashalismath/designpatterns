/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observepackage;

/**
 *
 * @author Ismath
 */
public class mymain {
    public static void main(String args[]){
        Station one=new Station();
        one.add(new displayone(one));
        one.notfy();
        
        
        Station second=new Station();
        second.add(new displayone(second));
        second.setTemp(50);
        second.notfy();
        
       
    
    }
}
