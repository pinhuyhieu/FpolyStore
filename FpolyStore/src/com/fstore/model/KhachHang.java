/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fstore.model;

/**
 *
 * @author Dell
 */
public class KhachHang {
    private int ID_KhachHang;
    private String tenKH;
    private String SDT;
    private boolean gioiTinh;
    private String diaChi;
    private int trangThai;

    public KhachHang() {
    }

    public KhachHang(int ID_KhachHang, String tenKH, String SDT, boolean gioiTinh, String diaChi, int trangThai) {
        this.ID_KhachHang = ID_KhachHang;
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public KhachHang(String tenKH, String SDT, boolean gioiTinh, String diaChi, int trangThai) {
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public int getID_KhachHang() {
        return ID_KhachHang;
    }

    public void setID_KhachHang(int ID_KhachHang) {
        this.ID_KhachHang = ID_KhachHang;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "ID_KhachHang=" + ID_KhachHang + ", tenKH=" + tenKH + ", SDT=" + SDT + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", trangThai=" + trangThai + '}';
    }
    
}
