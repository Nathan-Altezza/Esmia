package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button b3 = findViewById(R.id.cours1);
        final EditText ed1 = findViewById(R.id.editTextTextPersonName);

      b3.setOnClickListener(new View.OnClickListener() {
    //ETO LE MANISY ALERT MESSAGE
          @Override
          public void onClick(View v) {
              String valeur= ed1.getText().toString();
              Toast.makeText(getApplicationContext(),  "Salama "+ valeur,Toast.LENGTH_LONG).show();
              AlertDialog alertDialog= new AlertDialog.Builder(MainActivity2.this).create();
              alertDialog.setTitle("Information");
              alertDialog.setMessage("Tongasoa Mr. " + valeur);

              alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      Intent i = new Intent (getApplicationContext(), MainActivity.class);
                  }
              });
              alertDialog.show();

          }
      });

        WebView page = findViewById(R.id.web1);
        page.getSettings().setJavaScriptEnabled(true);
        page.loadUrl("http://mbasic.facebook.com");

    }
}