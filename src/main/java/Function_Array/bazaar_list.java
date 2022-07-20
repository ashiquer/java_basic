package Function_Array;

import java.util.HashMap;
import java.util.Scanner;

public class bazaar_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your products name: ");

        String itemsName = input.nextLine();

        searchItem(itemsName);
        input.close();
    }

    public static void searchItem(String itemsName) {
        HashMap <String, Integer> itemsList = new HashMap<>();

        itemsList.put("alu", 35);
        itemsList.put("oil", 455);
        itemsList.put("begun", 30);
        itemsList.put("tomato", 25);

        int result = 0;

        if (itemsList.containsKey(itemsName))
        {
            result = itemsList.get(itemsName);
            System.out.println("Items price: " + result);
        }
        else
        {
            System.out.println("No items found");
        }
    }
}