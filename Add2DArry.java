import java.util.Scanner;
public class Add2DArry {
    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void add_arry(int arry1[][], int arry2[][]){
        int ans[][] = new int [2][2];

        for(int i = 0; i < arry1.length; i++){
            for(int j = 0; j < arry1[i].length; j++){
                ans[i][j] = arry1[i][j] + arry2[i][j];
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

        add_arry(arry1, arry2);
        in.close();
    }
}
