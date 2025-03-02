package DeMau;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SanPhamServiceTest {

    @Test
    public void themSanPham(){
        SanPhamService service = new SanPhamService();
        SanPham sp = new SanPham( "SP001","LapTop", 2, 1500f, 10, "Cong Nghe");
        service.themSanPhamService(sp);
        List<SanPham> danhSach = new ArrayList<>();
        Assertions.assertEquals(1, danhSach.size());
        Assertions.assertEquals("LapTop", danhSach.get(0).getTen());
    }
}
