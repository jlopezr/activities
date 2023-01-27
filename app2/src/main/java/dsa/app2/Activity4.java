package dsa.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Activity4 extends AppCompatActivity {

    public static int REQUEST_CODE_1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Random r = new Random();
        String result = ""+r.nextLong();

        Intent resultIntent = new Intent();
        resultIntent.putExtra("input2", result);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();

    }
}