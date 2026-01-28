import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    static void main(String[] args) {
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK67890"
        };
        String regex = "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*User:\\s*(\\w+)\\s*\\|\\s*Action:\\s*(BORROW|RETURN)\\s*\\|\\s*BookID:\\s*(\\w+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);
            String date = "";
            String user = "";
            String action = "";
            String bookID = "";
            if (matcher.find()) {
                date = matcher.group(1);
                user = matcher.group(2);
                action = matcher.group(3);
                bookID = matcher.group(4);
                if(action.equals("BORROW")){
                    borrowCount++;
                }
                else if(action.equals("RETURN")){
                    returnCount++;
                }
            }
            System.out.println("-------------------------------");
            System.out.println("Date : " + date);
            System.out.println("User : " + user);
            System.out.println("Action : " + action);
            System.out.println("BookID : " + bookID);
            System.out.println("-------------------------------");
        }

        System.out.println("borrow count : " + borrowCount);
        System.out.println("return count : " + returnCount);
    }
}
