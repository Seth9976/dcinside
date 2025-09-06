package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({Scope.b})
public class VisibilityAwareImageButton extends ImageButton {
    private int a;

    public VisibilityAwareImageButton(Context context0) {
        this(context0, null);
    }

    public VisibilityAwareImageButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public VisibilityAwareImageButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = this.getVisibility();
    }

    public final void c(int v, boolean z) {
        super.setVisibility(v);
        if(z) {
            this.a = v;
        }
    }

    public final int getUserSetVisibility() {
        return this.a;
    }

    @Override  // android.widget.ImageView
    public void setVisibility(int v) {
        this.c(v, true);
    }
}

