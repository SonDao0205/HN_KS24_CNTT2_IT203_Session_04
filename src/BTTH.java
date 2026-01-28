import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BTTH {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sách : ");
        String bookId = sc.nextLine();
        System.out.print("Mã ISBN : ");
        String isbn = sc.nextLine();
        System.out.print("Năm xuất bản : ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Tên sách : ");
        String title = sc.nextLine();
        System.out.print("Tên tác giả : ");
        String author = sc.nextLine();
        String idRegex = "^LIB-\\d{4}-S$";
        String isbnRegex = "^\\d{10}$";

        if (!bookId.matches(idRegex) || !isbn.matches(isbnRegex) || (year > 2026 || year < 1000)) {
            System.out.println("Dữ liệu không hợp lệ!");
            return;
        }

        String tempTitle = formatText(title);
        String tempAuthor = formatText(author);
        StringBuilder info = new StringBuilder();
        info.append("[")
                .append(bookId)
                .append("]")
                .append(" - ")
                .append(tempTitle)
                .append(" - ")
                .append(tempAuthor)
                .append("\n");
        System.out.println(info.toString());

    }

    private static String formatText(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }
}
