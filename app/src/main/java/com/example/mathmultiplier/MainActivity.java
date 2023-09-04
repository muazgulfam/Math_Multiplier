package com.example.mathmultiplier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextNumber;
    private TextView textView,
            textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Generating the multiplication Table", Toast.LENGTH_SHORT).show();
                String s =editTextNumber.getText().toString();
                int tableNum =Integer.parseInt(s);
                int num = 1;
                int tableNum1 = tableNum * num;
                textView3.setText(tableNum + "    X    " + num + "    =    " + tableNum1);
                num++;
                int tableNum2 = tableNum * num;
                textView4.setText(tableNum + "    X    " + num + "    =    " + tableNum2);
                num++;
                int tableNum3 = tableNum * num;
                textView5.setText(tableNum + "    X    " + num + "    =    " + tableNum3);
                num++;
                int tableNum4 = tableNum * num;
                textView6.setText(tableNum + "    X    " + num + "    =    " + tableNum4);
                num++;
                int tableNum5 = tableNum * num;
                textView7.setText(tableNum + "    X    " + num + "    =    " + tableNum5);
                num++;
                int tableNum6 = tableNum * num;
                textView8.setText(tableNum + "    X    " + num + "    =    " + tableNum6);
                num++;
                int tableNum7 = tableNum * num;
                textView9.setText(tableNum + "    X    " + num + "    =    " + tableNum7);
                num++;
                int tableNum8 = tableNum * num;
                textView10.setText(tableNum + "    X    " + num + "    =    " + tableNum8);
                num++;
                int tableNum9 = tableNum * num;
                textView11.setText(tableNum + "    X    " + num + "    =    " + tableNum9);
                num++;
                int tableNum10 = tableNum * num;
                textView12.setText(tableNum + "    X    " + num + "    =    " + tableNum10);


            }
        });
    }
}