package com.example.renan.recognapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.vision.CameraSource;

public class MainActivity extends AppCompatActivity {

    private CameraSource mCameraSource=null;
    private static final int RC_HANDLE_GMS = 9001;
    private static final int RC_HANDLE_CAMERA_PERM = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tirarFoto(View view){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }
}
