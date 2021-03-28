/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders;

/**
 *
 * @author Wind
 */
public class allDVDList {
    public static final int MAX_DVD = 1000; 
    public static int countDVD = 0;
    public static DigitalVideoDisc[] allDVDList = new DigitalVideoDisc[MAX_DVD];

    public static int getCountDVD() {
        return countDVD;
    }
    
    public static void addIntoList(DigitalVideoDisc dvd) {
        allDVDList[countDVD] = dvd;
        countDVD++;
    }
    
}
