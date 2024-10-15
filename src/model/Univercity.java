package model;

public class Univercity {
    private String idTruong;
    private String tenTruong;
    private String dchiTruong;

    public Univercity() {
    }

    public Univercity(String idTruong, String tenTruong, String dchiTruong) {
        this.idTruong = idTruong;
        this.tenTruong = tenTruong;
        this.dchiTruong = dchiTruong;
    }

    public String getIdTruong() {
        return idTruong;
    }

    public void setIdTruong(String idTruong) {
        this.idTruong = idTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDchiTruong() {
        return dchiTruong;
    }

    public void setDchiTruong(String dchiTruong) {
        this.dchiTruong = dchiTruong;
    }
    
    public static void main(String[] args) {
        
    }
}
