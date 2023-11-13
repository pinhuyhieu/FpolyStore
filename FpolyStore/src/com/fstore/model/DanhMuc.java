/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstore.model;

/**
 *
 * @author Dell
 */
public class DanhMuc {
    private String tenDanhmuc;
    private int trangThai;

    public DanhMuc() {
    }

    public DanhMuc(String tenDanhmuc, int trangThai) {
        this.tenDanhmuc = tenDanhmuc;
        this.trangThai = trangThai;
    }

    public String getTenDanhmuc() {
        return tenDanhmuc;
    }

    public void setTenDanhmuc(String tenDanhmuc) {
        this.tenDanhmuc = tenDanhmuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
