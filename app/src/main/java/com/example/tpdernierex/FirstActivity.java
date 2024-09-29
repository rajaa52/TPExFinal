package com.example.tpdernierex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class FirstActivity extends AppCompatActivity {
    private EditText nom;
    private EditText phone;
    private EditText adresse;
    private Spinner villes;
    private Button submit;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nom = findViewById(R.id.nom);
        phone = findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        adresse = findViewById(R.id.adresse);
        email = findViewById(R.id.email);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (nom.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        phone.getText().toString().isEmpty() ||
                        adresse.getText().toString().isEmpty()) {
                    Toast.makeText(FirstActivity.this, " Remplissez tous les champs", Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("ville", villes.getSelectedItem().toString());
                intent.putExtra("adresse", adresse.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}