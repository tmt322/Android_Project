package com.example.triet.hello_from_me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.myColor));

            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(inputText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Android is Awesome");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(inputText); }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.originalText));

                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));

                ((TextView) findViewById(R.id.textView)).setText("Hello from Tony");
            }
        });

        //get user input
        //put the input in text view
        //change text accordingly

    }
}
