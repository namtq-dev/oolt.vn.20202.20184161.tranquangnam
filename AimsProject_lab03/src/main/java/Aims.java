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
        Order anOrder = new Order();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Upin & Ipin");
        anOrder.addDigitalVideoDisc(dvd4);
        
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        System.out.println("Order List:");
        anOrder.showOrders();
        anOrder.removeDigitalDisc(dvd2);
        System.out.println("New Order List:");
        anOrder.showOrders();
        
    }
}
