/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author HUU TUONG
 */
public class PhieuMuon {
    private  String MaPhieuMuon;
    private  String MaDocGia;
    private  String MaSach;
    private  Date NgayMuon;
    private  Date NgayTra;
    private  String SoLuongMuon;

    public PhieuMuon() {
    }

    public PhieuMuon(String MaPhieuMuon, String MaDpcGia, String MaSach, Date NgayMuon, Date NgayTra, String SoLuongMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaDocGia = MaDpcGia;
        this.MaSach = MaSach;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.SoLuongMuon = SoLuongMuon;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDpcGia) {
        this.MaDocGia = MaDpcGia;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getSoLuongMuon() {
        return SoLuongMuon;
    }

    public void setSoLuongMuon(String SoLuongMuon) {
        this.SoLuongMuon = SoLuongMuon;
    }
    
    
}
