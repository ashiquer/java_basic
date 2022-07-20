
//3. Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary


package Function_Array;
import java.util.Arrays;
public class Highest_salary {
    public static void main(String[] args){
        int [] array={35000, 25000, 28000, 32500, 44000, 32800};
        System.out.println("Third Largest: "+getThirdLargest(array));

    }

    private static int getThirdLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length-3];
    }

}
