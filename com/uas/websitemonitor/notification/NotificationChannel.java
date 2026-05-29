package com.uas.websitemonitor.notification;

// 1. Giao diện Observer (Người quan sát)
public interface NotificationChannel {
    // Phương thức nhận bản tin cập nhật trạng thái từ Subject
    void update(String url, String newContent);
}