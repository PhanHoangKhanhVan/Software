public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] Gửi thông báo: " + message);
    }
}