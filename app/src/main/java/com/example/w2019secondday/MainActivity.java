package com.example.w2019secondday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnSignin;
    private Button btnClear;
    private TextView lblmsg;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        lblmsg = findViewById(R.id.lblMessage);
        btnSignin = findViewById(R.id.btnSigin);
        btnClear = findViewById(R.id.btnClear);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String email = edtEmail.getText().toString();

                Toast.makeText( MainActivity.this,email,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
