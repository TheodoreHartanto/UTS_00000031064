package umn.ac.id.uts_00000031064_theodorealvinhartanto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Notif;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = findViewById(R.id.User);
        Password = findViewById(R.id.Password);
        Login = findViewById(R.id.btnLogin);
        Notif = findViewById(R.id.Notif);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("uasmobile")) && (userPassword.equals("uasmobilegenap"))){
            Intent intent = new Intent(LoginActivity.this, ListMenuActivity.class);
            startActivity(intent);
        } else {
            Notif.setText("Username / Password yang anda masukkan salah!");
        }
    }
}
