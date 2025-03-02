package DeMau;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> danhSachSanPham = new ArrayList<>();

    public void themSanPhamService(SanPham sanPham){
        danhSachSanPham.add(sanPham);
    }
    public List<SanPham> getDanhSachSanPham(){
        return danhSachSanPham;
    }

}
