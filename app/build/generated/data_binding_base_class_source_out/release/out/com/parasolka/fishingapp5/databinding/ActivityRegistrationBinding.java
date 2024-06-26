// Generated by view binder compiler. Do not edit!
package com.parasolka.fishingapp5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.parasolka.fishingapp5.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistrationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRegister;

  @NonNull
  public final EditText editTextName;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final ImageView imageViewAvatar;

  private ActivityRegistrationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonRegister, @NonNull EditText editTextName, @NonNull EditText etEmail,
      @NonNull EditText etPassword, @NonNull ImageView imageViewAvatar) {
    this.rootView = rootView;
    this.buttonRegister = buttonRegister;
    this.editTextName = editTextName;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
    this.imageViewAvatar = imageViewAvatar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonRegister;
      Button buttonRegister = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegister == null) {
        break missingId;
      }

      id = R.id.editTextName;
      EditText editTextName = ViewBindings.findChildViewById(rootView, id);
      if (editTextName == null) {
        break missingId;
      }

      id = R.id.et_email;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_password;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.imageViewAvatar;
      ImageView imageViewAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imageViewAvatar == null) {
        break missingId;
      }

      return new ActivityRegistrationBinding((ConstraintLayout) rootView, buttonRegister,
          editTextName, etEmail, etPassword, imageViewAvatar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
