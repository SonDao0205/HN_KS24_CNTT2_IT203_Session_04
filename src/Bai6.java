import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ , nội dung thật là ngu ngốc và không đáng đọc";
        String[] blackList = {"tệ", "ngu ngốc", "không đáng học"};

        String regex = "(?iu)(?<!\\S)(" + String.join("|", blackList) + ")(?!\\S)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuffer filter = new StringBuffer();
        while (matcher.find()) {
            int length = matcher.group().length();
            String stars = "*".repeat(length);
            matcher.appendReplacement(filter, stars);
        }
        matcher.appendTail(filter);

        String result = filter.toString();

        // Cắt nếu > 200 ký tự
        if (result.length() > 200) {
            int cutIndex = result.substring(0, 200).lastIndexOf(" ");
            StringBuilder sb = new StringBuilder();
            sb.append(result, 0, cutIndex);
            sb.append("...");
            result = sb.toString();
        }

        System.out.println(result);
    }
}
