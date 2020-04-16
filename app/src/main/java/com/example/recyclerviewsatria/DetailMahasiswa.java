package com.example.recyclerviewsatria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailMahasiswa extends AppCompatActivity {
    public static final String EXTRA_MAHASISWA = "extra_mahasiswa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_mahasiswa);

        TextView tvObject = findViewById(R.id.tv_object_received);
        Mahasiswa mahasiswa = getIntent().getParcelableExtra(EXTRA_MAHASISWA);
        String text = "Nama : " + mahasiswa.getNama() + "\nNIM : " + mahasiswa.getNim() +
                "\nNo Handphone : " + mahasiswa.getNoHp();

        tvObject.setText(text);

        ImageView tvImage = findViewById(R.id.tv_object_photo);

        Glide.with(tvImage.getContext())
                .load(mahasiswa.getPhoto())
                .apply(new RequestOptions().override(200,200))
                .into(tvImage);
    }
}
