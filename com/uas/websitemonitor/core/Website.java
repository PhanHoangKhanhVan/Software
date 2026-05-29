package com.uas.websitemonitor.core;

import com.uas.websitemonitor.notification.NotificationChannel;
import java.util.ArrayList;
import java.util.List;

// 2. Lớp Subject (Mục tiêu/Chủ thể được quan sát)
public class Website {
    private String url;
    private String lastContent;
    // Danh sách chứa các Observer đang đăng ký theo dõi
    private List<NotificationChannel> observers = new ArrayList<>();

    public Website(String url) {
        this.url = url;
        this.lastContent = "";
    }

    // Đăng ký nhận thông báo (Attach)
    public void attach(NotificationChannel observer) {
        observers.add(observer);
    }

    // Hủy đăng ký nhận thông báo (Detach)
    public void detach(NotificationChannel observer) {
        observers.remove(observer);
    }

    // Phát thông báo tới tất cả các Observer (Notify)
    public void notifyObservers() {
        for (NotificationChannel observer : observers) {
            observer.update(this.url, this.lastContent);
        }
    }

    // Khi dữ liệu thay đổi, tự động kích hoạt thông báo
    public void checkContent(String newContent) {
        if (!this.lastContent.equals(newContent)) {
            this.lastContent = newContent;
            System.out.println("\n[Hệ thống phát hiện] Trang " + url + " vừa đổi nội dung!");
            notifyObservers(); // Tự động gọi chuỗi liên kết update
        }
    }
}