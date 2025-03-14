import java.util.Scanner;
public class Multiply2Darry {
    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void multiplyarry(int arry1[][], int arry2[][]){
        int ans[][] = new int [2][2];

        for(int i = 0; i < arry1.length; i++){
            for(int j = 0; j < arry1[i].length; j++){
                for(int k = 0; k < arry1[j].length; k++){
                ans[i][j] += (arry1[i][k] * arry2[k][j]);
                }
            }
        }
        printarry(ans);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arry1[][] = new int [2][2];
        int arry2[][] = new int [2][2];

        System.out.println("Enter the elements of arry1 ");
        for(int i = 0; i < arry1.length; i++){
            for(int j = 0; j < arry1[i].length;j++){
                arry1[i][j] = in.nextInt();
            }
        }
        printarry(arry1);

        System.out.println("Enter the elements of arry2 ");
        for(int i = 0; i < arry2.length; i++){
            for(int j = 0; j < arry2[i].length;j++){
                arry2[i][j] = in.nextInt();
            }
        }
        printarry(arry2);
        multiplyarry(arry1, arry2);
        in.close();
    }
}


