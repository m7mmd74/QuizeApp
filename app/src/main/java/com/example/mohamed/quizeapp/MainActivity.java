package com.example.mohamed.quizeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Global strings for the results summary listing
     */
    String question1Results;
    String question2Results;
    String question3Results;
    String question4Results;
    String question5Results;
    String question6Results;
    String question7Results;
    String question8Results;
    String question9Results;
    String question10Results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the score as a toast
     */

    public void displayScore(View view) {
        int score = calculateScore();
        String scoreMessage = getString(R.string.final_Score, score);
        scoreMessage += "\n" + question1Results;
        scoreMessage += "\n" + question2Results;
        scoreMessage += "\n" + question3Results;
        scoreMessage += "\n" + question4Results;
        scoreMessage += "\n" + question5Results;
        scoreMessage += "\n" + question6Results;
        scoreMessage += "\n" + question7Results;
        scoreMessage += "\n" + question8Results;
        scoreMessage += "\n" + question9Results;
        scoreMessage += "\n" + question10Results;

        Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();

    }

    /**
     * Calculates total questions answered correctly
     *
     * @return score
     */

    public int calculateScore() {
        int score = 0;

        //Checks if question one is answered correctly

        RadioButton radioOne = (RadioButton) findViewById(R.id.question_One_Second_Ans);
        boolean answerQuestionOne = radioOne.isChecked();

        if (answerQuestionOne) {
            score++;
            question1Results = getString(R.string.questionOneIsCorrect);
        } else {
            question1Results = getString(R.string.questionOneIsWrong);
        }

        //Checks if question two is answered correctly

        CheckBox firstCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_First_Ans);
        boolean firstChoiceQuestionTwo = firstCheckBoxQuestionTwo.isChecked();

        CheckBox secondCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Second_Ans);
        boolean secondChoiceQuestionTwo = secondCheckBoxQuestionTwo.isChecked();

        CheckBox thirdCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Third_Ans);
        boolean thirdChoiceQuestionTwo = thirdCheckBoxQuestionTwo.isChecked();

        CheckBox fourthCheckBoxQuestionTwo = (CheckBox) findViewById(R.id.question_Two_Fourth_Ans);
        boolean fourthChoiceQuestionTwo = fourthCheckBoxQuestionTwo.isChecked();

        if (!firstChoiceQuestionTwo && secondChoiceQuestionTwo && !thirdChoiceQuestionTwo && fourthChoiceQuestionTwo) {
            score++;
            question2Results = getString(R.string.questionTwoIsCorrect);
        } else {
            question2Results = getString(R.string.questionTwoIsWrong);
        }

        //Checks if question three is answered correctly

        RadioButton radioThree = (RadioButton) findViewById(R.id.question_Three_Fourth_Ans);
        boolean answerQuestionThree = radioThree.isChecked();

        if (answerQuestionThree) {
            score++;
            question3Results = getString(R.string.questionThreeIsCorrect);
        } else {
            question3Results = getString(R.string.questionThreeIsWrong);
        }
        //Checks if question four is answered correctly

        RadioButton radioFour = (RadioButton) findViewById(R.id.question_Four_First_Ans);
        boolean answerQuestionFour = radioFour.isChecked();

        if (answerQuestionFour) {
            score++;
            question4Results = getString(R.string.questionFourIsCorrect);
        } else {
            question4Results = getString(R.string.questionFourIsWrong);
        }

        //Checks if question five is answered correctly

        RadioButton radioFive = (RadioButton) findViewById(R.id.question_Five_Second_Ans);
        boolean answerQuestionFive = radioFive.isChecked();

        if (answerQuestionFive) {
            score++;
            question5Results = getString(R.string.questionFiveIsCorrect);
        } else {
            question5Results = getString(R.string.questionFiveIsWrong);
        }

        //Checks if question six is answered correctly

        RadioButton radioSix = (RadioButton) findViewById(R.id.question_Six_First_Ans);
        boolean answerQuestionSix = radioSix.isChecked();

        if (answerQuestionSix) {
            score++;
            question6Results = getString(R.string.questionSixIsCorrect);
        } else {
            question6Results = getString(R.string.questionSixIsWrong);
        }

        //Checks if question seven is answered correctly

        CheckBox firstCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_First_Ans);
        boolean firstChoiceQuestionSeven = firstCheckBoxQuestionSeven.isChecked();

        CheckBox secondCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_Second_Ans);
        boolean secondChoiceQuestionSeven = secondCheckBoxQuestionSeven.isChecked();

        CheckBox thirdCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_Third_Ans);
        boolean thirdChoiceQuestionSeven = thirdCheckBoxQuestionSeven.isChecked();

        CheckBox fourthCheckBoxQuestionSeven = (CheckBox) findViewById(R.id.question_Seven_Fourth_Ans);
        boolean fourthChoiceQuestionSeven = fourthCheckBoxQuestionSeven.isChecked();

        if (!firstChoiceQuestionSeven && !secondChoiceQuestionSeven && thirdChoiceQuestionSeven && fourthChoiceQuestionSeven) {
            score++;
            question7Results = getString(R.string.questionSevenIsCorrect);
        } else {
            question7Results = getString(R.string.questionSevenIsWrong);
        }

        //Checks if question eight is answered correctly

        EditText answer = (EditText) findViewById(R.id.question_Eight);
        String userInput = answer.getText().toString();

        if (userInput.equalsIgnoreCase("memphis")) {

            score++;
            question8Results = getString(R.string.questionEightIsCorrect);
        } else {
            question8Results = getString(R.string.questionEightIsWrong);
        }

        //Checks if question nine is answered correctly

        RadioButton radioNine = (RadioButton) findViewById(R.id.question_Nine_First_Ans);
        boolean answerQuestionNine = radioNine.isChecked();

        if (answerQuestionNine) {
            score++;
            question9Results = getString(R.string.questionNineIsCorrect);
        } else {
            question9Results = getString(R.string.questionNineIsWrong);
        }

        //Checks if question ten is answered correctly

        RadioButton radioTen = (RadioButton) findViewById(R.id.question_Ten_Second_Ans);
        boolean answerQuestionTen = radioTen.isChecked();

        if (answerQuestionTen) {
            score++;
            question10Results = getString(R.string.questionTenIsCorrect);
        } else {
            question10Results = getString(R.string.questionTenIsWrong);
        }

        return score;

    }

}
