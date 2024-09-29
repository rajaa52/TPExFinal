package com.example.tpdernierex;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private TextView nom, email, ville, phone, adresse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nom = findViewById(R.id.nom);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);

        nom.setText(this.getIntent().getStringExtra("nom"));
        email.setText(this.getIntent().getStringExtra("email"));
        ville.setText(this.getIntent().getStringExtra("ville"));
        adresse.setText(this.getIntent().getStringExtra("adresse"));
        phone.setText(this.getIntent().getStringExtra("phone"));
    }
}