/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media;

/**
 *
 * @author Wind
 */
public abstract class Media {
    private String title;
    private String category;
    private float cost;
    private int id;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }
    
//    public Media(String title) {
//        this.title = title;
//    }

//    public Media(int id, String title) {
//        this.title = title;
//        this.id = id;
//    }

//    public Media(String title, String category) {
//        this.title = title;
//        this.category = category;
//    }

//    public Media(String title, String category, float cost) {
//        this.title = title;
//        this.category = category;
//        this.cost = cost;
//    }
    
    public Media(String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
        
    public abstract String showInfo();

}
