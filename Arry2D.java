import java.util.Scanner;
class Arry2D{

    static void printarry(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arry[][] = new int [2][2];

        System.out.println("Enter the elements of arry ");
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length;j++){
                arry[i][j] = in.nextInt();
            }
        }
    
        printarry(arry);
    }
}