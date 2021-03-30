package hust.soict.hedspi.aims.orders;

import hust.soict.hedspi.aims.disc.allDVDList;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.myDate;
import hust.soict.hedspi.aims.generation.permutation;
import java.awt.List;
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
    public static int nbOrdered = 0;
    public static final int MAX_LIMITED_ORDERS = 5;
    private myDate dateOrdered;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public Order(myDate dateOrdered) {
        this.dateOrdered = dateOrdered;
        nbOrdered++;
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
    
    public void addDigitalVideoDisc(int n) {
        if (n + qtyOrdered < MAX_NUMBERS_ORDERED) {
            for (int i = 0; i < n; i++) {
                System.out.println("Insert new dvd title: ");
                Scanner temp = new Scanner(System.in);
                String title = temp.nextLine();
                for (int j = 0; j < allDVDList.getCountDVD(); j++) {
                    if (allDVDList.allDVDList[j].getTitle().equals(title)) {
                        addDigitalVideoDisc(allDVDList.allDVDList[j]);
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
    
    public void showDVD() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". DVD " + itemsOrdered[i].getTitle() + " - "
            + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector()+ " - "
            + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
    }
    
    public void toStringDVD() {
        System.out.println("***********************Order***********************");
        System.out.print("Date: "); 
        dateOrdered.toStringDate();
        System.out.println("Ordered Items: ");
        showDVD();
        System.out.println("Total Cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    public boolean search(String title) {
        String temp1;
        String temp2;
        String[] titlePart = new String[1000];
        int count;
        for (int i = 0; i < allDVDList.countDVD; i++) {
            count = 0;
            temp2 = "";
            temp1 = allDVDList.allDVDList[i].getTitle();
            temp1 += " ";
            if (temp1.equalsIgnoreCase(title)) {
                return true;
            }
            int begin = 0;
            for (int j = 0; j < temp1.length(); j++) {
                if (temp1.charAt(j) == ' ') {
                    titlePart[count] = temp1.substring(begin, j);
                    count++;
                    begin = j+1;
                }
            }
            for(int j = 0; j < title.length(); ++j) {
                if(title.charAt(j) != ' ') temp2 += title.charAt(j);
            }
            if(permutation.permutation(0, count, temp2, titlePart)) return true;
        }
        return false;
    } 
    
    public DigitalVideoDisc getALuckyItem() {
        double n = Math.random()*10;
        int n_int = (int)n;
        return allDVDList.allDVDList[n_int];
    }
}
