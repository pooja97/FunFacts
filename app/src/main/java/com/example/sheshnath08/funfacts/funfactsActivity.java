package com.example.sheshnath08.funfacts;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;



public class funfactsActivity extends AppCompatActivity {

    FactBook mFactBook = new FactBook();
    ColorWheel mColorWheel = new ColorWheel();
    Button factbutton;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfacts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toast.makeText(this, "Welcome to Fun Facts", Toast.LENGTH_LONG).show();

    }

    public void factevent(View view) {
        final TextView FactLabel = (TextView) findViewById(R.id.FactTextView);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        factbutton = (Button) findViewById(R.id.ShowFactButton);
        factbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facts = mFactBook.getFact();
                FactLabel.setText(facts);
                int colors = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(colors);
                factbutton.setTextColor(colors);
            }
        });

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
