/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media;

import java.util.ArrayList;

/**
 *
 * @author Wind
 */
public abstract class Media implements Comparable{
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    public Media(){
        allMediaList.addIntoList(this);
    }
    
    public Media(String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
        allMediaList.addIntoList(this);
    }
    
    public static Media search(String title) {
        String[] tmp1 = title.split("\\s");
        for (Media item : allMediaList.allMedia) {
            String[] tmp2 = item.getTitle().split("\\s");
            int count = 0;
            for (String check2 : tmp2) {
                for (String check1 : tmp1) {
                    if(check1.equalsIgnoreCase(check2)) {
                        count++;
                        break;
                    }
                }
            }
            if (count == tmp2.length) {
                return item;
            }
        }
        System.out.println("Can't find item!");
        return null;
    }
        
    public abstract String showInfo();
    
    public static Media createItem(ItemFactory factory){
        return factory.createItemFromConsole();
    }
    
    @Override
    public boolean equals(Object o){
      if(o instanceof Media){
        for (Media item : allMediaList.allMedia) {
            if (((Media) o).getId() == item.getId()) {
                return true;
            }
        }
      }
      return false;
    }
    
    @Override
    public int compareTo(Object o) {
        if(o instanceof Media){
            return this.getTitle().compareToIgnoreCase(((Media) o).getTitle());
        } else return -1000;
    }
    
}
