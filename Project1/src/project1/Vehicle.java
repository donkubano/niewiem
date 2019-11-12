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
public class Vehicle {
    String type;
    String brand;
    String model;
    double size_x;
    double size_z;
    String license_plate="";
    int number_of_wheels;
    int hp;
    
    
    public void plate_gen(){
        char temp;
        Random random = new Random();
        temp=(char) (random.nextInt(25)+65);
        license_plate+=temp;
        temp=(char) (random.nextInt(25)+65);
        license_plate+=temp;
        license_plate+=Integer.toString(random.nextInt(9));
        license_plate+=Integer.toString(random.nextInt(9));
        license_plate+=Integer.toString(random.nextInt(9));
        temp=(char) (random.nextInt(25)+65);
        license_plate+=temp;
        license_plate+=Integer.toString(random.nextInt(9));
    }
    
    
}

