package com.kiarra.showcheckboxtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{


private Button showToastButton;
    private CheckBox chocSyrupBox;
    private CheckBox sprinklesBox;
    private CheckBox crushedNutsBox;
    private CheckBox cherriesBox;
    private CheckBox oreoCookiesBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chocSyrupBox = (CheckBox) findViewById(R.id.chocolatesyrup);
        sprinklesBox = (CheckBox) findViewById(R.id.sprinkles);
        crushedNutsBox = findViewById(R.id.crushedNuts);
        cherriesBox = findViewById(R.id.cherries);
        oreoCookiesBox = findViewById(R.id.oreoCookie);
        showToastButton = findViewById(R.id.show_toast_button);

    }

    public void onBoxChecked(View view){

        String msg = "";

        if(chocSyrupBox.isChecked())
            msg = msg + " Chocolate syrup ";
        if(sprinklesBox.isChecked())
            msg = msg + " Sprinkles ";
        if(crushedNutsBox.isChecked())
            msg = msg + " Crushed Nuts ";
        if(cherriesBox.isChecked())
            msg = msg + " Cherries ";
        if(oreoCookiesBox.isChecked())
            msg = msg + " Oreo cookie crumbles ";

        Toast.makeText(this, "Toppings:" + msg, Toast.LENGTH_SHORT).show();


    }

}
