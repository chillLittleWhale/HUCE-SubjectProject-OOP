package model;

import java.sql.Blob;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class Account2 {
    private String sdt;    // primary key
    private String name;    
    private Blob avatar;

    public Account2() {
    }

    public Account2(String sdt, String name) {
        this.sdt = sdt;
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }
    
    
    public ImageIcon getAvatarImageIcon() throws SQLException {
        // Chuyển đổi Blob thành byte array
        byte[] imageData = avatar.getBytes(1, (int) avatar.length());
        // Tạo ImageIcon từ byte array
        return new ImageIcon(imageData);
    }
}
