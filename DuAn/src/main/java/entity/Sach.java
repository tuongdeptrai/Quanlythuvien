/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HUU TUONG
 */
public class Sach {
    private  String MaSach;
    private  String TenSach;
    private  String TenTacGia;
    private  String NhaXuatBan;
    private  int SoLuong;

    public Sach(String MaSach, String TenSach, String TenTacGia, String NhaXuatBan, int SoLuong) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TenTacGia = TenTacGia;
        this.NhaXuatBan = NhaXuatBan;
        this.SoLuong = SoLuong;
    }

    public Sach() {
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    
    
}
