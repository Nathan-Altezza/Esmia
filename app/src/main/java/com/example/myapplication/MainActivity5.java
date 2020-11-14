package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button btn = findViewById(R.id.btn);
        final EditText ch = findViewById(R.id.Chanteur);
        final EditText tit = findViewById(R.id.Titre);
        final TextView ad = findViewById(R.id.text);
        Button button = findViewById(R.id.mitady);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                RequestQueue queue= Volley.newRequestQueue(  MainActivity5.this);
                String url = "http://api.lyrics.ovh/v1/" + ch.getText().toString()+"/"+tit.getText().toString();

                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String  response) {
                                ad.setText("Response is :" + response.substring(0, 550));
                                System.out.println("ok ok " + response);
                            }

                                    },new Response.ErrorListener(){
                                @Override
                                public void onErrorResponse (VolleyError error) {
                                    ad.setText("ne marche pas");
                                }



                        });
                queue.add(stringRequest);

            }

        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){



            }

        });

    }
}