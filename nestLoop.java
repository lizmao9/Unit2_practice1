/**
 */
public class nestLoop
{
    
    public static void printSquare(int n) {
        for (int j = 0; j < n; j++) {
            printRow(n);
        }
    }
    
    public static void printRectangle(int height, int width) {
        for (int j = 0; j < height; j++) {
            printRow(width);
        }
    }
    
    public static void printTriangle(int height) {
        for (int j = 0; j < height; j++) {
            printRow(j + 1);
        }
    }
    
    public static void printRow(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("X");
        }
        System.out.print("\n");
    }
}