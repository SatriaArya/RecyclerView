package com.example.recyclerviewsatria;

import java.util.ArrayList;

public class DataMahasiswa {
    private static String[] mahasiswaNama = {
            "Satria Arya",
            "Koso Riyanto",
            "Giri Baldy"
    };

    private static String[] mahasiswaNim = {
            "311710853",
            "31171",
            "31171"
    };

    private static String[] mahasiswaHp = {
            "082297397514",
            "089546900987",
            "088537087223"
    };

    private static int[] mahasiswaImage = {
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}
