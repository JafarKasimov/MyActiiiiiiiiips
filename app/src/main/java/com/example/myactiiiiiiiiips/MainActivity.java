package com.example.myactiiiiiiiiips;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    Button btnChrome, btnWhatsapp, btnYoutube, btnCamera;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChrome = findViewById(R.id.btn_chrome);
        btnWhatsapp = findViewById(R.id.btn_whatsapp);
        btnYoutube = findViewById(R.id.btn_youtube);
        btnCamera = findViewById(R.id.btn_camera);
        et = findViewById(R.id.eeee);

        click();
    }

    private void click() {
        btnChrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.ru/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String inputNumber = et.getText().toString().trim();
                String url = "https://api.whatsapp.com/send?phone=" + inputNumber;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent =new   Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                    startActivity(intent);
            }
        });
    }
}