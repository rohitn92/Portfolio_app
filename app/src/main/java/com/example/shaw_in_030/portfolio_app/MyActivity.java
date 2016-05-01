package com.example.shaw_in_030.portfolio_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    /** Called when the user clicks the Send button */
    public void showToast(View view) {
        // Do something in response to button

        Button btn = (Button)view;

        Toast.makeText(getApplicationContext(), btn.getText().toString(), Toast.LENGTH_SHORT).show();


    }
}
