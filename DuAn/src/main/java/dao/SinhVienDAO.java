/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.SinhVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ultils.jdbcHelper;

/**
 *
 * @author HUU TUONG
 */
public class SinhVienDAO  {

    final String INSERT_SQL = "INSERT INTO SinhVien (MaSV , TenSV , MatKhau) values (?,?,?)";
    final String UPDATE_SQL = "UPDATE SinhVien set MatKhau = ?, HoTen=? WHERE MaSV = ?";
    final String DELETE_SQL = "DELETE FROM SinhVien WHERE MaSV = ?";
    final String SELECT_ALL_SQL = "select * from SinhVien";
    final String SELECT_BY_ID_SQL = " select * from SinhVien WHERE  MaSV = ? ";

  
    public void insert(SinhVien entity) {
        String sql = "INSERT INTO SinhVien (MaSV , TenSV , MatKhau) values (?, ?,?)";
        jdbcHelper.update(sql,
                entity.getMaSV(),
                entity.getTenSV(),
                entity.getMatKhau());
    }

   
    public void update(SinhVien entity) {
        String sql = "UPDATE SinhVien set MatKhau = ?, HoTen=? WHERE MaSV = ?";
        jdbcHelper.update(sql,
                entity.getMaSV(),
                entity.getTenSV(),
                entity.getMatKhau());
                
    }

    
    public void delete(String MaSV) {
        String sql = "DELETE FROM SinhVien WHERE MaSV=?";
        jdbcHelper.update(sql, MaSV);
    }

    
    public List<SinhVien> selectAll() {
       String sql = "SELECT * FROM SinhVien";
        return selectBySql(sql);
    }

    
    public SinhVien selectById(String MaSV) {
       String sql = "select * from SinhVien where MaSV=?";
        List<SinhVien> list = selectBySql(sql, MaSV);
        return list.size() > 0  ? list.get(0) : null;  }

    
    protected List<SinhVien> selectBySql(String sql, Object... args) {
        List<SinhVien> list = new ArrayList<SinhVien>();
        try{
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                SinhVien entity = new SinhVien();
                entity.setMaSV(rs.getString("MaSV"));
                entity.setTenSV(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
     }

}
