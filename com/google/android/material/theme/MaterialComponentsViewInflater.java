package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override  // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    protected AppCompatAutoCompleteTextView c(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        return new MaterialAutoCompleteTextView(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    protected AppCompatButton d(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return new MaterialButton(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    protected AppCompatCheckBox e(Context context0, AttributeSet attributeSet0) {
        return new MaterialCheckBox(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    protected AppCompatRadioButton k(Context context0, AttributeSet attributeSet0) {
        return new MaterialRadioButton(context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    protected AppCompatTextView o(Context context0, AttributeSet attributeSet0) {
        return new MaterialTextView(context0, attributeSet0);
    }
}

