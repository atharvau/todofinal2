package com.example.atharva.todofinal2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
public static String name;
public  static Boolean everyday=false;
public static int hour;
public static int min;
public static Boolean alarm=false;
EditText editname;
CheckBox c;
Button setTime;
    Button Next;

CheckBox c2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        editname = findViewById(R.id.editname);
        c = findViewById(R.id.checkeveryday);
        c2=findViewById(R.id.checkBox4);
                name = editname.getText().toString();
        setTime=findViewById(R.id.button16);
Next=findViewById(R.id.button);
        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (c.isChecked()) {
                    everyday = true;
                }
            }
        });

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (c.isChecked()) {
                    alarm = true;
                }
            }
        });







Next.setText(""+name+alarm+everyday);





    }
}
