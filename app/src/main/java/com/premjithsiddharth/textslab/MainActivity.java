package com.premjithsiddharth.textslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button main_b;
    TextView main_txt;
    EditText change_txt;
    Button cycler_b;
    TextView cycler_txt;
    Resources res;
    String[] messages;
    String text_1;
    String text_2;
    int cycle;
    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_b = findViewById(R.id.beauton);
        main_txt = findViewById(R.id.main_text);
        change_txt = findViewById(R.id.edit_text);
        cycler_b = findViewById(R.id.cycler);
        cycler_txt = findViewById(R.id.message);
        res = getResources();
        messages = res.getStringArray(R.array.string_array);
        text_1 = res.getString(R.string.text_content1);
        text_2 = res.getString(R.string.text_content2);
        cycle = 0;
        total = messages.length;
        main_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_txt.setText(text_1 + change_txt.getText() + text_2);
            }
        });
        cycler_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cycle++;
                if(cycle == messages.length){
                    cycle = 0;
                }
                cycler_txt.setText(messages[cycle]);
            }
        })
    }
}
