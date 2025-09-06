package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

@RestrictTo({Scope.b})
public class g extends DrawableWrapperCompat {
    private final int b;
    private final int c;

    public g(@NonNull Drawable drawable0, int v, int v1) {
        super(drawable0);
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public int getIntrinsicHeight() {
        return this.c;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
    public int getIntrinsicWidth() {
        return this.b;
    }
}

