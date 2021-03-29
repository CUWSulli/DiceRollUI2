package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    private Button ZeroButton;
    private Button OneButton;
    private Button TwoButton;
    private Button ThreeButton;
    private Button FourButton;
    private Button FiveButton;
    private Button SixButton;
    private Button SevenButton;
    private Button EightButton;
    private Button NineButton;
    priavte TextView qtyTV;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.OneButton = this.findViewById(R.id.OneB);
        this.qtyTV = this.findViewById(R.id.qtyRV);
    }
    public void qtyButtonPressed(View v)
    {
        if(v == this.ZeroButton)
        {
            this.qtyTV.setText("0");
        }
        if(v == this.OneButton)
        {
            this.qtyTV.setText("1");
        }
        if(v == this.TwoButton)
        {
            this.qtyTV.setText("2");
        }
        if(v == this.ThreeButton)
        {
            this.qtyTV.setText("3");
        }
        if(v == this.FourButton)
        {
            this.qtyTV.setText("4");
        }
        if(v == this.FiveButton)
        {
            this.qtyTV.setText("5");
        }
        if(v == this.SixButton)
        {
            this.qtyTV.setText("6");
        }
        if(v == this.SevenButton)
        {
            this.qtyTV.setText("7");
        }
        if(v == this.EightButton)
        {
            this.qtyTV.setText("8");
        }
        if(v == this.NineButton)
        {
            this.qtyTV.setText("9");
        }
    }

}