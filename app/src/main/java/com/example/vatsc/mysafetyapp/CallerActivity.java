//package com.example.vatsc.mysafetyapp;
//
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.net.Uri;
//import android.support.v4.app.ActivityCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class CallerActivity extends AppCompatActivity
//{
//    EditText et1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_caller);
//        et1=findViewById(R.id.ptCaller);
//    }
//
////    public void funClick(View view)
////   {
////        Toast.makeText(getApplicationContext(),"STARTING TO CALL....",Toast.LENGTH_SHORT).show();
////        String number = et1.getText().toString();
////        Intent callintent = new Intent(Intent.ACTION_CALL);
////        callintent.setData(Uri.parse("TEL No: "+number));
////
////        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
////        {
////            Toast.makeText(getApplicationContext(),"COULD NOT GRANT PERMISSION",Toast.LENGTH_SHORT).show();
////            return;
////        }
////        startActivity(callintent);
////   }
//
//
//
//    public void goBack(View view)
//    {
//        Intent intent=new Intent(this,EmergencyActivity.class);
//        startActivity(intent);
//    }
//}
