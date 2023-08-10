/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HUU TUONG
 */
public class DocGia {
    private  String MaDocGia;
    private  String TenDocGia;
    private  String SDT;
    private  String Email;

    public DocGia() {
    }

    public DocGia(String MaDocGia, String TenDocGia, String SDT, String Email) {
        this.MaDocGia = MaDocGia;
        this.TenDocGia = TenDocGia;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public String getTenDocGia() {
        return TenDocGia;
    }

    public void setTenDocGia(String TenDocGia) {
        this.TenDocGia = TenDocGia;
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
    
    
}
