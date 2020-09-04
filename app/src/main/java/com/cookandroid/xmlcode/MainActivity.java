package com.cookandroid.xmlcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

//    TextView tv;
//    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tv = (TextView)findViewById(R.id.textView);
//        et = (EditText)findViewById(R.id.editText);
//        Button button1 = (Button)findViewById(R.id.button1);
//        Button button2 = (Button)findViewById(R.id.button2);
//        Button button3 = (Button)findViewById(R.id.button3);
//        Button button4 = (Button)findViewById(R.id.button4);
//        Button button5 = (Button)findViewById(R.id.button5);

//        TextView textView1 = (TextView)findViewById(R.id.textView1);
//        TextView textView2 = (TextView)findViewById(R.id.textView2);
//        TextView textView3 = (TextView)findViewById(R.id.textView3);
//        TextView textView4 = (TextView)findViewById(R.id.textView4);
//        TextView textView5 = (TextView)findViewById(R.id.textView5);
//
//        textView1.setText("안녕하세요?");
//        textView1.setTextColor(Color.RED);
//        textView2.setTextSize(30);
//        textView2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
//        textView3.setText("가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하");

        Switch switch1 = (Switch)findViewById(R.id.switch1);
        Switch switch2 = (Switch)findViewById(R.id.switch2);
        ToggleButton toggleBtn1 = (ToggleButton)findViewById(R.id.toggleBtn1);
        ToggleButton toggleBtn2 = (ToggleButton)findViewById(R.id.toggleBtn2);
    }

}