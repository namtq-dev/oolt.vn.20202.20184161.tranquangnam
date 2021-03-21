
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
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private static int nbOrdered = 0;
    public static final int MAX_LIMITED_ORDERS = 5;
    private myDate dateOrdered;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public Order(myDate dateOrdered) {
        if (nbOrdered < MAX_LIMITED_ORDERS) {
            this.dateOrdered = dateOrdered;
            nbOrdered++;
        } else System.out.println("Can't add more orders!");
    }
        
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added!");
        } else System.out.println("The disc " + disc.getTitle() + " can't be added!"); 
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//        for(DigitalVideoDisc dvdItem : dvdList){
//            addDigitalVideoDisc(dvdItem);
//        }
        if (dvdList.length + qtyOrdered < MAX_NUMBERS_ORDERED) {
            for(DigitalVideoDisc dvdItem: dvdList){
                addDigitalVideoDisc(dvdItem);
            }
        } else System.out.println("The dvd list can't be added!");
    }
    
    public void addDigitalVideoDisc(int n, DigitalVideoDisc[] dvdList) {
        if (n + qtyOrdered < MAX_NUMBERS_ORDERED) {
            for (int i = 0; i < n; i++) {
                System.out.println("Insert new dvd title: ");
                Scanner temp = new Scanner(System.in);
                String title = temp.nextLine();
                for (DigitalVideoDisc dvdItem : dvdList) {
                    if (dvdItem.getTitle().equals(title)) {
                        addDigitalVideoDisc(dvdItem);
                    }                  
                }
            }
        } else System.out.println("The dvd list can't be added!");
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalDisc(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyOrdered-1; i++){
            if(disc.getTitle().equals(itemsOrdered[i].getTitle())){
                for(int j = i; j < qtyOrdered-1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                break;
            }
        }
        //itemsOrdered[qtyOrdered-1] = null;
        qtyOrdered--;
    }
    
    public float totalCost() {
        float sum = 0; 
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    
    public void showOrders() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". DVD " + itemsOrdered[i].getTitle() + " - "
            + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector()+ " - "
            + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
    }
    
    public void printOrder() {
        System.out.println("***********************Order***********************");
        System.out.print("Date: "); 
        dateOrdered.print1();
        System.out.println("Ordered Items: ");
        showOrders();
        System.out.println("Total Cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
