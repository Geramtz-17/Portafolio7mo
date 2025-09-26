package com.itver.desafioprofe1408;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView pantalla;
        Button boton1;
        Button boton2;
        EditText entrada;


        boton1=findViewById(R.id.botoncito1)
        boton2=findViewById(R.id.botoncito2)

        boton1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                String  texto=.getText().toString();
                pantalla.setText(texto);
                entrada.setText("");
        });
    }
}