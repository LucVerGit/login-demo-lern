package com.lucasverrier.login_learn_android;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lucasverrier.login_learn_android.EnterToApp;








public class MainActivity extends AppCompatActivity {

    private EditText eEmail;
    private EditText ePassword;
    private Button eLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eEmail = findViewById(R.id.emailLogin);
        ePassword = findViewById(R.id.passwordLogin);
        eLogin = findViewById(R.id.buttonLogin);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(eEmail.getText().toString(),ePassword.getText().toString());


            }
        });
    }
    //TODO

    private void validate(String userEmailId, String userPassword)
    {
        if((userEmailId.equals("admin@admin.com"))&&(userPassword.equals("admin1234"))){

            startActivity(new Intent(MainActivity.this, EnterToApp.class));
            //Intent gameActivityIntent = new Intent(MainActivity.this, EnterToApp.class);
            //startActivity(gameActivityIntent);
            Log.d("SUISICI", userEmailId);


        }


    }
}
