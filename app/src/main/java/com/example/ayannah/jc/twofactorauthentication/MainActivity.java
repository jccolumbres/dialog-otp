package com.example.ayannah.jc.twofactorauthentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements GenerateCode {
    CustomDialog customDialog;
    SecurityCode code = new SecurityCode();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getCodeButtonClick(View view) {
        if (code.getCode() == null) {
            generateRandomNum();
            Intent intent = new Intent(this,OTPActivity.class);
            intent.putExtra("CODEX",code);
            startActivity(intent);
            Log.i("Security Code MAIN: ", code.getCode());
        } else {
            Log.i("Security Code MAIN: ", code.getCode());
        }
    }


    @Override
    public void generateRandomNum() {

        code.setCodeInt((int) (Math.random() * 99999));
        code.setCode(Integer.toString(code.getCodeInt()));
    }
}
