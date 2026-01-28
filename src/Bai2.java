public class Bai2 {
    static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4; // bỏ "Kệ:"
            int end = description.indexOf(",", start);

            String temp = description.substring(start, end).trim();
            System.out.println("Vị trí tìm thấy: " + temp);
        }
        description = description.replace("Kệ:", "Vị trí tìm thấy:");
        System.out.println(description);
    }
}
