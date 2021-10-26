package vn.edu.greenwich.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);

        TextView tvUsername = findViewById(R.id.tvUsername_Test);
        TextView tvPassword = findViewById(R.id.tvPassword_Test);

        Intent intent = getIntent();

        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        //int a = intent.getIntExtra("username", 0);                          // Lưu ý lấy dữ liệu ra dạng số
        //Boolean b = intent.getBooleanExtra("username", false);

        tvUsername.setText(username);
        tvPassword.setText(password);

    }
}