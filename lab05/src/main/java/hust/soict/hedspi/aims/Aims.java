package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.utils.myDate;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.orders.Order;
import hust.soict.hedspi.aims.disc.allDVDList;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wind
 */
public class Aims {
    public static void main (String[] args) {
        
        myDate date1 = new myDate("first", "July", "twenty twenty");
        myDate date2 = new myDate("first", "June", "twenty twenty");
        myDate date3 = new myDate("second", "July", "twenty twenty");
        myDate date4 = new myDate("third", "July", "twenty twenty");
        myDate date5 = new myDate("first", "March", "twenty twenty");
        myDate date6 = new myDate("first", "May", "twenty twenty");
        myDate date7 = new myDate("first", "April", "twenty twenty");
            
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//        anOrder.addDigitalVideoDisc(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Upin & Ipin");
//        anOrder.addDigitalVideoDisc(dvd4);
        
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Doraemon");
//        anOrder.addDigitalVideoDisc(dvd5);
        
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Naruto", "Animation", 100);

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Bo gia", "Comedy", 45.8f);
        
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Harry Potter", "Supernatural", 54.3f);
        
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("2012", "Sci-fi", 60.8f);
        
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Venom", "Supernatural", 8f);

        DigitalVideoDisc[] allDVDList = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7};
        DigitalVideoDisc[] tempDVDList = {dvd1, dvd2, dvd3, dvd4, dvd6};  
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order anOrder = new Order(date1);
            
//            anOrder.addDigitalVideoDisc(tempDVDList);

//            anOrder.addDigitalVideoDisc(3);
            anOrder.addDigitalVideoDisc(dvd1, dvd2);  
            anOrder.addDigitalVideoDisc(dvd3, dvd4);            
            anOrder.addDigitalVideoDisc(dvd5, dvd6); 
            
            System.out.println("You get one free item!");
            anOrder.addDigitalVideoDisc(anOrder.getALuckyItem());
            
            anOrder.toStringDVD();
//            anOrder.showDVD();
//            anOrder.removeDigitalDisc(dvd2);
//            System.out.println("New Order List:");
//            anOrder.showDVD();      
//            anOrder.toStringDVD();
            System.out.println("Input the title of DVD you want to search: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(anOrder.search(s))
            System.out.println("DVD available!");
            else System.out.println("DVD not available!");
        } else System.out.println("Can't add more order");
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order order2 = new Order(date2);
        } else System.out.println("Can't add more order");
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order order3 = new Order(date3);
        } else System.out.println("Can't add more order");
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order order4 = new Order(date4);
        } else System.out.println("Can't add more order");
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order anOrder = new Order(date1);
        } else System.out.println("Can't add more order");
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order order5 = new Order(date5);
        } else System.out.println("Can't add more order");
        
        if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
            Order order6 = new Order(date6);
        } else System.out.println("Can't add more order");      
          
      
    }
}
    
