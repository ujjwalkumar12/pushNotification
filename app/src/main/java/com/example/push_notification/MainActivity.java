package com.example.push_notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    EditText tokenText;
    Button getToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tokenText=(EditText)findViewById(R.id.tokenText);
        getToken=(Button)findViewById(R.id.getTokenButton);

        getToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tokenText.setText(FirebaseInstanceId.getInstance().getToken());
            }
        });
    }
}
