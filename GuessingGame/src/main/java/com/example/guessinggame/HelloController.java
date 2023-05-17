package com.example.guessinggame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public int theNumber;


    @FXML
    private Button knpka;

    @FXML
    private Label lblOutput;

    @FXML
    private TextField txtGuess;

    @FXML
    private Button playAgainButton;

    @FXML
    public  void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
        lblOutput.setText("Сыграем еще раз. Ввдите число выше и нажмите \"Guess\"");

    }
    @FXML
    public void CheckGuess() {



        String guessText = txtGuess.getText();

        String message = "";

        int guess = Integer.parseInt(guessText);

        if (guess < theNumber)
            message = guess + " мало. Нужно больше.";
        else if (guess > theNumber)
            message = guess + " много. Нужно меньше.";
        else
            message = guess + " верное число!!!";

        lblOutput.setText(message);

        }




}