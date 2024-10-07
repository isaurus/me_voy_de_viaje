package com.example.mevoydeviaje;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Acoplamos un objeto Button al objeto botón de XML (INFORMACIÓN)
        Button btnInfo = findViewById(R.id.btnInfo);

        // Iniciamos las variables de los RadioGroup para que apunten al objeto XML
        RadioGroup rbtgDestino = findViewById(R.id.rbtgDestino);
        RadioGroup rbtgTransporte = findViewById(R.id.rbtgTransporte);

        btnInfo.setOnClickListener(v -> {
            RadioButton rbtnDestinoSeleccionado = findViewById(rbtgDestino.getCheckedRadioButtonId());
            RadioButton rbtnTransporteSeleccionado = findViewById(rbtgTransporte.getCheckedRadioButtonId());

            String textoDestinoSeleccionado = rbtnDestinoSeleccionado.getText().toString();
            String textoTransporteSeleccionado = rbtnTransporteSeleccionado.getText().toString();

            Toast.makeText(MainActivity.this, "Viajas a " + textoDestinoSeleccionado + " en " + textoTransporteSeleccionado, Toast.LENGTH_SHORT).show();
        });

    }
}