package model;

import java.sql.Blob;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class TopStudent2 {
    private String sdt;    // primary key
    private String name;
    private int sotinDat;
    private int sotinTichLuy;
    private int sotinNo;     
    private String queQuan;
    private String truong;
    private Blob avatar;

    public TopStudent2() {
    }

    public TopStudent2(String sdt, String name, int dat, int tichluy, int no, String queQuan, String truong, Blob avatar) {
        this.sdt = sdt;
        this.name = name;
        this.sotinDat = dat;
        this.sotinNo = no;
        this.sotinTichLuy = tichluy;
        this.queQuan = queQuan;
        this.truong = truong;
        this.avatar = avatar;
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

    public int getSotinDat() {
        return sotinDat;
    }

    public void setSotinDat(int sotinDat) {
        this.sotinDat = sotinDat;
    }

    public int getSotinTichLuy() {
        return sotinTichLuy;
    }

    public void setSotinTichLuy(int sotinTichLuy) {
        this.sotinTichLuy = sotinTichLuy;
    }

    public int getSotinNo() {
        return sotinNo;
    }

    public void setSotinNo(int sotinNo) {
        this.sotinNo = sotinNo;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }
    
    public ImageIcon getAvatarImageIcon() throws SQLException {
        // Chuyển đổi Blob thành byte array
        if(this.avatar != null){
            byte[] imageData = avatar.getBytes(1, (int) avatar.length());
            // Tạo ImageIcon từ byte array
            return new ImageIcon(imageData);
        }
        return null;
    }     
}
