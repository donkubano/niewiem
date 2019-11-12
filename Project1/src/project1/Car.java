/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Random;

/**
 *
 * @author marsz
 */
public class Car extends Vehicle{
    String type_of_fuel;
    
    
    public Car(String Brand, String Model,int Horse_Power,String Fuel){
        type="Car";
        size_x=3;
        size_z=2;
        plate_gen();
        number_of_wheels=4;
        type_of_fuel=Fuel;
        this.brand=Brand;
        this.hp=Horse_Power;
        this.model = Model;
        
        
    }
    
    
}
