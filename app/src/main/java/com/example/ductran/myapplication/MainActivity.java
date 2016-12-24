package com.example.ductran.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Pattern;

public class MainActivity extends Activity {
    Players[] playerList = new Players[2];

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variable IDENTIFICATION:
        // Get BUTTONS:
        final Button Reg_button = (Button)findViewById(R.id.ButtonRegister);
        final Button Q1_button = (Button)findViewById(R.id.ButtonQ1);
        final Button Q2_button = (Button)findViewById(R.id.ButtonQ2);
        final Button Q3_button = (Button)findViewById(R.id.ButtonQ3);
        final Button Q4_button = (Button)findViewById(R.id.ButtonQ4);
        final Button Q5_button = (Button)findViewById(R.id.ButtonQ5);
        final Button A_button = (Button)findViewById(R.id.buttonA);
        final Button B_button = (Button)findViewById(R.id.buttonB);
        final Button C_button = (Button)findViewById(R.id.buttonC);
        final Button Score_button = (Button)findViewById(R.id.buttonScore);
        final Button Single_button = (Button) findViewById(R.id.SingleButton);
        final Button Multiple_button = (Button) findViewById(R.id.MultiplayerButton);
        final Button Start_button = (Button) findViewById(R.id.StartButton);
        final Button Skip_button = (Button) findViewById(R.id.SkipButton);
        final Button Hint_button = (Button) findViewById(R.id.HintButton);
        final Button NextPlayer_button = (Button) findViewById(R.id.NextPlayerButton);

        // Get EDIT TEXTS:
        final EditText txtname = (EditText) findViewById(R.id.NameEditText);

        // Get TEXT VIEWS:
        final TextView name_tit = (TextView) findViewById(R.id.TextViewNameTit);
        final TextView hello = (TextView) findViewById(R.id.TextViewWelcome);
        final TextView question_txt = (TextView)findViewById(R.id.QuestionTextView);
        final TextView sol_txt = (TextView)findViewById(R.id.textViewSolution);
        final TextView score_txt = (TextView)findViewById(R.id.textViewScore);
        final TextView low_txt = (TextView)findViewById(R.id.textViewLow);
        final TextView high_txt = (TextView)findViewById(R.id.textViewHigh);
        final TextView notice_txt = (TextView)findViewById(R.id.textViewNotice);

        // INITIAL VALUE SET
        notice_txt.setVisibility(View.INVISIBLE);
        Score_button.setVisibility(View.INVISIBLE);
        Q1_button.setVisibility(View.INVISIBLE);
        Q2_button.setVisibility(View.INVISIBLE);
        Q3_button.setVisibility(View.INVISIBLE);
        Q4_button.setVisibility(View.INVISIBLE);
        Q5_button.setVisibility(View.INVISIBLE);
        A_button.setVisibility(View.INVISIBLE);
        B_button.setVisibility(View.INVISIBLE);
        C_button.setVisibility(View.INVISIBLE);
        question_txt.setVisibility(View.INVISIBLE);
        sol_txt.setVisibility(View.INVISIBLE);
        score_txt.setVisibility(View.INVISIBLE);
        Start_button.setVisibility(View.INVISIBLE);
        Reg_button.setVisibility(View.INVISIBLE);
        NextPlayer_button.setVisibility(View.INVISIBLE);
        txtname.setVisibility(View.INVISIBLE);
        high_txt.setVisibility(View.INVISIBLE);
        low_txt.setVisibility(View.INVISIBLE);
        name_tit.setVisibility(View.INVISIBLE);
        Hint_button.setVisibility(View.INVISIBLE);
        Skip_button.setVisibility(View.INVISIBLE);

        //Single button clicked
        Single_button.setOnClickListener
                (
                        new Button.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // Make unecessary things INVISIBLE
                                Single_button.setVisibility(View.INVISIBLE);
                                Multiple_button.setVisibility(View.INVISIBLE);

                                // Make necessary things VISIBLE
                                Reg_button.setVisibility(View.VISIBLE);
                                name_tit.setVisibility(View.VISIBLE);
                                txtname.setVisibility(View.VISIBLE);
                                PlayerNo(0, false, false);
                            }
                        }
                );
        //Multiple_buton clicked
        Multiple_button.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Make unecessary things INVISIBLE
                        Single_button.setVisibility(View.INVISIBLE);
                        Multiple_button.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        Reg_button.setVisibility(View.VISIBLE);
                        name_tit.setVisibility(View.VISIBLE);
                        txtname.setVisibility(View.VISIBLE);

                        PlayerNo(0, true, false);
                    }
                }
        );


    }

    public void PlayerNo(int n, boolean c, boolean sc) {
        playerList[n] = new Players();
        Input(playerList[n], c, sc);
    }

    public boolean isAlpha(String name) {
        return Pattern.matches("[a-zA-Z]+", name);
    }

    public void Input(final Players aPlayer, final boolean c, final boolean sc)
    {
        // Get BUTTONS:
        final Button Score_button = (Button)findViewById(R.id.buttonScore);
        final Button Reg_button = (Button)findViewById(R.id.ButtonRegister);
        final Button Q1_button = (Button)findViewById(R.id.ButtonQ1);
        final Button Q2_button = (Button)findViewById(R.id.ButtonQ2);
        final Button Q3_button = (Button)findViewById(R.id.ButtonQ3);
        final Button Q4_button = (Button)findViewById(R.id.ButtonQ4);
        final Button Q5_button = (Button)findViewById(R.id.ButtonQ5);
        final Button A_button = (Button)findViewById(R.id.buttonA);
        final Button B_button = (Button)findViewById(R.id.buttonB);
        final Button C_button = (Button)findViewById(R.id.buttonC);
        final Button Start_button = (Button) findViewById(R.id.StartButton);
        final Button Skip_button = (Button) findViewById(R.id.SkipButton);
        final Button Hint_button = (Button) findViewById(R.id.HintButton);
        final Button NextPlayer_button = (Button) findViewById(R.id.NextPlayerButton);

        // Get EDIT TEXTS:
        final EditText txtname = (EditText) findViewById(R.id.NameEditText);

        // Get TEXT VIEWS:
        final TextView name_tit = (TextView) findViewById(R.id.TextViewNameTit);
        final TextView hello = (TextView) findViewById(R.id.TextViewWelcome);
        final TextView question_txt = (TextView) findViewById(R.id.QuestionTextView);
        final TextView sol_txt = (TextView)findViewById(R.id.textViewSolution);
        final TextView score_txt = (TextView)findViewById(R.id.textViewScore);
        final TextView low_txt = (TextView)findViewById(R.id.textViewLow);
        final TextView high_txt = (TextView)findViewById(R.id.textViewHigh);
        final TextView notice_txt = (TextView)findViewById(R.id.textViewNotice);

        // REG BUTTON - Set click
        Reg_button.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        // Get name from text field
                        String name = txtname.getText().toString();

                        // Check whether name is VALID
                        if (isAlpha(name))
                        {
                            notice_txt.setText("Click button below to Start your Quiz!");
                            notice_txt.setVisibility(View.VISIBLE);

                            hello.setText("Student: " + name);
                            aPlayer.setName(name);

                            // Make unecessary things INVISIBLE: EditText name, name title & Start button
                            txtname.setVisibility(View.INVISIBLE);
                            Reg_button.setVisibility(View.INVISIBLE);
                            name_tit.setVisibility(View.INVISIBLE);

                            //Make Start visible
                            Start_button.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                              notice_txt.setText("Name can only contain LETTERS in ALPHABETS! Re-enter your name.");
                              notice_txt.setVisibility(View.VISIBLE);
                        }
                                           }
                });

        // START BUTTON - Set click
        Start_button.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Make things INVISIBLE
                        notice_txt.setVisibility(View.INVISIBLE);
                        question_txt.setText("");
                        score_txt.setText("");
                        sol_txt.setText("");
                        Hint_button.setVisibility(View.INVISIBLE);
                        Skip_button.setVisibility(View.INVISIBLE);
                        A_button.setVisibility(View.INVISIBLE);
                        B_button.setVisibility(View.INVISIBLE);
                        C_button.setVisibility(View.INVISIBLE);
                        Start_button.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        if (aPlayer.get1())
                        Q1_button.setVisibility(View.VISIBLE);
                        if (aPlayer.get2())
                        Q2_button.setVisibility(View.VISIBLE);
                        if (aPlayer.get3())
                        Q3_button.setVisibility(View.VISIBLE);
                        if (aPlayer.get4())
                            Q4_button.setVisibility(View.VISIBLE);
                        if (aPlayer.get5())
                            Q5_button.setVisibility(View.VISIBLE);

                        // QUESTION SHOW UP
                        // QUESTION 1
                        Q1_button.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                    public void onClick(View view){
                                    //Hide question buttons
                                    Q1_button.setVisibility(View.INVISIBLE);
                                    Q2_button.setVisibility(View.INVISIBLE);
                                    Q3_button.setVisibility(View.INVISIBLE);
                                    Q4_button.setVisibility(View.INVISIBLE);
                                    Q5_button.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    question_txt.setText(Questions.ShowQuestion(1));
                                    question_txt.setVisibility(View.VISIBLE);
                                    A_button.setText(Questions.getA(1));
                                    B_button.setText(Questions.getB(1));
                                    C_button.setText(Questions.getC(1));
                                    A_button.setVisibility(View.VISIBLE);
                                    B_button.setVisibility(View.VISIBLE);
                                    C_button.setVisibility(View.VISIBLE);

                                    //Show hint and skip and question list
                                    Start_button.setVisibility(View.VISIBLE);
                                    Hint_button.setVisibility(View.VISIBLE);
                                    Skip_button.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    A_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER
                                    B_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    //Increase score
                                                    aPlayer.increaseScore();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    C_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    Hint_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getB(1));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    Skip_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set1();

                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 2
                        Q2_button.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    Q1_button.setVisibility(View.INVISIBLE);
                                    Q2_button.setVisibility(View.INVISIBLE);
                                    Q3_button.setVisibility(View.INVISIBLE);
                                    Q4_button.setVisibility(View.INVISIBLE);
                                    Q5_button.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(2);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    A_button.setText(Questions.getA(2));
                                    B_button.setText(Questions.getB(2));
                                    C_button.setText(Questions.getC(2));
                                    A_button.setVisibility(View.VISIBLE);
                                    B_button.setVisibility(View.VISIBLE);
                                    C_button.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    Start_button.setVisibility(View.VISIBLE);
                                    Hint_button.setVisibility(View.VISIBLE);
                                    Skip_button.setVisibility(View.VISIBLE);

                                    //RIGHT ANSWER
                                    A_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    //Increase score
                                                    aPlayer.increaseScore();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    B_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    C_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    Hint_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getA(2));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    Skip_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set2();
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 3
                        Q3_button.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    Q1_button.setVisibility(View.INVISIBLE);
                                    Q2_button.setVisibility(View.INVISIBLE);
                                    Q3_button.setVisibility(View.INVISIBLE);
                                    Q4_button.setVisibility(View.INVISIBLE);
                                    Q5_button.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(3);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    A_button.setText(Questions.getA(3));
                                    B_button.setText(Questions.getB(3));
                                    C_button.setText(Questions.getC(3));
                                    A_button.setVisibility(View.VISIBLE);
                                    B_button.setVisibility(View.VISIBLE);
                                    C_button.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    Start_button.setVisibility(View.VISIBLE);
                                    Hint_button.setVisibility(View.VISIBLE);
                                    Skip_button.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    A_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    B_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER
                                    C_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Increase score
                                                    aPlayer.increaseScore();
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    Hint_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getC(3));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    Skip_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set3();
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 4
                        Q4_button.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    Q1_button.setVisibility(View.INVISIBLE);
                                    Q2_button.setVisibility(View.INVISIBLE);
                                    Q3_button.setVisibility(View.INVISIBLE);
                                    Q4_button.setVisibility(View.INVISIBLE);
                                    Q5_button.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(4);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    A_button.setText(Questions.getA(4));
                                    B_button.setText(Questions.getB(4));
                                    C_button.setText(Questions.getC(4));
                                    A_button.setVisibility(View.VISIBLE);
                                    B_button.setVisibility(View.VISIBLE);
                                    C_button.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    Start_button.setVisibility(View.VISIBLE);
                                    Hint_button.setVisibility(View.VISIBLE);
                                    Skip_button.setVisibility(View.VISIBLE);

                                    //WRONG ANSWER
                                    A_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    B_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //RIGHT ANSWER
                                    C_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Increase score
                                                    aPlayer.increaseScore();
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    Hint_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getC(4));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    Skip_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set4();
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });
                        // QUESTION 5
                        Q5_button.setOnClickListener(
                                new Button.OnClickListener()
                                { @Override
                                public void onClick(View view){
                                    //Hide question buttons
                                    Q1_button.setVisibility(View.INVISIBLE);
                                    Q2_button.setVisibility(View.INVISIBLE);
                                    Q3_button.setVisibility(View.INVISIBLE);
                                    Q4_button.setVisibility(View.INVISIBLE);
                                    Q5_button.setVisibility(View.INVISIBLE);
                                    //Show question and answers
                                    String quest = Questions.ShowQuestion(5);
                                    question_txt.setText(quest);
                                    question_txt.setVisibility(View.VISIBLE);
                                    A_button.setText(Questions.getA(5));
                                    B_button.setText(Questions.getB(5));
                                    C_button.setText(Questions.getC(5));
                                    A_button.setVisibility(View.VISIBLE);
                                    B_button.setVisibility(View.VISIBLE);
                                    C_button.setVisibility(View.VISIBLE);
                                    //Show hint and skip and question list
                                    Start_button.setVisibility(View.VISIBLE);
                                    Hint_button.setVisibility(View.VISIBLE);
                                    Skip_button.setVisibility(View.VISIBLE);

                                    //RIGHT ANSWER
                                    A_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    //Increase score
                                                    aPlayer.increaseScore();
                                                    sol_txt.setText("Your answer is RIGHT! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    B_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    //WRONG ANSWER
                                    C_button.setOnClickListener(
                                            new Button.OnClickListener() {

                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    sol_txt.setText("Your answer is WRONG! Click below button to go back to question list.");
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // HINT BUTTON - Set click
                                    Hint_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    //Show answer
                                                    sol_txt.setText("The answer is: " + Questions.getA(5));
                                                    sol_txt.setVisibility(View.VISIBLE);
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                    // SKIP BUTTON - Set click
                                    Skip_button.setOnClickListener(
                                            new Button.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                    //Set answered
                                                    aPlayer.set5();
                                                    //Hide buttons
                                                    A_button.setVisibility(View.INVISIBLE);
                                                    B_button.setVisibility(View.INVISIBLE);
                                                    C_button.setVisibility(View.INVISIBLE);
                                                    Hint_button.setVisibility(View.INVISIBLE);
                                                    Skip_button.setVisibility(View.INVISIBLE);
                                                    //Show Start
                                                    Start_button.setVisibility(View.VISIBLE);
                                                }
                                            });
                                }


                                });

                        // SHOW RESULT
                        if (aPlayer.get1() == false && aPlayer.get2() == false && aPlayer.get3() == false && aPlayer.get4() == false && aPlayer.get5() == false)
                        {
                            score_txt.setText(aPlayer.getName() + "'s score is: " + aPlayer.getScore() + "/5");
                            Start_button.setText("You answered all the questions.");
                            score_txt.setVisibility(View.VISIBLE);

                            //SHOW NEXT PLAYER IF MULTI
                            if (c) {
                                NextPlayer_button.setVisibility(View.VISIBLE);
                                notice_txt.setText(aPlayer.getName() + " has answered all the questions, next player's turn.");
                                notice_txt.setVisibility(View.VISIBLE);
                            }

                            //SHOW REVIEW SCORE BUTTON IF BOTH PLAYERS FINISHED
                            if (sc) {
                                Score_button.setVisibility(View.VISIBLE);
                                notice_txt.setText("Both players finished. Press Score Review for rankings.");
                                notice_txt.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                });

        //Next Player Button click
        NextPlayer_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // Make unnecessary things INVISIBLE
                        notice_txt.setVisibility(View.INVISIBLE);
                        score_txt.setVisibility(View.INVISIBLE);
                        NextPlayer_button.setVisibility(View.INVISIBLE);
                        Hint_button.setVisibility(View.INVISIBLE);
                        Skip_button.setVisibility(View.INVISIBLE);
                        Q1_button.setVisibility(View.INVISIBLE);
                        Q2_button.setVisibility(View.INVISIBLE);
                        Q3_button.setVisibility(View.INVISIBLE);
                        Q4_button.setVisibility(View.INVISIBLE);
                        Q5_button.setVisibility(View.INVISIBLE);
                        Start_button.setText("GO TO QUESTION LIST");
                        hello.setText("Next Player.");
                        Start_button.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        Reg_button.setVisibility(View.VISIBLE);
                        name_tit.setVisibility(View.VISIBLE);
                        txtname.setVisibility(View.VISIBLE);
                        question_txt.setText("");

                        PlayerNo(1, false, true);
                    }
                });

        //Score Button click
        Score_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View View)
                    {
                        // Make unnecessary things INVISIBLE
                        Score_button.setVisibility(View.INVISIBLE);
                        notice_txt.setVisibility(View.INVISIBLE);
                        NextPlayer_button.setVisibility(View.INVISIBLE);
                        Hint_button.setVisibility(View.INVISIBLE);
                        Skip_button.setVisibility(View.INVISIBLE);
                        Q1_button.setVisibility(View.INVISIBLE);
                        Q2_button.setVisibility(View.INVISIBLE);
                        Q3_button.setVisibility(View.INVISIBLE);
                        Q4_button.setVisibility(View.INVISIBLE);
                        Q5_button.setVisibility(View.INVISIBLE);
                        Start_button.setVisibility(View.INVISIBLE);
                        score_txt.setVisibility(View.INVISIBLE);

                        // Make necessary things VISIBLE
                        low_txt.setVisibility(View.VISIBLE);
                        high_txt.setVisibility(View.VISIBLE);

                        hello.setText("SCORE REVIEW");
                        if (playerList[0].getScore() > playerList[1].getScore())
                        {
                            high_txt.setText(playerList[0].getName() + " has higher score with " + playerList[0].getScore() + "/5");
                            low_txt.setText(playerList[1].getName() + " has lower score with " + playerList[1].getScore() + "/5");
                        }
                        else if (playerList[0].getScore() < playerList[1].getScore())
                        {
                            high_txt.setText(playerList[1].getName() + " has higher score with " + playerList[1].getScore() + "/5");
                            low_txt.setText(playerList[0].getName() + " has lower score with " + playerList[0].getScore() + "/5");
                        }
                        else if (playerList[0].getScore() == playerList[1].getScore())
                        {
                            high_txt.setText(playerList[1].getName() + " and " + playerList[0].getName() + " have same score with " + playerList[1].getScore() + "/5");
                            low_txt.setText("");
                        }
                    }
                });
    }
}




