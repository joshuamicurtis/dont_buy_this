package com.joshuamcurtis.dontbuythis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eText;
    Button buyButton;
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (EditText) findViewById(R.id.EditTextItem);
        buyButton = (Button) findViewById(R.id.Should_I_Buy_It_Button);
        displayText = (TextView) findViewById(R.id.displayText);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "Don't buy the ";
                str= str +eText.getText().toString();
                displayText.setText(str);
            }
        });
    }
}
