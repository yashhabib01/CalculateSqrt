 package com.example.calculatesqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

    private EditText sqrt_num;
    private Button sqrt_btn  ,clear_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqrt_btn = (Button) findViewById(R.id.sqrt_button);
        clear_text = (Button)findViewById(R.id.text_clear);
        sqrt_num = (EditText) findViewById(R.id.sqrt_num);

        sqrt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(sqrt_num.getText().toString())  &&
                        sqrt_num.getText().toString().matches("\\d+(?:\\.\\d+)?")){
                  double sqrt = Double.parseDouble(sqrt_num.getText().toString());
                    sqrt_num.setText( "" + Math.sqrt(sqrt));

                }
            }
        });

        clear_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqrt_num.setText("");
            }
        });



    }
}