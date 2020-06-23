package com.example.camershare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectLanguage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);

        Button button_eng = findViewById(R.id.button_eng);
        button_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Language set to English", Toast.LENGTH_LONG).show();
                Intent gotoLogin = new Intent(getApplicationContext(), Login.class);
                startActivity(gotoLogin);
                finish();
            }
        });
//        public void Login(){
//            Intent intent = new Intent(SelectLanguage.this, Login.class);
//            startActivity(intent);
//        }
    }
}
