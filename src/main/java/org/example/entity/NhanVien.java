package org.example.entity;

public class NhanVien {

    private String maNhanVien;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten.isEmpty()){
            throw new IllegalArgumentException("ten khong duoc null");
        }

        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi < 18){
            throw new IllegalArgumentException("khog duoc nho hon 18");
        }

        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                ", soNamLamViec=" + soNamLamViec +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
