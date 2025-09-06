package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R.drawable;
import com.google.android.material.R.string;

class x extends s {
    private int e;
    @Nullable
    private EditText f;
    private final View.OnClickListener g;

    x(@NonNull r r0, @DrawableRes int v) {
        super(r0);
        this.e = drawable.design_password_eye;
        this.g = (View view0) -> {
            EditText editText0 = this.f;
            if(editText0 == null) {
                return;
            }
            int v = editText0.getSelectionEnd();
            if(this.w()) {
                this.f.setTransformationMethod(null);
            }
            else {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if(v >= 0) {
                this.f.setSelection(v);
            }
            this.r();
        };
        if(v != 0) {
            this.e = v;
        }
    }

    @Override  // com.google.android.material.textfield.s
    void b(CharSequence charSequence0, int v, int v1, int v2) {
        this.r();
    }

    @Override  // com.google.android.material.textfield.s
    @StringRes
    int c() {
        return string.password_toggle_content_description;
    }

    @Override  // com.google.android.material.textfield.s
    @DrawableRes
    int d() {
        return this.e;
    }

    @Override  // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.g;
    }

    @Override  // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override  // com.google.android.material.textfield.s
    boolean m() {
        return !this.w();
    }

    @Override  // com.google.android.material.textfield.s
    void n(@Nullable EditText editText0) {
        this.f = editText0;
        this.r();
    }

    @Override  // com.google.android.material.textfield.s
    void s() {
        if(x.x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override  // com.google.android.material.textfield.s
    void u() {
        EditText editText0 = this.f;
        if(editText0 != null) {
            editText0.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    private boolean w() {
        return this.f != null && this.f.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    private static boolean x(EditText editText0) {
        if(editText0 != null) {
            switch(editText0.getInputType()) {
                case 16: 
                case 0x80: 
                case 0x90: 
                case 0xE0: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    // 检测为 Lambda 实现
    private void y(View view0) [...]
}

