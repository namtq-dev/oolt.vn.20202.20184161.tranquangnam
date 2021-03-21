
import java.util.ArrayList;
import java.util.Collections;

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

        Order anOrder = new Order(date1);
        Order order2 = new Order(date2);
        Order order3 = new Order(date3);
        Order order4 = new Order(date4);
        Order order5 = new Order(date5);
        Order order6 = new Order(date6);
            
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
        
        DigitalVideoDisc[] allDVDList = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7};
        DigitalVideoDisc[] tempDVDList = {dvd1, dvd2, dvd3, dvd4, dvd6};  
        
        anOrder.addDigitalVideoDisc(tempDVDList);
//        anOrder.addDigitalVideoDisc(3, allDVDList);
        anOrder.addDigitalVideoDisc(dvd1, dvd2);  
        anOrder.addDigitalVideoDisc(dvd3, dvd4);            
        anOrder.addDigitalVideoDisc(dvd5, dvd6); 

//        anOrder.showOrders();
//        anOrder.removeDigitalDisc(dvd2);
//        System.out.println("New Order List:");
//        anOrder.showOrders();      
        anOrder.printOrder();
    }
}
    
