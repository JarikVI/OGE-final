package com.parasolka.fishingapp5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OGEv4 extends AppCompatActivity {
    private Button falseButton;
    private Button trueButton;
    private Button bb;
    private ImageButton nextButton;
    private ImageButton prevButton;
    private EditText et;
    private ImageView Image;
    private TextView questionTextView;
    private int correct = 0;
    // to keep current question track
    private int currentQuestionIndex = 0;

    private qq[] questionBank = new qq[] {
            // array of objects of class Question
            // providing questions from string
            // resource and the correct ans
            new qq(R.string.a, "4"),
            new qq(R.string.b, "4"),
            new qq(R.string.c, "4"),
            new qq(R.string.d, "4"),
            new qq(R.string.e, "4"),
            new qq(R.string.f, "4"),

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ogev4);
        et = findViewById(R.id.edit_Text);
        bb = findViewById(R.id.button2);
        nextButton = findViewById(R.id.next_button);
        prevButton = findViewById(R.id.prev_button);
        questionTextView
                = findViewById(R.id.answer_text_view);
        Image = findViewById(R.id.myimage);
        nextButton.setOnClickListener(this::onClick);
        prevButton.setOnClickListener( this::onClick);
        bb.setOnClickListener(this::onClick);
    }

  //  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View v) {


//        if(v.getId() == R.id.button2) checkAnswer("2");
        if(v.getId() == R.id.next_button) {
            if (currentQuestionIndex < 7) {
                currentQuestionIndex
                        = currentQuestionIndex + 1;
                // we are safe now!
                // last question reached
                // making buttons
                // invisible
                if (currentQuestionIndex == 6) {
                    questionTextView.setText(getString(
                            R.string.correct, correct));
                    nextButton.setVisibility(
                            View.INVISIBLE);
                    prevButton.setVisibility(
                            View.INVISIBLE);
                    trueButton.setVisibility(
                            View.INVISIBLE);
                    falseButton.setVisibility(
                            View.INVISIBLE);
                    if (correct > 3)

                        questionTextView.setText(
                                "CORRECTNESS IS " + correct
                                        + " "
                                        + "OUT OF 6");
                    else
                        Image.setImageResource(R.drawable.logo);
                }
                else {
                    updateQuestion();
                }
            }
        }
        if (v.getId() == R.id.prev_button) {

            if (currentQuestionIndex > 0) {
                currentQuestionIndex
                        = (currentQuestionIndex - 1)
                        % questionBank.length;
                updateQuestion();
            }
        }
    }
    private void updateQuestion()
    {
        Log.d("Current",
                "onClick: " + currentQuestionIndex);

        questionTextView.setText(
                questionBank[currentQuestionIndex].getAnswerResId());
        // setting the textview with new question
        switch (currentQuestionIndex) {
            case 1:
                // setting up image for each
                // question
                Image.setImageResource(R.drawable.logo);
                break;
            case 2:
                Image.setImageResource(R.drawable.logo);
                break;
            case 3:
                Image.setImageResource(R.drawable.logo);
                break;
            case 4:
                Image.setImageResource(R.drawable.logo);
                break;
            case 5:
                Image.setImageResource(R.drawable.logo);
                break;
            case 6:
                Image.setImageResource(R.drawable.logo);
                break;
            case 7:
                Image.setImageResource(R.drawable.logo);
                break;
        }
    }
    private void checkAnswer(String userChooseCorrect)
    {
        String answerIsTrue  = questionBank[currentQuestionIndex].isAnswerTrue();
        int toastMessageId;

        if (et.getText().toString().equals(answerIsTrue)) {
            toastMessageId = R.string.correct_answer;
            correct++;
        }
        else {
            toastMessageId = R.string.wrong_answer;
        }

        Toast.makeText(OGEv4.this, toastMessageId, Toast.LENGTH_SHORT).show();
    }


}