/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observepackage;

import java.util.ArrayList;

/**
 *
 * @author Ismath
 */
public class Station implements IObservable{
    int temp;
 ArrayList<IObserver> observers=new ArrayList<IObserver>(5);
   
   
    public void add(IObserver observer) {
            observers.add(observer);
    }

    
    public void remove(IObserver observer) {
        observers.remove(observer);
    }
   
   
    public void notfy(){
        for(IObserver observers:this.observers){
                observers.update();
         System.out.println(observers+" updated");
         System.out.println("Temp is : "+temp());
        }
    }
    public int temp(){
        return temp;
    }
    public int setTemp(int temp){ return this.temp=temp;}
}
