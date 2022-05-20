import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter Matrix Size (N x M)");
        int m = getM();
        int n = getN();

        int[][] Matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Type in element ("+ i + " " + j + ")");
                Scanner a = new Scanner(System.in);
                Matrix[i][j] = a.nextInt();
            }
        }

        System.out.println("Your Matrix is:");
        printMatrix(Matrix,n,m);

        System.out.println("Indexes of Negative Numbers are:");
        findNegativeNumbers(Matrix,n,m);
    }

    public static int getM(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getN(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static void printMatrix(int[][] Matrix,int n , int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void findNegativeNumbers(int[][] Matrix,int n , int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(Matrix[i][j] < 0 ){
                    System.out.println("(" + i + " " + j + ")");
                }

            }
        }
    }
}
