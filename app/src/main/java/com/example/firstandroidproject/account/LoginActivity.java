package com.example.firstandroidproject.account;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.firstandroidproject.BaseActivity;
import com.example.firstandroidproject.MainActivity;
import com.example.firstandroidproject.R;
import com.example.firstandroidproject.category.CategoryCreateActivity;
import com.example.firstandroidproject.dto.category.user.UserItemDTO;
import com.example.firstandroidproject.dto.category.user.UserLoginDTO;
import com.example.firstandroidproject.services.ApplicationNetwork;
import com.google.android.material.textfield.TextInputLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends BaseActivity {
    TextInputLayout tlEmail, tlPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

        tlEmail = findViewById(R.id.tlEmail);
        tlPassword = findViewById(R.id.tlPassword);
    }

    public void onClickLogin(View view) {
        try {
            String email = tlEmail.getEditText().getText().toString().trim();
            String password = tlPassword.getEditText().getText().toString().trim();
            UserLoginDTO dto = new UserLoginDTO();
            dto.setEmail(email);
            dto.setPassword(password);
            ApplicationNetwork.getInstance().getAccountApi().login(dto).enqueue(new Callback<UserItemDTO>() {
                @Override
                public void onResponse(Call<UserItemDTO> call, Response<UserItemDTO> response) {
                    if (response.isSuccessful()) {
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                @Override
                public void onFailure(Call<UserItemDTO> call, Throwable throwable) {
                }
            });
        }
        catch(Exception ex) {
            Log.e("--LoginActivity--", "Problem login "+ ex.getMessage());
        }
    }
}
