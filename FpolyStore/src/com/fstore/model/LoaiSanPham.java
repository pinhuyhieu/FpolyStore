/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstore.model;

/**
 *
 * @author Dell
 */
public class LoaiSanPham {
    private int ID_loaiSanpham;
    private String tenLoaisanPham;
    private int trangThai;

    public LoaiSanPham(int ID_loaiSanpham) {
        this.ID_loaiSanpham = ID_loaiSanpham;
    }

    public LoaiSanPham() {
    }

    public int getID_loaiSanpham() {
        return ID_loaiSanpham;
    }

    public void setID_loaiSanpham(int ID_loaiSanpham) {
        this.ID_loaiSanpham = ID_loaiSanpham;
    }

    public String getTenLoaisanPham() {
        return tenLoaisanPham;
    }

    public void setTenLoaisanPham(String tenLoaisanPham) {
        this.tenLoaisanPham = tenLoaisanPham;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public LoaiSanPham(int ID_loaiSanpham, String tenLoaisanPham, int trangThai) {
        this.ID_loaiSanpham = ID_loaiSanpham;
        this.tenLoaisanPham = tenLoaisanPham;
        this.trangThai = trangThai;
    }
}
