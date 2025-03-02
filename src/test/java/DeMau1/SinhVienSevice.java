package DeMau1;

import java.util.HashMap;
import java.util.Map;

public class SinhVienSevice {
    private Map<String, SinhVien> sinhVienMap = new HashMap<>();

    public SinhVien getSinhVien(String maSV) {
        return sinhVienMap.get(maSV);
    }

    public void themSinhVien(SinhVien sinhVien) {
        sinhVienMap.put(sinhVien.getMaSV(), sinhVien);
    }

    public boolean suaSinhVien(String maSV, SinhVien sinhVienMoi) {
        if (!sinhVienMap.containsKey(maSV)) {
            return false;
        }
        sinhVienMap.put(maSV, sinhVienMoi);
        return true;
    }
}
