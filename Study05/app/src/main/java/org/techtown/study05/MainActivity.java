package org.techtown.study05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    EditText input3;
    Button saveButton;
    Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        saveButton = findViewById(R.id.saveButton);
        closeButton = findViewById(R.id.closeButton);

        /*String name = input1.getText().toString();
        String age = input2.getText().toString();
        String place = input3.getText().toString();*/

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = input1.getText().toString();
                String age = input2.getText().toString();
                String place = input3.getText().toString();
                Toast.makeText(getApplicationContext(), "입력된 값: " +name+ ", " +age+ ", " + place,
                        Toast.LENGTH_LONG).show();
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}