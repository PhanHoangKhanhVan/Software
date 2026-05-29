// File: Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Tạo chú Robot quản lý hệ thống trung tâm (Facade/Controller)
        WebsiteMonitorSystem monitorSystem = new WebsiteMonitorSystem();

        // 2. Tạo một bạn nhỏ người dùng (User)
        User beBi = new User(1, "Bé Bi");

        // 3. Chuẩn bị sẵn 2 chiếc loa thông báo khác nhau
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SMSChannel(); // Thêm kênh SMS của con vào đây!

        System.out.println("--- BẮT ĐẦU CHẠY THỬ HỆ THỐNG ---");

        // 4. Bé Bi đăng ký theo dõi trang phim hoạt hình, muốn nhận qua EMAIL
        monitorSystem.registerForUpdate(101, beBi, "https://hoathinh.com", email);

        // 5. Bé Bi đăng ký thêm trang đọc truyện tranh, muốn nhận qua SMS
        monitorSystem.registerForUpdate(102, beBi, "https://truyentranh.com", sms);

        System.out.println("\n--- LẦN QUÉT 1: Không có gì thay đổi ---");
        // Giả lập hệ thống quét định kỳ, nội dung web vẫn trống như cũ
        monitorSystem.checkWebsites(""); 

        System.out.println("\n--- LẦN QUÉT 2: Có cập nhật mới! ---");
        // Giả lập bất ngờ các trang web đăng tải nội dung mới tinh
        monitorSystem.checkWebsites("Đã ra mắt tập số 5!"); 
    }
}