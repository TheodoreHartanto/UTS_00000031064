package umn.ac.id.uts_00000031064_theodorealvinhartanto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Login;
    private Button Profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Profil = findViewById(R.id.main_button_change_1);
        Login = findViewById(R.id.main_button_change_2);

        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilintent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profilintent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginintent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginintent);
            }
        });
    }
}