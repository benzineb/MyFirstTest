package com.example.user.myfirsttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 08/04/2016.
 */
public class Bonjour extends Activity {

        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonjour);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
            String getName = (String) bd.get("fullname");
            Toast.makeText(Bonjour.this,"Bonjour"+" "+getName,Toast.LENGTH_LONG).show();
    }


}
