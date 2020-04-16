package com.example.recyclerviewsatria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setHasFixedSize(true);

        list.addAll(DataMahasiswa.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        MahasiswaAdapter listMahasiswaAdapter = new MahasiswaAdapter(list);
        rvMahasiswa.setAdapter(listMahasiswaAdapter);

        listMahasiswaAdapter.setOnItemClickCallback(new MahasiswaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Mahasiswa data) {
                showSelectedMahasiswa(data);

            }
        });

    }

    private void showSelectedMahasiswa(Mahasiswa mahasiswa) {
        //Toast.makeText(this, "Kamu Memilih" + mahasiswa.getNama(), Toast.LENGTH_SHORT).show();
        Intent moveWithObjectIntent = new Intent(MainActivity.this, DetailMahasiswa.class);
        moveWithObjectIntent.putExtra(DetailMahasiswa.EXTRA_MAHASISWA, mahasiswa);
        startActivity(moveWithObjectIntent);
    }
}

