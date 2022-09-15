package ca.csf.tp1.views;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ca.csf.tp1.R;

public class MainActivity extends AppCompatActivity{
    Button buttons[] = new Button[26];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 26; i++) {
            int id = getResources().getIdentifier("button" + (char) ('A' + i), "id", getPackageName());
            Button btn = findViewById(id);
            if (null != btn) {
                btn.setOnClickListener(this::onClickLetter);
                buttons[i] = btn;
            }
        }
    }
    private void onClickLetter(View v) {
        // A COMPLETER
        Button b = (Button)v;
        String text = b.getText().toString();
        // Ici le premier caractère de text contient la lettre
        // qui vient d'être jouée
    }
}