/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.main;

import hust.soict.hedspi.aims.Media.BookFactory;
import hust.soict.hedspi.aims.Media.Disc.CDFactory;
import hust.soict.hedspi.aims.Media.Disc.CompactDisc;
import hust.soict.hedspi.aims.Media.Disc.DVDFactory;
import hust.soict.hedspi.aims.Media.Disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.Media.Disc.Track;
import hust.soict.hedspi.aims.Media.Media;
import hust.soict.hedspi.aims.Media.allMediaList;
import hust.soict.hedspi.aims.Orders.Order;
import hust.soict.hedspi.aims.utils.myDate;
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
    
    public static void showCreateMenu() {
        System.out.println("1. Create DVD");
        System.out.println("2. Create CD");
        System.out.println("3. Create Book");
        System.out.println("0. Exit");
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
    
    public static void showAddMenu() {
        System.out.println("1. Add DVD to the order");
        System.out.println("2. Add CD to the order");
        System.out.println("3. Add Book to the order");
        System.out.println("0. Exit");
    }
    
    public static void main(String[] args) {

        Scanner scAdmin = new Scanner(System.in);
        int selectAdmin = -1;
        while (selectAdmin != 0) {            
            showAdminMenu();
            selectAdmin = scAdmin.nextInt();
            switch(selectAdmin){
                case 1:
                    int choose = -1;
                    while (choose != 0) {                        
                        showCreateMenu();
                        choose = scAdmin.nextInt();
//                        scAdmin.nextLine();
                        switch(choose){
                            case 1:
                                System.out.println("Create new DVD:");
                                Media DVD = Media.createItem(new DVDFactory());
                                break;
                            case 2:
                                System.out.println("Create new CD:");
                                Media CD = Media.createItem(new CDFactory());
                                break;
                            case 3:
                                System.out.println("Create new book:");
                                Media book = Media.createItem(new BookFactory());
                                break;
                            case 0:
                                System.out.println("Exit Create Menu");
                        }
                    }
                    break;
                case 2:
                    if (allMediaList.allMedia.isEmpty()) {
                        System.out.println("No item in the list!");
                    }
                    scAdmin.nextLine();
                    System.out.println("Input item id: ");
                    int id = scAdmin.nextInt();
                    for (Media item : allMediaList.allMedia) {
                        if (item.getId() == id) {
                            allMediaList.allMedia.remove(item);
                            System.out.println("Item deleted!");
                        } else System.out.println("Can't find item!");
                    }
                    break;
                case 3:
                    System.out.println("***********************Items List***********************");
                    for (Media item : allMediaList.allMedia) {
                        System.out.println(item.showInfo());
                    }
                    System.out.println("***********************Items List***********************");
                    break;
                case 0:
                    System.out.println("Exit admin menu!");
                    break;
                default:
                    System.out.println("Invalid function!");
                    break;                 
            }
        } 
        
        myDate date1 = new myDate("first", "July", "twenty twenty");
        
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 19.95f, 87);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 24.95f, 97);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Disney", 18.99f, 110);
//        
//        Track track1 = new Track("Happy new year", 3);
//        Track track2 = new Track("Xuan nay con khong ve", 4);
//        Track track3 = new Track("Doraemon BGM", 2);
//        Track track4 = new Track("Bad guy", 4);
//        CompactDisc cd1 = new CompactDisc(7, "Nhac nam moi", "Nhac pop", "Hong Duc", "Duc", 100);
//        cd1.addTrack(track1);
//        cd1.addTrack(track2);
//        CompactDisc cd2 = new CompactDisc(8, "Nhac cach mang", "Nhac do", "Cong Ly", "MTP", 150);
//
//        
//        Book b1 = new Book(4, "De Men phieu luu ky", "Sach Viet Nam", 20);
//        b1.addAuthor("To Hoai");
//        Book b2 = new Book(5, "Loc Dinh Ky", "Sach Trung Quoc", 15.59f);
//        Book b3 = new Book(6, "Vo nhat", "Sach Viet Nam", 50);
//        b3.addAuthor("Nam Cao");
//        b3.addAuthor("Xuan Dieu");                   
        
        List<Order> orderList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int select = -1;
        while (select != 0) {
            System.out.println();
            showMenu();
            select = sc.nextInt();
            switch(select){
            case 1:
                if (Order.nbOrdered < Order.MAX_LIMITED_ORDERS) {
                    Order newOrder = new Order(date1);
                    orderList.add(newOrder);
                    System.out.println("Order created!");
                } else System.out.println("Can't create more order!");
                break;
            case 2:
                int add = -1;
                while (add != 0) {    
                    System.out.println();
                    showAddMenu();
                    String tmp;
                    add = sc.nextInt();
                    sc.nextLine();
                    switch(add) {
                        case 1:
                            System.out.println("Insert the title of the DVD: ");
                            tmp = sc.nextLine();
                            DigitalVideoDisc tmpDVDItem = (DigitalVideoDisc)Media.search(tmp);
                            if (tmpDVDItem != null) {
                                orderList.get(Order.nbOrdered - 1).addMedia(tmpDVDItem); 
                                System.out.println("Do you want to play the DVD? Yes/No");
                                tmp = sc.nextLine();
                                if (tmp.equalsIgnoreCase("Yes")) {
                                    tmpDVDItem.play();
                                }
                            }                          
                            break;
                        case 2:
                            System.out.println("Insert the title of the CD: ");
                            tmp = sc.nextLine();
                            CompactDisc tmpCDItem = (CompactDisc)Media.search(tmp);
                            if (tmpCDItem != null) {
                                orderList.get(Order.nbOrdered - 1).addMedia(tmpCDItem);
                                
                                System.out.println("Do you want to add track? Yes/No");
                                tmp = sc.nextLine();
                                while (tmp.equalsIgnoreCase("Yes")) {                                 
                                    System.out.println("Insert the title of the track you want to add: ");
                                    tmp = sc.nextLine();
                                    Track tmpTrack = Track.search(tmp);
                                    if (tmpTrack != null) {
                                        tmpCDItem.addTrack(tmpTrack);
                                    }
                                    System.out.println("Do you want to add another track? Yes/No");
                                    tmp = sc.nextLine();
                                }
                                
                                System.out.println("Do you want to play the CD? Yes/No");
                                tmp = sc.nextLine();
                                if (tmp.equalsIgnoreCase("Yes")) {
                                    tmpCDItem.play();
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Insert the title of the book: ");
                            tmp = sc.nextLine();
                            orderList.get(Order.nbOrdered - 1).addMediaByTitle(tmp);  
                            break;  
                        case 0:
                            System.out.println("Order completed!");
                            break;
                        default:
                            System.out.println("Invalid function!");
                            break;
                    }
                }       
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
