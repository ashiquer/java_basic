//7. Find out how many images are in the given array:
//["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
package String_Manipulation;

import java.util.HashMap;

public class images {
    public static void main(String[] args) {
        String []str={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        HashMap <String,String> hashMap= new HashMap<>();
        int i = 0;
        while (i < str.length) {
            String s = str[i];
            String[] arr = s.split("\\.");
            hashMap.put(arr[0], arr[1]);
            i++;
        }
        System.out.println("Hashmap "+hashMap);
        int count =0;
        for (String extension : hashMap.values()) {
            if (extension.equals("jpg") || extension.equals("png")) count += 1;

        }
        System.out.println("Number of image files: "+count);
    }
}
