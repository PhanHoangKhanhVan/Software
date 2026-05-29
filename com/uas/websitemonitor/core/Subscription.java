package com.uas.websitemonitor.core;

// THÊM DÒNG NÀY VÀO: Chỉ đường cho Subscription tìm thấy NotificationChannel
import com.uas.websitemonitor.notification.NotificationChannel;

public class Subscription {
    private int subID;
    private User user;
    private Website website;
    private NotificationChannel channel;

    public Subscription(int subID, User user, Website website, NotificationChannel channel) {
        this.subID = subID;
        this.user = user;
        this.website = website;
        this.channel = channel;
    }

    public Website getWebsite() { return website; }
    public User getUser() { return user; }
    public NotificationChannel getChannel() { return channel; }
}