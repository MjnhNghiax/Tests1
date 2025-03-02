package SinhVien;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class SinhVienTest {
    SinhVienService service;

    @BeforeEach
    public void setup() {
        service = new SinhVienService();
    }

    @Test
    public void testADDSv() {
        SinhVien sv = new SinhVien(1, "Kieu Minh Nghia", "SD308", "KH001", "MH001");
        service.addSV(sv);
        Assertions.assertEquals(1, service.getAll().size());
    }

    @Test
    public void testUpdateSv() {
        SinhVien sv = new SinhVien(1, "Kieu Minh Nghia", "SD308", "KH001", "MH001");
        service.addSV(sv);

        SinhVien sv1 = new SinhVien(1, "Kieu Minh Nghia A", "SD308", "KH001", "MH001");
        service.updateSv(sv1, 1);

        List<SinhVien> danhSachSV = service.getAll();
        Assertions.assertEquals("Kieu Minh Nghia A", danhSachSV.get(0).getTenSV());
    }
    @Test
    public void deleteValid() {
        SinhVien sv = new SinhVien(1, "Kieu Minh Nghia", "SD308", "KH001", "MH001");
        service.addSV(sv);
        int sizeBefore = service.getAll().size();
        service.deleteSv(1);
        int sizeAfter = service.getAll().size();
        Assertions.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void deleteInValid() {
        SinhVien sv = new SinhVien(1, "Kieu Minh Nghia", "SD308", "KH001", "MH001");
        service.addSV(sv);
        int sizeBefore = service.getAll().size();
        service.deleteSv(2); // Xóa sinh viên không tồn tại
        int sizeAfter = service.getAll().size();
        Assertions.assertEquals(sizeBefore, sizeAfter);
    }

    @Test
    public void testSearchSinhVienValid() {
        SinhVien sv = new SinhVien(1, "Kieu Minh Nghia", "SD308", "KH001", "MH001");
        service.addSV(sv);

        SinhVien foundSV = service.searchSinhVien(1);

        Assertions.assertNotNull(foundSV);
        Assertions.assertEquals(1, foundSV.getMaSV());
    }

    @Test
    public void testSearchSinhVienInValid() {
        SinhVien sv = new SinhVien(1, "Kieu Minh Nghia", "SD308", "KH001", "MH001");
        service.addSV(sv);

        SinhVien foundSV = service.searchSinhVien(2); 

        Assertions.assertNull(foundSV);
    }
}