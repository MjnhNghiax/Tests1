package SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> danhSachSV;

    public SinhVienService() {
        danhSachSV = new ArrayList<>();
    }

    // Thêm sinh viên mới vào danh sách
    public void addSV(SinhVien sv) {
        danhSachSV.add(sv);
    }

    // Lấy danh sách tất cả sinh viên
    public List<SinhVien> getAll() {
        return danhSachSV;
    }

    // Cập nhật thông tin sinh viên dựa trên ID
    public void updateSv(SinhVien svMoi, int id) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV() == id) {
                danhSachSV.set(i, svMoi);
                return;
            }
        }
    }

    // Xóa sinh viên theo ID
    public void deleteSv(int id) {
        danhSachSV.removeIf(sv -> sv.getMaSV() == id);
    }
    public SinhVien searchSinhVien(int id) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV() == id) {
                return sv;
            }
        }
        return null;
    }

}
