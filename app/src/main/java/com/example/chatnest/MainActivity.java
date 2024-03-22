package com.example.chatnest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements view.OnclickListener {

    Button signupbtn,loginbtn,forgot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        signupbtn=findViewById(R.id.signup_button);
        loginbtn=findViewById(R.id.logRin_button);
        forgot = findViewById(R.id.send_password);

        signupbtn.setOnClickListener(this);
        loginbtn.setOnClickListener(this);
        forgot.setOnClickListener(this);    
            @Override
            public void onClick(View v) {
                
                swicth(view v){
                case R.id.signup_button:  
                Intent intent = new Intent(getApplicationContext(), Signup.class);
                startActivity(intent);
                break;
                case R.id.logRin_button:
                 break;
                    case R.id.send_password:
                    Intent intent = new Intent(getApplicationContext(), forgetpassword.class);
                startActivity(intent);
            }
         
        };
        
      

    }
}
