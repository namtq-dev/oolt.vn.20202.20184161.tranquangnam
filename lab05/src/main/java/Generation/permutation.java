/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generation;
import java.util.*;
/**
 *
 * @author Wind
 */
public class permutation {
    private static int MAX = 1000;
    private static boolean[] check = new boolean[MAX];
    private static int[] a = new int[MAX];
    
    public static boolean permutation(int k, int count, String temp, String[] titlePart){
        String tmp;
        boolean checkString = false;       
        for (int i = 0; i < count; i++) {
            if (check[i] == false) {
                a[k] = i;                
                if (k == count-1) {
                    tmp = addPermutation(count, titlePart);
                    return tmp.equalsIgnoreCase(temp);
                } else{
                    check[i] = true;
                    checkString = permutation(k+1, count, temp, titlePart);
                    if(checkString) break;
                    check[i] = false;
                }
            }
        }
        return checkString;
    }
    
    public static String addPermutation(int count, String[] titlePart){
        String s = "";
        for (int i = 0; i < count; i++) {
            s += titlePart[a[i]];
        }
        return s;
    }
    
}
