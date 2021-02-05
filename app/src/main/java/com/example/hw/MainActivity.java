package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.Hbutton);
        e=(EditText)findViewById(R.id.PersonName);

        b.setOnClickListener(new View.OnClickListener() {//when the user cliks on the button then this method will be implemented
            @Override
            public void onClick(View v) {
                String st=e.getText().toString();//taking the name from the text box
                sendData(st);


            }
        });
    }

    private void sendData(String st) {
        Intent intent = new Intent(this,HelloActivity.class);//to send the name to another activity -we usually use intent when we want to transfer information from one activity to another also when we want to start another activity it take to parameter first the current activity second the activity that I want to go to
        intent.putExtra("personName",st);//to send information from one activity to another
        startActivity(intent);

    }
}