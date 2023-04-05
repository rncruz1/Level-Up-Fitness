// Generated by view binder compiler. Do not edit!
package com.example.cs125project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cs125project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateAccountBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button alreadyCreatedButton;

  @NonNull
  public final Button createAccountButton;

  @NonNull
  public final EditText email;

  @NonNull
  public final EditText password;

  private ActivityCreateAccountBinding(@NonNull RelativeLayout rootView,
      @NonNull Button alreadyCreatedButton, @NonNull Button createAccountButton,
      @NonNull EditText email, @NonNull EditText password) {
    this.rootView = rootView;
    this.alreadyCreatedButton = alreadyCreatedButton;
    this.createAccountButton = createAccountButton;
    this.email = email;
    this.password = password;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alreadyCreatedButton;
      Button alreadyCreatedButton = ViewBindings.findChildViewById(rootView, id);
      if (alreadyCreatedButton == null) {
        break missingId;
      }

      id = R.id.createAccountButton;
      Button createAccountButton = ViewBindings.findChildViewById(rootView, id);
      if (createAccountButton == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      return new ActivityCreateAccountBinding((RelativeLayout) rootView, alreadyCreatedButton,
          createAccountButton, email, password);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
