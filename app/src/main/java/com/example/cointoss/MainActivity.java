package com.example.cointoss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int Toss (){
        Random coin = new Random();
        int toss=Math.abs(coin.nextInt())%2;
        return toss;
    }

    public String risultato(int tailCross){
        if(Toss()==1)
            return "Tail";
        else
            return "Head";

    }

    public void displayResult(String result){
        TextView apparire = findViewById(R.id.textView_result);
        apparire.setText(result);
    }
    public void faiLeggere(View v){
        String mioMessaggio = risultato(Toss());
        displayResult(mioMessaggio);
    }
}

