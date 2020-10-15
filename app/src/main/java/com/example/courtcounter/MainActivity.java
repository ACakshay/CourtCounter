package com.example.courtcounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scorea = 0, scoreb = 0;
    public void aplus3(View view){
        scorea += 3;
        displaya();
    }
    public void aplus2(View view){
        scorea += 2;
        displaya();
    }
    public void aplus1(View view){
        scorea += 1;
        displaya();
    }
    public void bplus3(View view){
        scoreb += 3;
        displayb();
    }
    public void bplus2(View view){
        scoreb += 2;
        displayb();
    }
    public void bplus1(View view){
        scoreb += 1;
        displayb();
    }
    public void displaya() {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + scorea);
    }
    public void displayb() {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + scoreb);
    }
    public void reset(View view) {
        scorea = 0;
        scoreb = 0;
        TextView quantityTextViewa = (TextView) findViewById(R.id.team_a_score);
        quantityTextViewa.setText("" + 0);
        TextView quantityTextViewb = (TextView) findViewById(R.id.team_b_score);
        quantityTextViewb.setText("" + 0);
    }


}