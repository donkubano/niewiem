/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.List;
import java.util.Scanner;    
import java.io.*;

/**
 *
 * @author marsz
 */
public class Parking {
    
    Parking_Slot parking_slot[];
    
    
    String name;
    int Number_Of_Parking_Slots;
    
    boolean exit=false;
    
    public Parking(String Name,int number_of_parking_slots){
        this.name=Name;
        this.Number_Of_Parking_Slots=number_of_parking_slots;
        this.parking_slot=new Parking_Slot[number_of_parking_slots];
        for (int i = 0; i < this.Number_Of_Parking_Slots; i++) {
            parking_slot[i]= new Parking_Slot();           
        }
            
    }
    
    
    public void Menu(){
        Scanner input = new Scanner(System.in);
        int choice;
            
        System.out.println("Parking: "+this.name);
        System.out.println("Liczba miejsc: "+this.Number_Of_Parking_Slots);
        System.out.println();
        System.out.println("1.Wprowadz pojazd na parking.");
        System.out.println("2.Sprawdz pojazdy na parkingu.");
        System.out.println("3.Wyjscie");
        
        choice=input.nextInt();
        
        switch(choice){
            case 1: Add_V();
            break;    
            case 2: Show_V();
            break;
            case 3: exit=true;
            break;
           }
        }
    public void Show_V(){
        System.out.println("Lista zaparkowanych pojazdow: ");
        for (int i = 0; i < this.Number_Of_Parking_Slots; i++) {
            if(!parking_slot[i].isEmpty){
                System.out.println("Numer miejsca: "+i);
                System.out.println("Typ pojazdu: "+parking_slot[i].vehicle.type);
                System.out.println("Marka pojazdu: "+parking_slot[i].vehicle.brand+ " Model pojazdu: "+parking_slot[i].vehicle.model);
                System.out.println("Numer Rejestracyjny: "+ parking_slot[i].vehicle.license_plate);
                System.out.println("Moc silnika: "+parking_slot[i].vehicle.hp+"KM");   
                System.out.println("------------");
                
            }
            
                
            
        }
        
    }
    
    
    public void Add_V(){
        InputStreamReader wejscie = new InputStreamReader( System.in ); 
	BufferedReader bufor = new BufferedReader(wejscie);
        System.out.println("---------");
        System.out.println("1.Samochod");
        System.out.println("2.Motocykl");
        System.out.println("3.Powrot do menu");
        
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        
        switch(choice){
            case 1: 
                for (int i = 0; i < Number_Of_Parking_Slots; i++) {
                    if(parking_slot[i].isEmpty){
                        String temp_brand="--";
                        String temp_model="--";
                        int temp_hp=0;
                        String temp_f="--";
                        System.out.println("1.Podaj marke auta: ");
                        try{
                            temp_brand=bufor.readLine();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        System.out.println("2.Podaj model auta: ");
                        try{
                            temp_model=bufor.readLine();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        System.out.println("3.Podaj moc auta: ");
                        try{
                            temp_hp =input.nextInt();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        System.out.println("4.Podaj rodzaj paliwa auta: ");
                        try{
                            temp_f=bufor.readLine();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        
                        parking_slot[i].vehicle = new Car(temp_brand,temp_model, temp_hp,temp_f);
                        System.out.println("Samochod dodany");
                        parking_slot[i].isEmpty=false;
                        
                        break;
                    }
                }
                
                break;
                    
            case 2: 
                    for (int i = 0; i < Number_Of_Parking_Slots; i++) {
                    if(parking_slot[i].isEmpty){
                        String temp_brand="--";
                        String temp_model="--";
                        int temp_hp=0;
                        System.out.println("1.Podaj marke motocykla: ");
                        try{
                            temp_brand=bufor.readLine();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        System.out.println("2.Podaj model motocykla: ");
                        try{
                            temp_model=bufor.readLine();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        System.out.println("3.Podaj moc motocykla: ");
                        try{
                            temp_hp =input.nextInt();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }                        
                        parking_slot[i].vehicle = new Motorbike(temp_brand,temp_model, temp_hp);
                        System.out.println("Motocykl dodany");
                        parking_slot[i].isEmpty=false;
                        
                        break;

                    }
                    
                    
                    
                };
                    break;
            case 3: Menu();
            break;
        }
                
        }
        
        
        
    }

    



    
