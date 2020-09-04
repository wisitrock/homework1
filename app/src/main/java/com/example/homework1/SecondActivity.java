package com.example.homework1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView IdNumber = findViewById(R.id.idTextNumber);
                String numText = IdNumber.getText().toString();

                if (numText.length() == 13) {
                    Log.i("SecondActivity","idnum : "+numText.length());
                    AlertDialog.Builder dialog = new AlertDialog.Builder(SecondActivity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK", null);
                    if (numText.equals("1111111111111") || numText.equals("2222222222222")) {
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    } else {
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    }

                        dialog.show();

                } else {
                    Toast t = Toast.makeText(
                            SecondActivity.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก"
                            , Toast.LENGTH_LONG
                    );
                    t.show();

                }
            }
        });

    }
}