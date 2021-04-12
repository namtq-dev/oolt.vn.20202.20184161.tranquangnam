/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.main;

import hust.soict.hedspi.aims.Media.Book;
import hust.soict.hedspi.aims.Media.DigitalVideoDisc;
import hust.soict.hedspi.aims.Media.Media;
import hust.soict.hedspi.aims.Media.allMediaList;
import hust.soict.hedspi.aims.Orders.Order;
import hust.soict.hedspi.aims.utils.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        Date date1 = new Date("first", "July", "twenty twenty");
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 97, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", 18.99f);
        
        Book b1 = new Book(4, "De Men phieu luu ky");
        b1.addAuthor("To Hoai");
        Book b2 = new Book(5, "Cafe");
        Book b3 = new Book(6, "Vo nhat");
        b3.addAuthor("Nam Cao");
        b3.addAuthor("Xuan Dieu");
        
        Scanner sc = new Scanner(System.in);
        int select = -1;
        while (select != 0) {
            showMenu();
            select = sc.nextInt();
            switch(select){
            case 1:
                if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
                    Order newOrder = new Order(date1);
                    orderList.add(newOrder);
                } else System.out.println("Can't create more order!");
                break;
            case 2:
                System.out.println("Insert the item id you want to add: ");
                int addItemId = sc.nextInt();
                orderList.get(Order.nbOrdered - 1).addMediaById(addItemId);
                break;       
            case 3:
                System.out.println("Insert the item id you want to delete: ");
                int deleteItemId = sc.nextInt();
                orderList.get(Order.nbOrdered - 1).removeMediaById(deleteItemId);
                break;
            case 4:
                orderList.get(Order.nbOrdered - 1).toStringInfo();
            case 0:
                System.out.println("Thank you for using our service!");
                break;
            default:
                System.out.println("Invalid function!");
                break;
        }
        }
        
        
    }
    

}
