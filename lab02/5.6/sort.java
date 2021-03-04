import java.util.Scanner;
import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(a));
        System.out.println("Tong cua cac phan tu mang: " + sum);
        System.out.println("Trung binh cua cac phan tu mang: " + (double)sum/n);
    }
}
