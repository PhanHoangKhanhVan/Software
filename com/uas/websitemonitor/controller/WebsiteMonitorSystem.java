import java.util.ArrayList;
import java.util.List;

public class WebsiteMonitorSystem {
    private List<Subscription> subscriptions = new ArrayList<>();

    public void registerForUpdate(int subID, User user, String url, NotificationChannel channel) {
        Website website = new Website(url);
        Subscription sub = new Subscription(subID, user, website, channel);
        subscriptions.add(sub);
        System.out.println("Đăng ký thành công URL: " + url + " cho " + user.getName());
    }

    // Giả lập quét định kỳ hệ thống
    public void checkWebsites(String simulatedNewContent) {
        for (Subscription sub : subscriptions) {
            if (sub.getWebsite().hasUpdates(simulatedNewContent)) {
                String msg = "Trang web " + sub.getWebsite().getUrl() + " vừa có nội dung mới!";
                sub.getChannel().send(msg);
            }
        }
    }
}