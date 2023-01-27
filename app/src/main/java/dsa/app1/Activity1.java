package dsa.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView result;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);
        result.setText("Press Ok to launch Activity2");
    }

    public void onClick(View view) {
        Intent i = new Intent(this, Activity2.class);
        String data = input.getText().toString();
        i.putExtra("input",data);
        //startActivity(i);
        startActivityForResult(i, Activity2.REQUEST_CODE_1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Activity2.REQUEST_CODE_1 && resultCode == RESULT_OK && data != null) {
            String input2 = data.getStringExtra("input2");
            result.setText("Result from Activity2 is: "+input2);
        } else {
            result.setText("Activity result received but not correct!");
        }
    }
}