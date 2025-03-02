package com.example.onthi.service;

import com.example.onthi.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();

    public SinhVienService(){
        list = new ArrayList<>();
    }

    public List<SinhVien> getAll(){return list;}

    public void updateSinhVien(SinhVien sv, int id){
        list.set(id, sv);
    }

}
