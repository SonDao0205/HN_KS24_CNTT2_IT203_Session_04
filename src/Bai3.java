public class Bai3 {
    static void main(String[] args) {
        String[] transactions = {"BK001-20/01","BK005-21/01","BK099-22/01"};
        long startSB = System.currentTimeMillis();
//        String Builder
        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: 24/01/2026\n");

        for (String t : transactions) {
            reportSB.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.currentTimeMillis();

//        String goocs
        long startStr = System.currentTimeMillis();

        String reportStr = "";
        reportStr += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: 24/01/2026\n";

        for (String t : transactions) {
            reportStr += "Giao dịch: " + t + "\n";
        }

        long endStr = System.currentTimeMillis();


        System.out.println(reportSB.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: "
                + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: "
                + (endStr - startStr));

    }
}
