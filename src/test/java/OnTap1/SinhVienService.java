package OnTap1;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();

    public SinhVienService(){
        list = new ArrayList<>();
    }
    public List<SinhVien> getAll(){
        return list;
    }
    public void addSinhVien(SinhVien sinhVien){
        list.add(sinhVien);
    }

    public void updateSinhVien(SinhVien sinhVien, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                list.set(i, sinhVien);
            }
        }
    }

    public void deleteSinhVien(int id){
        list.removeIf(sinhVien -> sinhVien.getId() == id);
    }
    public SinhVien searchSinhVienById(int id) {
        for (SinhVien sv : list) {
            if (sv.getId() == id) {
                return sv;  // Trả về sinh viên tìm thấy
            }
        }
        return null; // Không tìm thấy, trả về null
    }
}
