package dsa.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        result = findViewById(R.id.result);
        result.setText("Press Ok to launch Activity2");

    }

    public void onClick(View view) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}