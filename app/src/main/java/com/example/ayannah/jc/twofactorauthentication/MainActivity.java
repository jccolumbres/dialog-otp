package com.example.ayannah.jc.twofactorauthentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CustomDialog customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void getCodeButtonClick(View view) {

        customDialog = new CustomDialog(this);
        customDialog.show();
    }
}
