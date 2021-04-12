/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wind
 */
public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }
    
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else System.out.println("Author name is already in the list!");
    }
    
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else System.out.println("Author name is not in the list!");
    } 

//    public Book(int id, String title) {
//        super(id, title);
//        allMediaList.addIntoList(this);
//    }

//    public Book(String title, String category) {
//        super(title, category);
//        allMediaList.addIntoList(this);
//    }

//    public Book(String title, String category, float cost) {
//        super(title, category, cost);        
//        allMediaList.addIntoList(this);
//
//    }
    
//    public Book(String title, String category, List<String> authors){
//        super(title, category);
//        this.authors = authors;   
//        allMediaList.addIntoList(this);
//    }

    public Book(int id, String title, String category, float cost) {
        super(title, category, cost, id);
        allMediaList.addIntoList(this);
    }   
    
    public Book(int id, String title, String category, List<String> authors, float cost) {
        super(title, category, cost, id);
        this.authors = authors;
        allMediaList.addIntoList(this);
    }      
    
    @Override
    public String showInfo() {
        return "Book: " + getTitle() + " - " + getCategory() + " - " + getAuthors()+ " - " + getCost();
    }
    
}
