package dsa.app1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        result = findViewById(R.id.result);

        String input = getIntent().getStringExtra("input");
        if (input != null) {
            result.setText("Input is: "+input +"\r\nPress Ok to return to Activity1");
        } else {
            result.setText("No input from Activity1 \r\nPress Ok to return to Activity1");
        }
    }

    public void onClick(View view) {
        finish();
    }
}