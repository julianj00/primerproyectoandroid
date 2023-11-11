package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private RadioButton r1,r2,r3;
    private CheckBox c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (EditText) findViewById(R.id.cuadrotexto);

        r1 = (RadioButton)  findViewById(R.id.radio1);
        r2 = (RadioButton)  findViewById(R.id.radio2);
        r3 = (RadioButton)  findViewById(R.id.radio3);

        c1 = (CheckBox)  findViewById(R.id.check1);
        c2 = (CheckBox)  findViewById(R.id.check2);
        c3 = (CheckBox)  findViewById(R.id.check3);
    }
    public void color(View view){
        if(r1.isChecked()){
            texto.setTextColor(Color.parseColor("#FFFF33"));

        }else if(r2.isChecked()){
            texto.setTextColor(Color.parseColor("#FF3333"));


        }else if(r3.isChecked()){
            texto.setTextColor(Color.parseColor("#333CFF"));


        }
    }
    public void letra(View view){
        if(c1.isChecked()){
            Typeface letra = Typeface.createFromAsset(this.getAssets(),"assents/font/jarohy.otf");
            texto.setTypeface(letra);

        }else if(c2.isChecked()){
            Typeface letra = Typeface.createFromAsset(this.getAssets(),"assents/font/kohirug.otf");
            texto.setTypeface(letra);

        }else if(c3.isChecked()){
            Typeface letra = Typeface.createFromAsset(this.getAssets(),"font/qiduwy.otf");
            texto.setTypeface(letra);

        }



        }
    }
