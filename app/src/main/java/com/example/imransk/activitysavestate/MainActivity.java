package com.example.imransk.activitysavestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int counter=0;;
    TextView count;
    Button incerement;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("counter",counter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = (TextView) findViewById(R.id.count);
        incerement = (Button) findViewById(R.id.button);
        incerement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                count.setText(String.valueOf(counter).toString());
            }
        });
        if(savedInstanceState!=null){
            counter = savedInstanceState.getInt("counter");
        }
    }
}
