
//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456

package String_Manipulation;

public class terminal {
    public static void main(String[] args) {
        String HTMl = "<html>\n"+
                "<title>Test</title>\n"+
                "<body>\n"+
                "Your trnx is successful. Trnx Id is: TXN123456\n"+
                "</body>\n"+
                "</html>";
        int code = HTMl.indexOf ("TXN");
        System.out.println(HTMl.substring(code,80));
    }
}
