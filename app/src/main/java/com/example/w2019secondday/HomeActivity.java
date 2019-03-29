package com.example.w2019secondday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null)
        {
            String name = mBundle.getString("name");
            Toast.makeText(this,name,Toast.LENGTH_LONG).show();
        }


    }
}
