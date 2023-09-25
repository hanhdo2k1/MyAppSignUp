package hanhdo.dvh.mysignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.signupbtn);

        //admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin") && email.getText().toString().equals("admin@gmail.com")) {
                    //correct
                    Toast.makeText(MainActivity.this, "Bạn đã tạo tài khoản thành công", Toast.LENGTH_LONG).show();
                } else {
                    //incorrect
                    Toast.makeText(MainActivity.this, "Bạn tạo tài khoản thất bại!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}