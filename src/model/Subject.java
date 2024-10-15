package model;

public class Subject {
    private String idMon;
    private String tenMon;

    public Subject() {
    }

    public Subject(String idMon, String tenMon) {
        this.idMon = idMon;
        this.tenMon = tenMon;
    }

    public String getIdMon() {
        return idMon;
    }

    public void setIdMon(String idMon) {
        this.idMon = idMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    
    public static void main(String[] args) {
        
    } 
}
