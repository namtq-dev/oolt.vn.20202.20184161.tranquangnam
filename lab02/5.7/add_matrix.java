import java.util.Scanner;
import java.util.Arrays;

public class add_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        System.out.println("Nhap ma tran A: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap ma tran B: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = sc.nextInt();
                b[i][j] += a[i][j];
            }
        }
        System.out.println("Ma tran moi sau khi cong 2 ma tran A va B la:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}