/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.main;

import hust.soict.hedspi.aims.Media.Book;
import hust.soict.hedspi.aims.Media.Disc.CompactDisc;
import hust.soict.hedspi.aims.Media.Disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.Media.Disc.Track;
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
    
    public static void showAdminMenu() {
        System.out.println("Product Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new item");
        System.out.println("2. Delete item by id");
        System.out.println("3. Display the items list");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    
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
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 19.95f, 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 24.95f, 97);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Disney", 18.99f, 110);
        
        Track track1 = new Track("Happy new year", 3);
        Track track2 = new Track("Xuan nay con khong ve", 4);
        CompactDisc cd1 = new CompactDisc(7, "Nhac nam moi", "Nhac pop", "Hong Duc", "Duc", 100);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        CompactDisc cd2 = new CompactDisc(7, "Nhac cach mang", "Nhac do", "Cong Ly", "MTP", 150);

        
        Book b1 = new Book(4, "De Men phieu luu ky", "Sach Viet Nam", 20);
        b1.addAuthor("To Hoai");
        Book b2 = new Book(5, "Loc Dinh Ky", "Sach Trung Quoc", 15.59f);
        Book b3 = new Book(6, "Vo nhat", "Sach Viet Nam", 50);
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
