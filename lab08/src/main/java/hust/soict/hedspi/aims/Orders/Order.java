/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Orders;

import hust.soict.hedspi.aims.Media.Disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.Media.Media;
import hust.soict.hedspi.aims.Media.allMediaList;
import hust.soict.hedspi.aims.utils.myDate;
import java.util.ArrayList;

/**
 *
 * @author Wind
 */
public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrdered = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    private myDate dateOrdered;
    private int id;

    public myDate getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(myDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Order(myDate dateOrdered) {
        this.dateOrdered = dateOrdered;
        nbOrdered++;
    }
    
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Item added!");
        } else System.out.println("The items ordered list is full!");
    }
    
    public void addMediaByTitle(String title) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            Media tmp = Media.search(title);
            if(tmp != null) {
                itemsOrdered.add(tmp);
                System.out.println("Item added!");
            }
        } else System.out.println("The items ordered list is full!");
    }
    
    public void addMediaById(int id) {
        boolean check = false;
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            for (Media media : allMediaList.allMedia) {
                if (media.getId() == id) {
                    itemsOrdered.add(media);
                    System.out.println("Item added!");
                    check = true;
                    break;
                }
            }
            if (check == false) {
                System.out.println("Can't find this item!");
            }
        } else System.out.println("The items ordered list is full!");    
    }
    
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Item removed!");
        } else System.out.println("Can't find this item!");
    }
    
    public void removeMediaById(int id) {
        boolean check = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                itemsOrdered.remove(media);
                System.out.println("Item removed!");
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Can't find this item!");
        }
    }
    
    public float totalCost(){
        float totalCost = 0;
//        for (int i = 0; i < itemsOrdered.size(); i++) {
//            totalCost += itemsOrdered.get(i).getCost();
//        }
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }
    
    public void toStringInfo() {
        System.out.println("***********************Order***********************");
        System.out.print("Date: "); 
        dateOrdered.toStringDate();
        System.out.println("Ordered Items: ");
        for (Media media : itemsOrdered) {
            System.out.println(media.showInfo());
        }
        System.out.println("Total Cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
