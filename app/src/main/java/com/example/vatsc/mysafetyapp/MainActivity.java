package com.example.vatsc.mysafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.etEmail);
        et4=(EditText)findViewById(R.id.etfather);
        et3=(EditText)findViewById(R.id.etmother);
        et2=(EditText)findViewById(R.id.etPass);
        et5=(EditText)findViewById(R.id.etBrother);
    }

       public void onClickRegister(View view)

    {
        Intent intent=new Intent(this,EmergencyActivity.class);
        //EditText et1=(EditText)findViewById(R.id.etfather);
        String mssg=et4.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,mssg);
        startActivity(intent);
    }
}
