package com.hanzpro.ormawapolines;

import java.util.ArrayList;

public class hmjData {
    public static String[][] data = new String[][] {
            {"0","HMJ Teknik Elektro", "HMJ Elektro terdiri dari Teknik Listrik, Teknik Elektronika, Teknik Telekomunikasi, dan Teknik Informatika ", "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ Teknik Sipil", "HMJ Sipil terdiri dari Konstruksi Gedung, Konstruksi Sipil, Teknik Perawatan dan Perbaikan Gedung, dan Perancangan Jalan dan Jembatan", "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2","HMJ Teknik Mesin", "HMJ Mesin terdiri dari Teknik Mesin, Teknik Konversi Energi, Teknik Mesin Produksi dan Perawatan, dan Teknologi Rekayasa Pembangkit Energi", "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3","HMJ Akuntansi", "HMJ Akuntansi terdiri dari Akuntansi, Perbankan dan Keuangan, Komputerisasi Akuntansi, Perbankan Syariah, Analisis Keuangan, dan Akuntansi Manajerial", "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4","HMJ Administrasi Bisnis", "HMJ Administrasi Bisnis terdiri dari Administrasi Bisnis, Manajemen Pemasaran, Manajemen Bisnis", "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}
    };
    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
