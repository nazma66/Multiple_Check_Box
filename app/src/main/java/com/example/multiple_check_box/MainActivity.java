package com.example.multiple_check_box;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox, checkBox2, checkBox3, checkBox4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isPadmaSelected = checkBox.isChecked();
                boolean isJamunaSelected = checkBox2.isChecked();
                boolean isPacificSelected = checkBox3.isChecked();
                boolean isAtlanticSelected = checkBox4.isChecked();

                String result;
                if (isPadmaSelected && isJamunaSelected && !isPacificSelected && !isAtlanticSelected) {
                    result = "Right Answer";
                } else {
                    result = "Wrong Answer";
                }

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}
