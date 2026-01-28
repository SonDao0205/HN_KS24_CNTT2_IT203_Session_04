public class Bai4 {
    static void main(String[] args) {
        String cardId = "TV2022123456";
        if (cardId.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
            System.out.println("Mã thẻ hợp lệ.");
        } else {
            if (!cardId.substring(0, 2).matches("^[A-Z]{2}$")) {
                System.out.println("Lỗi: Thiếu tiền tố ");
            } else if (!cardId.substring(2, 6).matches("^\\d{4}$")) {
                System.out.println("Lỗi: Năm không hợp lệ");
            } else if (!cardId.substring(6).matches("^\\d{5}$")) {
                System.out.println("Lỗi: Phần đuôi không hợp lệ ");
            } else {
                System.out.println("Lỗi: Định dạng không chính xác.");
            }
        }
    }
}
