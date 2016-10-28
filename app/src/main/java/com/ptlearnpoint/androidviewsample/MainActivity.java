package com.ptlearnpoint.androidviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editText);
    }

    public void btnSubmitOnClick(View view) {
        Toast.makeText(MainActivity.this, email.getText().toString(), Toast.LENGTH_SHORT).show();

    }
}
