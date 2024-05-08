package com.example.firstandroidproject.account;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firstandroidproject.BaseActivity;
import com.example.firstandroidproject.R;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends BaseActivity {
    TextInputLayout tlUserName, tlPassword, tlConfPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity_main);

        tlUserName = findViewById(R.id.tlUserName);
        tlPassword = findViewById(R.id.tlPassword);
        tlConfPassword = findViewById(R.id.tlConfPassword);
    }

    public void onClickSignIn(View view) {

    }
}

