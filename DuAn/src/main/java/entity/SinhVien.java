/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HUU TUONG
 */
public class SinhVien {

    private String MaSV;
    private String TenSV;
    private String ChuyenNganh;
    private String SDT ;
    private String Email;

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    private String matKhau;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String TenSV, String ChuyenNganh, String SDT, String Email) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.ChuyenNganh = ChuyenNganh;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return this.TenSV;
                }
               
    
}
