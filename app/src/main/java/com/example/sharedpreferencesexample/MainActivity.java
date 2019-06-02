package com.example.sharedpreferencesexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnSend(View view) {
        SharedPreferences sharedPref = getSharedPreferences(
                "preferencias_do_usuario", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putFloat("valor_flutuante", 100);
        editor.commit();
    }


    public void btnGet(View view) {
        SharedPreferences sharedPref = getSharedPreferences(
                "preferencias_do_usuario", Context.MODE_PRIVATE);
        float retorno = sharedPref.getFloat("valor_flutuant", 0);
        TextView tv = findViewById(R.id.textView);
        tv.setText(""+retorno);
    }
}
