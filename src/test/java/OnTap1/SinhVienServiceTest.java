package OnTap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceTest {
    private SinhVienService service;
    @BeforeEach
    public void setUp(){
        service = new SinhVienService();
    }

    @Test
    public void addSinhVien(){
        SinhVien  sv = new SinhVien(1, "SD1909", "KieuMinhNghia", 2);
        service.addSinhVien(sv);
        Assertions.assertEquals(1, service.getAll().size());
    }

    @Test
    public void updateSinhVien(){
        SinhVien  sv = new SinhVien(1, "SD1909", "KieuMinhNghia", 2);
        service.addSinhVien(sv);
        SinhVien updateSV = new SinhVien(1, "SD19000", "KieuMinhNghia", 2);
        service.updateSinhVien(updateSV, 1);
        List<SinhVien> danhSach = service.getAll();
        Assertions.assertEquals("SD19000", danhSach.get(0).getTen());
    }
    @Test
    public void updateSinhVien1(){
        SinhVien sv = new SinhVien(2, "Kieu Minh NGhia", "SD001", 2);
        service.addSinhVien(sv);

        SinhVien updateSV = new SinhVien(2, "Kieu Minh A", "SD001", 2);
        service.updateSinhVien(updateSV, 2);

        List<SinhVien> danhSach = service.getAll();
        Assertions.assertEquals("Kieu Minh A", danhSach.get(0).getTen());
    }

    @Test
    public void SeachSV(){
        SinhVien sv = new SinhVien(2, "Kieu Minh NGhia", "SD001", 2);
        service.addSinhVien(sv);
        service.searchSinhVienById(2);
        Assertions.assertEquals(2, service.searchSinhVienById(2).getId());
    }

}
