package com.example.nishio.hellosample;

import
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_sample);
        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);
        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);
    }
 private class  HelloListener implements  View.OnClickListener {

     @Override
     public void onClick(View view){
         EditText input = findViewById(R.id.etName);
         TextView output = findViewById(R.id.tvOutput);
         String inputstr = input.getText().toString();
         int id = view.getId();
         switch (id){
             case R.id.btClick:
                 String inputStr = input.getText().toString();
                 output.setText(inputStr+"さんこんにちは！");
                 break;

             case R.id.btClear:
                 input.setText("");
                 output.setText("");
                 break;
         }
     }
 }

}
