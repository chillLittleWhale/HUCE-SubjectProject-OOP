package model;

import java.sql.Blob;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.ImageIcon;

public class Account {
    private String sdt;    // primary key
    private String mk;
    private String email;
    private String role;   // admin hay sv
    private String name;
    private Date ngaySinh;
    private boolean gioiTinh;  // nam 1, nu 0
    private String queQuan;
    private String nganh;
    private String truong;
    private ArrayList< String> dsHocKy;
    private float diemTichLuy;
    private Blob avatar;

    public Account() { 
        this.sdt = "0000000000";
        this.mk = "defaultPass123";
        this.role = "sv";
        this.name = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date utilDate = dateFormat.parse("2000-01-01");
            this.ngaySinh = new java.sql.Date(utilDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.gioiTinh = true;
        this.queQuan ="";
        this.nganh = " ";
        this.truong= " ";
        this.dsHocKy = new ArrayList<>();
        this.diemTichLuy = 0;
    }
    public Account(String sdt, String mk, String email) {
        this.sdt = sdt;
        this.mk = mk;
        this.email = email;
        this.role = "sv";
        this.name = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date utilDate = dateFormat.parse("2000-01-01");
            this.ngaySinh = new java.sql.Date(utilDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.gioiTinh = true;
        this.queQuan ="";
        this.nganh = " ";
        this.truong= " ";
        this.dsHocKy = new ArrayList<>();
        this.diemTichLuy = 0;
    }
    

    public String getDsHKString() {
        // tạo chuỗi, phân cách các phần tử bằng dấu phẩy ",", để cho vào sql
        if(dsHocKy.size() == 1){
            return dsHocKy.get(0);
        }
        return String.join(",", dsHocKy); 
    }
    public void setDsHKFromString(String dsHKStr) {
        // cho vào 1 chuỗi từ trong sql, đặt cho ds học kỳ của account
        dsHocKy = new ArrayList<String>(Arrays.asList(dsHKStr.split(",")));
    }

    public void addHk(String hocky){
        dsHocKy.add(hocky);
    }
    
    public ArrayList<String> getDsHocKy() {
        return dsHocKy;
    }

    public void setDsHocKy(ArrayList<String> dsHocKy) {
        this.dsHocKy = dsHocKy;
    }

    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMk() {
        return mk;
    }
    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public float getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(float diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
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
