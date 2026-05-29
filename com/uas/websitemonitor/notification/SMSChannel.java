package com.uas.websitemonitor.notification;

public class SMSChannel implements NotificationChannel {
    private String phoneNumber;

    public SMSChannel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String url, String newContent) {
        System.out.println("[SMS gửi tới " + phoneNumber + "] Trang " + url + " có cập nhật: " + newContent);
    }
}