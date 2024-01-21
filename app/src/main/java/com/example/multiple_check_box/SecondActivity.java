package com.example.multiple_check_box;





import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1 = findViewById(R.id.et1);

        // Retrieve values from intent
        String result = getIntent().getStringExtra("result");

        // Set the result to the EditText
        et1.setText(result);
    }
}

