package com.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {

    private TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);


        Bundle bundle = getIntent().getExtras();

        if (bundle!= null) {
            String capital = bundle.getString("capital");
            textView = findViewById(R.id.txtView);
            textView.setText(capital);
        }

        else

        {
            Toast.makeText(this, "No capital", Toast.LENGTH_SHORT).show();
        }


    }
}
