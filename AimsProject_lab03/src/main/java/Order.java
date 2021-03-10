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

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added!");
        } else System.out.println("The order is full!"); 
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
    
    public void showOrders(){
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". " + itemsOrdered[i].getTitle());
        }
    }
}
