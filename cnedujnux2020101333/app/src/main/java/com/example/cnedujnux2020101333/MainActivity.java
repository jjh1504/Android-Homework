package com.example.cnedujnux2020101333;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttoncalculate = this.findViewById(R.id.button);
        EditText editText = this.findViewById(R.id.edittext_score);
        TextView textView = this.findViewById(R.id.textview_score);
        buttoncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores = editText.getText().toString();
                String []arrayscore = scores.split(",");
                BowLingGame game =new BowLingGame();
                for (int i=0;i<arrayscore.length;i++)
                {
                    game.roll(Integer.parseInt(arrayscore[i]));
                }
                textView.setText("Total Scores"+game.score());
            }
        });

    }
}