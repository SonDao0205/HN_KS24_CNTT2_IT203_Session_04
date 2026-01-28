import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        String category = sc.nextLine();

        String tempTitle = title.trim().replaceAll("\\s+", " ").toUpperCase();

        String tempAuthor = author.trim().replaceAll("\\s+", " ");
        String[] words = tempAuthor.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstChar = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                sb.append(firstChar).append(rest).append(" ");
            }
        }
        String result = "[" + tempTitle + "] - Tác giả: " + sb.toString() + "\n";
        System.out.println(result);
    }
}