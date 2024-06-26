// Generated by view binder compiler. Do not edit!
package com.parasolka.fishingapp5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.parasolka.fishingapp5.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOgev2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView answerTextView;

  @NonNull
  public final Button button2;

  @NonNull
  public final EditText editText;

  @NonNull
  public final Button falseButton;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ImageView myimage;

  @NonNull
  public final ImageButton nextButton;

  @NonNull
  public final ImageButton prevButton;

  @NonNull
  public final Button trueButton;

  private ActivityOgev2Binding(@NonNull ConstraintLayout rootView, @NonNull TextView answerTextView,
      @NonNull Button button2, @NonNull EditText editText, @NonNull Button falseButton,
      @NonNull ConstraintLayout main, @NonNull ImageView myimage, @NonNull ImageButton nextButton,
      @NonNull ImageButton prevButton, @NonNull Button trueButton) {
    this.rootView = rootView;
    this.answerTextView = answerTextView;
    this.button2 = button2;
    this.editText = editText;
    this.falseButton = falseButton;
    this.main = main;
    this.myimage = myimage;
    this.nextButton = nextButton;
    this.prevButton = prevButton;
    this.trueButton = trueButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOgev2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOgev2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ogev2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOgev2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.answer_text_view;
      TextView answerTextView = ViewBindings.findChildViewById(rootView, id);
      if (answerTextView == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.edit_Text;
      EditText editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.false_button;
      Button falseButton = ViewBindings.findChildViewById(rootView, id);
      if (falseButton == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.myimage;
      ImageView myimage = ViewBindings.findChildViewById(rootView, id);
      if (myimage == null) {
        break missingId;
      }

      id = R.id.next_button;
      ImageButton nextButton = ViewBindings.findChildViewById(rootView, id);
      if (nextButton == null) {
        break missingId;
      }

      id = R.id.prev_button;
      ImageButton prevButton = ViewBindings.findChildViewById(rootView, id);
      if (prevButton == null) {
        break missingId;
      }

      id = R.id.true_button;
      Button trueButton = ViewBindings.findChildViewById(rootView, id);
      if (trueButton == null) {
        break missingId;
      }

      return new ActivityOgev2Binding((ConstraintLayout) rootView, answerTextView, button2,
          editText, falseButton, main, myimage, nextButton, prevButton, trueButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
