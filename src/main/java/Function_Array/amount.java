package Function_Array;
import java.util.Scanner;

public class amount {
    int[] notes = {1000,500,100,50,20,10,5,2,1};
    void denomination(int money){
        int count;
        for (int note : notes) {
            if (money / note > 0) {
                count = money / note;
                System.out.println(note + "\t" + count);
                money %= note;
                if (money <= 0) {
                    System.exit(0);
                }
                denomination(money);

            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        amount ob = new amount ();
        System.out.print("Money: ");
        int money = sc.nextInt();
        if (money <= 99999 && money > 0)
            ob.denomination(money);
    }
}
