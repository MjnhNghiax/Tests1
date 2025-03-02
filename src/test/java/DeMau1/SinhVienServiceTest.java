package DeMau1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {

    private SinhVienSevice sevice;
    private SinhVien sinhVien;
    @BeforeEach
    void setUp(){
        sevice = new SinhVienSevice();
        sinhVien = new SinhVien("SV01", "Nguyen Van A", 20, 1,8f , "CNTT");
        sevice.themSinhVien(sinhVien);
    }

    @Test
    void testSuaSinhVien_ThanhCong() {
        SinhVien svMoi = new SinhVien("SV01", "Nguyen Van B", 21, 9, 4f, "KTMT");
        boolean ketQua = sevice.suaSinhVien("SV01", svMoi);
        Assertions.assertTrue(ketQua);
        Assertions.assertEquals("Nguyen Van B", sevice.getSinhVien("SV01").getTenSV());
    }

    @Test
    void testSuaSinhVien_KhongTonTai() {
        SinhVien svMoi = new SinhVien("SV02", "Le Thi C", 22, 7, 8f, "QTKD");
        boolean ketQua = sevice.suaSinhVien("SV02", svMoi);
        Assertions.assertFalse(ketQua);
    }

}
