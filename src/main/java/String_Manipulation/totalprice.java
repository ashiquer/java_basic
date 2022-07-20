
//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

package String_Manipulation;

import java.util.Scanner;

public class totalprice {
    public static void main(String[] args) {
        var shirtPrice = 1200;
        var shareePrice = 3500;
        var discountPrice = 400;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your shirt quantity");
        int shirtQuantity = input.nextInt();
        System.out.println("Enter your Sharee quantity");
        int shareeQuantity = input.nextInt();

        var totalShirtPrice = shirtQuantity * shirtPrice;
        var totalShareePrice = shareeQuantity * shareePrice;
        var orginalPrice = totalShirtPrice + totalShareePrice;

        if (shirtQuantity != 2 || shareeQuantity != 1) System.out.println("Orginal cost: " + orginalPrice);
        else {
            var totalPrice = orginalPrice - discountPrice;
            System.out.println("Discount Total cost: " + totalPrice);
        }
        input.close();
    }
}