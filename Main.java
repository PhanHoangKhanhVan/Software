// File chạy thử hệ thống: Main.java
import com.uas.websitemonitor.core.Website;
import com.uas.websitemonitor.notification.*;

public class Main {
    public static void main(String[] args) {
        // Tạo Subject
        Website hoathinhWeb = new Website("https://hoathinh.com");

        // Tạo các Observers
        NotificationChannel emailCuaBi = new EmailChannel("bi@gmail.com");
        NotificationChannel smsCuaBi = new SMSChannel("0912345678");

        System.out.println("--- ĐĂNG KÝ THEO DÕI (OBSERVER PATTERN) ---");
        hoathinhWeb.attach(emailCuaBi); // Bi đăng ký nhận qua Email
        hoathinhWeb.attach(smsCuaBi);   // Bi đăng ký nhận thêm qua SMS

        // Giả lập quét lần 1: Có nội dung mới
        hoathinhWeb.checkContent("Đã có tập 5 rồi!");

        // Giả lập hủy đăng ký nhận qua SMS
        System.out.println("\n--- BÉ BI HỦY ĐĂNG KÝ SMS ---");
        hoathinhWeb.detach(smsCuaBi);

        // Giả lập quét lần 2: Có nội dung mới tiếp theo
        hoathinhWeb.checkContent("Đã có tập 6 rồi!");
    }
}