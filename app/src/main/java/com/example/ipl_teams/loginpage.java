package com.example.ipl_teams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        EditText edtUser = (EditText) findViewById(R.id.userNameId);
        EditText edtPass = (EditText) findViewById(R.id.userPassId);
        EditText edtPhone = (EditText) findViewById(R.id.userNumberId);


        TextView btnSubmit = (TextView) findViewById(R.id.SubmitBtn);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtUser.getText().toString().equals("") || edtPass.getText().toString().equals("") || edtPhone.getText().toString().equals("")){
                    Toast.makeText(loginpage.this,"Fill The Entries",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(loginpage.this,MainPage.class);
                    startActivity(intent);
                }
            }
        });
    }
}