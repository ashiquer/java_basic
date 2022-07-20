package Function_Array;
import java.util.Scanner;
public class No_exits {
    public static void main(String[] args) {

            System.out.println("Enter your value to check: ");
            Scanner scanner = new Scanner(System.in);
            int val=scanner.nextInt();
            int[] arr = {1,3,5,7,2,4,6,8};

            if(check(arr, val)){
                System.out.println(val+" Exists in the array.");
            }
            else {
                System.out.println("Found no element");
            }
        }

    public static boolean check(int[]array,int elem){
        boolean b = false;
        int i=0;
        while (i<array.length) {
            if (array[i] == elem) {
                b = true;
                break;
            }
            i++;
        }
        return b;
    }
}
