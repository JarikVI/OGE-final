package com.parasolka.fishingapp5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OGEv3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ogev1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}


/*package com.parasolka.fishingapp5;

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
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class OGEv3 extends AppCompatActivity
        implements View.OnClickListener {
    // setting up things
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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setting up the buttons
        // associated with id
        et = findViewById(R.id.edit_Text);
        bb = findViewById(R.id.button2);
        nextButton = findViewById(R.id.next_button);
        prevButton = findViewById(R.id.prev_button);
        // register our buttons to listen to
        // click events
        questionTextView
                = findViewById(R.id.answer_text_view);
        Image = findViewById(R.id.myimage);
        nextButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);
        bb.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }
}*/