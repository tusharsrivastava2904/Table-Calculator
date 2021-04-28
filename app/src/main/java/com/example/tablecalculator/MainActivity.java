package com.example.tablecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.find);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        getSupportActionBar().hide();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int num = Integer.parseInt(s);
                StringBuffer sb = new StringBuffer();
                int ans;

                for(int i=1; i<=10; i++){
                    ans = i*num;
                    sb.append(num).append(" x ").append(i).append(" = ").append(ans).append("\n");
                }
                textView.setText(sb);
            }
        });
    }
}