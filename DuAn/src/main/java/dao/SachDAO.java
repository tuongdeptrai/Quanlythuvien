
package Dao;

import entity.Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ultils.jdbcHelper;

public class SachDAO {
    public void insert(Sach model) {
        String sql = "Insert into SACH(MaSACH, TENSACH, TENTACGIA, NHAXUATBAN,  SOLUONG) VALUES (?,?,?,?,?)";
        jdbcHelper.update(sql,
                model.getMaSach(),
                model.getTenSach(),
                model.getTenTacGia(),
                model.getNhaXuatBan(),
                model.getSoLuong()
        );
    }

    
    public void update(Sach model) {
        String sql = "UPDATE SACH SET TENSACH=?, TENTACGIA=?, NHAXUATBAN=?,  SOLUONG=? WHERE MASACH = ?";
        jdbcHelper.update(sql,
                
                model.getTenSach(),
                model.getTenTacGia(),
                model.getNhaXuatBan(),
                model.getSoLuong(),
                model.getMaSach()
        );
    }

    
    public void delete(String MaSach) {
        String sql = "DELETE FROM SACH WHERE MASACH=?";
        jdbcHelper.update(sql, MaSach);
    }

    
    public List<Sach> selectAll() {
        String sql = "SELECT * FROM SACH";
        return selectBySql(sql);
    }

    
    public Sach selectById(String MaNV) {
        String sql = "select * from SACH where MaSACH=?";
        List<Sach> list = selectBySql(sql, MaNV);
        return list.size() > 0  ? list.get(0) : null;
    }

    
    protected List<Sach> selectBySql(String sql, Object... args) {
        List<Sach> list = new ArrayList<Sach>();
        try{
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                Sach entity = new Sach();
                entity.setMaSach(rs.getString("MaSACH"));
                entity.setTenSach(rs.getString("TENSACH"));
                entity.setTenTacGia(rs.getString("TENTACGIA"));
                entity.setNhaXuatBan(rs.getString("NHAXUATBAN"));
                entity.setSoLuong(rs.getInt("SOLUONG"));            
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
