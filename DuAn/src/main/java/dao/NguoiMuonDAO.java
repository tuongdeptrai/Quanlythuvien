
package Dao;

import entity.DocGia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ultils.jdbcHelper;

public class NguoiMuonDAO {
    public void insert(DocGia model) {
        String sql = "Insert into NGUOIMUON(Ma_NM, TEN_NM, EMAIL, NGAY_SINH, GIOI_TINH, NGAY_DK) VALUES (?,?,?,?,?,?)";
        jdbcHelper.update(sql,
                model.getMaDocGia(),
                model.getTenDocGia(),
                model.getEmail(),
                model.getSDT()
        );
    }

    
    public void update(DocGia model) {
        String sql = "UPDATE NguoiMuon SET TEN_NM=?, Email=?, NGAY_SINH=?, GIOI_TINH=?, NGAY_DK=? WHERE MA_NM = ?";
        jdbcHelper.update(sql,
                model.getTenDocGia(),
                model.getEmail(),
                model.getSDT(),
                model.getMaDocGia()
        );
    }

    
    public void delete(String MaNM) {
        String sql = "DELETE FROM NguoiMuon WHERE Ma_NM=?";
        jdbcHelper.update(sql, MaNM);
    }

    
    public List<DocGia> selectAll() {
        String sql = "SELECT * FROM NguoiMuon";
        return selectBySql(sql);
    }

    
    public DocGia selectById(String MaNM) {
        String sql = "select * from NguoiMuon where Ma_NM=?";
        List<DocGia> list = selectBySql(sql, MaNM);
        return list.size() > 0  ? list.get(0) : null;
    }

    
    protected List<DocGia> selectBySql(String sql, Object... args) {
        List<DocGia> list = new ArrayList<DocGia>();
        try{
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                DocGia entity = new DocGia();
                entity.setMaDocGia(rs.getString("Ma_NM"));
                entity.setTenDocGia(rs.getString("TEN_NM"));
                entity.setEmail(rs.getString("Email"));
                entity.setSDT(rs.getString(""));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
