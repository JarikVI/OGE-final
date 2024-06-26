// Generated by view binder compiler. Do not edit!
package com.parasolka.fishingapp5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.parasolka.fishingapp5.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class YourPostLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MaterialButton addfriendyp;

  @NonNull
  public final CircleImageView idCVAuthoryp;

  @NonNull
  public final ImageView idIVPostyp;

  @NonNull
  public final LinearLayout idLLTopBaryp;

  @NonNull
  public final TextView idTVAuthorNameyp;

  @NonNull
  public final MaterialButton idTVLikesbtnyp;

  @NonNull
  public final TextView idTVLikesyp;

  @NonNull
  public final TextView idTVPosttimekeyyp;

  @NonNull
  public final TextView idTVPostuseridyp;

  @NonNull
  public final TextView idTVdescyp;

  @NonNull
  public final MaterialButton sharebuttonyp;

  private YourPostLayoutBinding(@NonNull RelativeLayout rootView,
      @NonNull MaterialButton addfriendyp, @NonNull CircleImageView idCVAuthoryp,
      @NonNull ImageView idIVPostyp, @NonNull LinearLayout idLLTopBaryp,
      @NonNull TextView idTVAuthorNameyp, @NonNull MaterialButton idTVLikesbtnyp,
      @NonNull TextView idTVLikesyp, @NonNull TextView idTVPosttimekeyyp,
      @NonNull TextView idTVPostuseridyp, @NonNull TextView idTVdescyp,
      @NonNull MaterialButton sharebuttonyp) {
    this.rootView = rootView;
    this.addfriendyp = addfriendyp;
    this.idCVAuthoryp = idCVAuthoryp;
    this.idIVPostyp = idIVPostyp;
    this.idLLTopBaryp = idLLTopBaryp;
    this.idTVAuthorNameyp = idTVAuthorNameyp;
    this.idTVLikesbtnyp = idTVLikesbtnyp;
    this.idTVLikesyp = idTVLikesyp;
    this.idTVPosttimekeyyp = idTVPosttimekeyyp;
    this.idTVPostuseridyp = idTVPostuseridyp;
    this.idTVdescyp = idTVdescyp;
    this.sharebuttonyp = sharebuttonyp;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static YourPostLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static YourPostLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.your_post_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static YourPostLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addfriendyp;
      MaterialButton addfriendyp = ViewBindings.findChildViewById(rootView, id);
      if (addfriendyp == null) {
        break missingId;
      }

      id = R.id.idCVAuthoryp;
      CircleImageView idCVAuthoryp = ViewBindings.findChildViewById(rootView, id);
      if (idCVAuthoryp == null) {
        break missingId;
      }

      id = R.id.idIVPostyp;
      ImageView idIVPostyp = ViewBindings.findChildViewById(rootView, id);
      if (idIVPostyp == null) {
        break missingId;
      }

      id = R.id.idLLTopBaryp;
      LinearLayout idLLTopBaryp = ViewBindings.findChildViewById(rootView, id);
      if (idLLTopBaryp == null) {
        break missingId;
      }

      id = R.id.idTVAuthorNameyp;
      TextView idTVAuthorNameyp = ViewBindings.findChildViewById(rootView, id);
      if (idTVAuthorNameyp == null) {
        break missingId;
      }

      id = R.id.idTVLikesbtnyp;
      MaterialButton idTVLikesbtnyp = ViewBindings.findChildViewById(rootView, id);
      if (idTVLikesbtnyp == null) {
        break missingId;
      }

      id = R.id.idTVLikesyp;
      TextView idTVLikesyp = ViewBindings.findChildViewById(rootView, id);
      if (idTVLikesyp == null) {
        break missingId;
      }

      id = R.id.idTVPosttimekeyyp;
      TextView idTVPosttimekeyyp = ViewBindings.findChildViewById(rootView, id);
      if (idTVPosttimekeyyp == null) {
        break missingId;
      }

      id = R.id.idTVPostuseridyp;
      TextView idTVPostuseridyp = ViewBindings.findChildViewById(rootView, id);
      if (idTVPostuseridyp == null) {
        break missingId;
      }

      id = R.id.idTVdescyp;
      TextView idTVdescyp = ViewBindings.findChildViewById(rootView, id);
      if (idTVdescyp == null) {
        break missingId;
      }

      id = R.id.sharebuttonyp;
      MaterialButton sharebuttonyp = ViewBindings.findChildViewById(rootView, id);
      if (sharebuttonyp == null) {
        break missingId;
      }

      return new YourPostLayoutBinding((RelativeLayout) rootView, addfriendyp, idCVAuthoryp,
          idIVPostyp, idLLTopBaryp, idTVAuthorNameyp, idTVLikesbtnyp, idTVLikesyp,
          idTVPosttimekeyyp, idTVPostuseridyp, idTVdescyp, sharebuttonyp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
