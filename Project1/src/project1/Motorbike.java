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
public class Motorbike extends Vehicle {
    
        public Motorbike(String Brand, String Model,int Horse_Power){
        type="Motorbike";
        size_x=3;
        size_z=2;
        plate_gen();
        number_of_wheels=2;
        this.brand=Brand;
        this.hp=Horse_Power;
        this.model = Model;        
        
    }
    
        @Override
    public void plate_gen(){
        char temp;
        Random random = new Random();
        temp=(char) (random.nextInt(25)+65);
        license_plate+=temp;
        temp=(char) (random.nextInt(25)+65);
        license_plate+=temp;
        license_plate+=Integer.toString(random.nextInt(9));
        license_plate+=Integer.toString(random.nextInt(9));
        temp=(char) (random.nextInt(25)+65);
        license_plate+=temp;
        license_plate+=Integer.toString(random.nextInt(9));
    }
    
    
}
