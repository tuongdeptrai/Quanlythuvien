package Dao;

import entity.PhieuMuon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ultils.jdbcHelper;

public class PhieuMuonDAO {

    public void insert(PhieuMuon model) {
        String sql = "Insert into PhieuMuon(Ma_PM, MA_NM, MA_SACH, MA_NV, NGAY_MUON, NGAY_TRA) VALUES (?,?,?,?,?,?)";
        jdbcHelper.update(sql,
                model.getMaPhieuMuon(),
                model.getMaDocGia(),
                model.getMaSach(),
                model.getNgayMuon(),
                model.getNgayTra(),
                model.getSoLuongMuon()
        );
    }

    public void update(PhieuMuon model) {
        String sql = "UPDATE PhieuMuon SET MA_NM=?, MA_SACH=?, MA_NV=?, NGAY_MUON=?, NGAY_TRA=? WHERE MA_PM = ?";
        jdbcHelper.update(sql,
                
                model.getMaDocGia(),
                model.getMaSach(),
                model.getNgayMuon(),
                model.getNgayTra(),
                model.getSoLuongMuon(),
                model.getMaPhieuMuon()
        );
        
    }

    public void delete(String MaPM) {
        String sql = "DELETE FROM PhieuMuon WHERE Ma_PM=?";
        jdbcHelper.update(sql, MaPM);
    }

    public List<PhieuMuon> selectAll() {
        String sql = "SELECT * FROM PhieuMuon";
        return selectBySql(sql);
    }

    public PhieuMuon selectById(String MaPM) {
        String sql = "select * from PhieuMuon where Ma_PM=?";
        List<PhieuMuon> list = selectBySql(sql, MaPM);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<PhieuMuon> selectBySql(String sql, Object... args) {
        List<PhieuMuon> list = new ArrayList<PhieuMuon>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                PhieuMuon entity = new PhieuMuon();
                entity.setMaPhieuMuon(rs.getString("Ma_PM"));
                entity.setMaSach(rs.getString("Ma_Sach"));
                entity.setMaDocGia(rs.getString("Ma_NM"));
                entity.setNgayMuon(rs.getDate("NGAY_MUON"));
                entity.setNgayTra(rs.getDate("NGAY_TRA"));
                entity.setSoLuongMuon(rs.getString("M"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
