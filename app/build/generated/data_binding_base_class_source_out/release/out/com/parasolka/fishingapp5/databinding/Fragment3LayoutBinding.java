// Generated by view binder compiler. Do not edit!
package com.parasolka.fishingapp5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.parasolka.fishingapp5.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Fragment3LayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton button10;

  @NonNull
  public final MaterialButton button11;

  @NonNull
  public final MaterialButton button5;

  @NonNull
  public final MaterialButton button6;

  @NonNull
  public final MaterialButton button7;

  @NonNull
  public final MaterialButton button8;

  @NonNull
  public final MaterialButton button9;

  @NonNull
  public final CircleImageView slidephoto;

  @NonNull
  public final TextView textView;

  private Fragment3LayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton button10, @NonNull MaterialButton button11,
      @NonNull MaterialButton button5, @NonNull MaterialButton button6,
      @NonNull MaterialButton button7, @NonNull MaterialButton button8,
      @NonNull MaterialButton button9, @NonNull CircleImageView slidephoto,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.button10 = button10;
    this.button11 = button11;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.button8 = button8;
    this.button9 = button9;
    this.slidephoto = slidephoto;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment3LayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment3LayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment3_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment3LayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button10;
      MaterialButton button10 = ViewBindings.findChildViewById(rootView, id);
      if (button10 == null) {
        break missingId;
      }

      id = R.id.button11;
      MaterialButton button11 = ViewBindings.findChildViewById(rootView, id);
      if (button11 == null) {
        break missingId;
      }

      id = R.id.button5;
      MaterialButton button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      MaterialButton button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button7;
      MaterialButton button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button8;
      MaterialButton button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.button9;
      MaterialButton button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.slidephoto;
      CircleImageView slidephoto = ViewBindings.findChildViewById(rootView, id);
      if (slidephoto == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new Fragment3LayoutBinding((ConstraintLayout) rootView, button10, button11, button5,
          button6, button7, button8, button9, slidephoto, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}