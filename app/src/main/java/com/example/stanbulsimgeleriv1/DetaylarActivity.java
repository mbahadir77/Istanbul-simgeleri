package com.example.stanbulsimgeleriv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.stanbulsimgeleriv1.databinding.ActivityDetaylarBinding;

public class DetaylarActivity extends AppCompatActivity {
    private ActivityDetaylarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetaylarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Bilgiler seciliBilgiler = (Bilgiler) intent.getSerializableExtra("Bilgiler");
        binding.isimText.setText(seciliBilgiler.isim);
        binding.kentText.setText(seciliBilgiler.kent);
        binding.infoText.setText(seciliBilgiler.info);
        binding.imageView.setImageResource(seciliBilgiler.resim);
    }




    }