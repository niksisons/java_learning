package com.example.guessinggame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GuessingGame extends AppCompatActivity {

    int inputI;
    int count = 1;
    int randomInt;
    private EditText txtInput;

    private Button Button;
    
    private Button ButtonAgain;

    private TextView lb_2;


    public void NewGame() {
        Random rand = new Random();
        randomInt = rand.nextInt(100) + 1;
    }

    public void Check() {
        try {
            inputI = Integer.parseInt(txtInput.getText().toString());
            if (inputI == randomInt) {
                lb_2.setText("You guessed it!  You win after " + count + " tries!");
                Button.setVisibility(View.INVISIBLE); //#GONE
//                Button.setEnabled(false);
                ButtonAgain.setVisibility(View.VISIBLE);
            } else if (inputI < randomInt)
                lb_2.setText("The number is higher.");
            else
                lb_2.setText("The number is lower.");

        } catch (Exception e) {
            lb_2.setText("Enter a whole number between 1 and 100.");
        } finally {
            txtInput.setText("");
//          txtInput.requestFocus();
//          txtInput.selectAll();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        txtInput = findViewById(R.id.editText);
        Button= findViewById(R.id.button);
        ButtonAgain= findViewById(R.id.PlayAgain);
        lb_2= findViewById(R.id.textView3);
        NewGame();
        Button.setOnClickListener(v -> {
            Check();
            count++;
        });
        ButtonAgain.setVisibility(View.INVISIBLE);
        ButtonAgain.setOnClickListener(v ->
        {
            NewGame();
            count = 1;
            ButtonAgain.setVisibility(View.INVISIBLE);
            Button.setVisibility(View.VISIBLE);
            lb_2.setText("Enter a whole number between 1 and 100.");
        });
        txtInput.setOnEditorActionListener((v, actionId, event) ->
        {
            Check();
            count++;
            return true;
        });

    }
}
