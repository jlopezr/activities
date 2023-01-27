package dsa.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    public static int REQUEST_CODE_1 = 1;

    TextView result;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);

        String input = getIntent().getStringExtra("input");
        if (input != null) {
            result.setText("I'm Activity 3\r\nInput is: "+input +"\r\nPress Ok to return to Activity1");
        } else {
            result.setText("No input from Activity1 \r\nPress Ok to return to Activity1");
        }
    }

    public void onClick(View view) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("input2", input.getText().toString());
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }
}