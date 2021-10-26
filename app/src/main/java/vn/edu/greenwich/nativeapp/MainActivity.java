package vn.edu.greenwich.nativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NativeActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, " ABWFFWFWFC", Toast.LENGTH_LONG).show();

        String btnLoginName = getResources().getString(R.string.btn_login);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setText(btnLoginName);
        btnLogin.setOnClickListener(btnLogin_Click);
    }

    private View.OnClickListener btnLogin_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Boolean isValid = true;
            TextView tvError    = findViewById(R.id.tvError);
            TextView tvUsername = findViewById(R.id.tvUsername);
            TextView tvPassword = findViewById(R.id.tvPassword);

            String error = "";
            String username = tvUsername.getText().toString();
            String password = tvPassword.getText().toString();
            String notification_02 = getResources().getString(R.string.notification_02);

            Toast.makeText(v.getContext(), notification_02, Toast.LENGTH_LONG).show();

            if (TextUtils.isEmpty(username)) {
                isValid = false;
                error += "* Username cannot be blank.\n";
            }

            if (TextUtils.isEmpty(password)) {
                isValid = false;
                error += "* Password cannot be blank.\n";
            }

            if (isValid) {
                Toast.makeText(v.getContext(), username + "-" +password, Toast.LENGTH_LONG).show();

                Log.i("Main Activity", username + "-" +password);
                Log.w("Main Activity", "This is a Warning Log.");
                Log.i("Main Activity", "This is a Information Log.");
                Log.d("Main Activity", "This is a Debug Log.");
                Log.v("Main Activity", "This is a Verbose Log.");

                Intent testActivity = new Intent(v.getContext(), NativeActivity.class);
                testActivity.putExtra("username", username);
                testActivity.putExtra("password", password);
                startActivity(testActivity);
                finish();
            }
            else {
                tvError.setText(error);
                Log.e("Main Activity", "This is a Error Log.");
            }
        }
    };
}