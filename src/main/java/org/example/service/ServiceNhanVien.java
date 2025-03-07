package org.example.service;

import org.example.entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class ServiceNhanVien {

    List<NhanVien> list = new ArrayList<NhanVien>();
    public void add(NhanVien nhanVien) {
        if(nhanVien.getMaNhanVien().isEmpty() || nhanVien.getPhongBan().isEmpty() || nhanVien.getTen().isEmpty()){
            throw new IllegalArgumentException("khong duoc de trong");
        }
        list.add(nhanVien);
    }
    public void updateStudent(NhanVien nhanVien) {
        if (nhanVien == null) {
            throw new IllegalArgumentException("Student can not be null");
        }
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getMaNhanVien() == nhanVien.getMaNhanVien()) {
                list.set(i, nhanVien);
                return;
            } else {
                throw new IllegalArgumentException("Student with id " + nhanVien.getMaNhanVien() + " does not exist");
            }
        }
    }
    public NhanVien getNhanVien(String MaNhanVien) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getMaNhanVien().equals(MaNhanVien)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<NhanVien> getList() {
        return list;
    }

}
