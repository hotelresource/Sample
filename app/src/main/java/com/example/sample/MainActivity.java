package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usr,pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usr=(EditText)findViewById(R.id.edusrname);
        pas=(EditText)findViewById(R.id.edpass);

    }
    public void login(View view){
        String user=usr.getText().toString();
        String pass=pas.getText().toString();

        background bg=new background(this);
        bg.execute(user,pass);
    }

}