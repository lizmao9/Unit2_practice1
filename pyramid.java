/**
 */
public class pyramid
{
    
    public static void printPyramid(int n) {
        for (int i = 0; i < n ; i ++){
            for (int k = n-i - 1; k > 0 ; k--){
                System.out.print (" ");
            }
            
            for (int j = 0; j< (2*i + 1); j++){
                System.out.print ("x");
            }
            System.out.print("\n");
        }
    }

}