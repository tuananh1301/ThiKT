package org.example.service;

import org.example.entity.NhanVien;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NhanVienServiceTest {
    private ServiceNhanVien serviceNhanVien;

    @BeforeEach
    public void setUp() {
        serviceNhanVien = new ServiceNhanVien();
    }

    @Test
    void updateNhanVien() {
        NhanVien nhanVien = new NhanVien("MH1", "A", 18, 18000, 20, "B");
        serviceNhanVien.add(nhanVien);
        nhanVien.setTen("Bo");
        nhanVien.setTuoi(21);
        nhanVien.setSoNamLamViec(20);
        nhanVien.setLuong(21000);
        nhanVien.setPhongBan("CC");
        serviceNhanVien.updateStudent(nhanVien);
        assertEquals("Bo", serviceNhanVien.getNhanVien("MH1").getTen());
        assertEquals(21, serviceNhanVien.getNhanVien("MH1").getTuoi());
        assertEquals(20, serviceNhanVien.getNhanVien("MH1").getSoNamLamViec());
        assertEquals("CC", serviceNhanVien.getNhanVien("MH1").getPhongBan());
        assertEquals(21000, serviceNhanVien.getNhanVien("MH1").getLuong());
    }

    @Test
    void updateNhanVienNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> serviceNhanVien.updateStudent(null));
        assertEquals("Student can not be null", exception.getMessage());
    }

    @Test
    void updateKHL() {
        NhanVien nhanVien = new NhanVien("MH1", "A", 18, 18000, 20, "B");
        serviceNhanVien.add(nhanVien);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> serviceNhanVien.updateStudent(new NhanVien("MH1", null, 17, 18000, 20, "B")));
        assertEquals("ten khong duoc null", exception.getMessage());
    }
    @Test
    void updateKHL1() {
        NhanVien nhanVien = new NhanVien("MH1", "A", 20, 18000, 20, "B");
        serviceNhanVien.add(nhanVien);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> serviceNhanVien.updateStudent(new NhanVien("MH1", "null", 17, 18000, 20, "B")));
        assertEquals("tuoi khong nho hon 18", exception.getMessage());
    }
    @Test
    void updateKHL2() {
        NhanVien nhanVien = new NhanVien("MH1", "A", 18, 18000, 20, "B");
        serviceNhanVien.add(nhanVien);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> serviceNhanVien.updateStudent(new NhanVien("MH1", null, 17, 18000, 20, "B")));
        assertEquals("ten khong duoc null", exception.getMessage());
    }

}
