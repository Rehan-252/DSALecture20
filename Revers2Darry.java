import java.util.Scanner;
public class Revers2Darry {
    
    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void swap(int arry[][],int i, int j,int k){
        int temp = arry[i][j];
        arry[i][j] = arry[i][k];
        arry[i][k] = temp;
    }
    
    static void revers(int arry[][], int i, int j, int k){
        while(j<k){
            swap(arry, i, j, k);
            j++;
            k--;
        }
    }
    
    static void revers2darry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
                int j = 0;
                int k = arry[i].length-1;
                revers(arry, i, j, k);
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arry[][] = new int [3][4];
        System.out.println("Enter the elements of arry ");
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                arry[i][j] = in.nextInt();
            }
        }
        
        System.out.println();

        printarry(arry);
        
        revers2darry(arry);
        
        printarry(arry);
        
        in.close();
    
    }
}
