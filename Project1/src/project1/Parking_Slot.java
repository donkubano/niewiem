/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author marsz
 */
public class Parking_Slot{
    boolean isEmpty;
    Vehicle vehicle;
    private float size_x;
    private float size_z;
    
    public Parking_Slot(){
        isEmpty=true;
        size_x=4;
        size_z=3;        
}
    public Parking_Slot(float Size_X, float Size_Z){
        size_x=Size_X;
        size_z=Size_Z;
    }   
}
    
    

    
