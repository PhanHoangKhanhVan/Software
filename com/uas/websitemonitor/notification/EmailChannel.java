package com.uas.websitemonitor.notification;

// Các Concrete Observer (Người quan sát cụ thể)
public class EmailChannel implements NotificationChannel {
    private String emailAddress;

    public EmailChannel(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String url, String newContent) {
        System.out.println("[EMAIL gửi tới " + emailAddress + "] Trang " + url + " có cập nhật: " + newContent);
    }
}