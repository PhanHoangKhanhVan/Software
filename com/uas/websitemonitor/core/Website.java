public class Website {
    private String url;
    private String lastContent;

    public Website(String url) {
        this.url = url;
        this.lastContent = "";
    }

    public String getUrl() { return url; }

    // Áp dụng nguyên tắc Information Expert: Lớp giữ dữ liệu tự kiểm tra cập nhật
    public boolean hasUpdates(String newContent) {
        if (!this.lastContent.equals(newContent)) {
            this.lastContent = newContent; // Cập nhật nội dung mới
            return true;
        }
        return false;
    }
}