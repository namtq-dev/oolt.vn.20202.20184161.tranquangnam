/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class BookFactory implements ItemFactory{

    @Override
    public Media createItemFromConsole() {
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter book ID :");
        book.setId(input.nextInt());
        input.nextLine();
        System.out.println("Enter book title : ");
        book.setTitle(input.nextLine());
        System.out.println("Enter book category : ");
        book.setCategory(input.nextLine());
        System.out.println("Enter book cost : ");
        book.setCost(input.nextFloat());
        System.out.println("Enter numbers of author : ");
        int count = input.nextInt();
        input.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Author " + (i + 1) + " : ");
            String authorString = input.nextLine();
            book.addAuthor(authorString);
        }
        
        return book;
    }
    
}
