package com.mirea.kornelyuk.galperina.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestoranPage extends AppCompatActivity {
    private Button button;

    private void openMap() {
        Uri uri = Uri.parse("yandexmaps://maps.yandex.ru/?pt=37.598151,55.760221&z=12&l=map");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoran_page);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });
    }
}