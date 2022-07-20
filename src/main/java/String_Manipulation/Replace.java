//6. Replace "R" from Rahim with "F" from the given String:
//        Input: Ratul and Rahim lives in Rangpur
//        Output: Ratul and Fahim lives in Rangpur


package String_Manipulation;

public class Replace {
    public static void main(String args[]){
        String s1="Ratul and Rahim lives in Rangpur";
        String replaceString=s1.replace("Rahim","Fahim");
        System.out.println(replaceString);
    }

}
