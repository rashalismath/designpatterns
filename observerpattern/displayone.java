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
public class displayone implements IObserver{
    Station station=new Station();
    
    displayone(Station station){
        this.station=station;
        
    }
    public void update(){
            station.temp();
            
    }
    public String toString(){
        return "displayone";
    }
}
