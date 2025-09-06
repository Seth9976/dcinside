package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CircularRevealFrameLayout extends FrameLayout implements c {
    @NonNull
    private final b a;

    public CircularRevealFrameLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CircularRevealFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new b(this);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void b() {
        this.a.b();
    }

    @Override  // com.google.android.material.circularreveal.b$a
    public void c(Canvas canvas0) {
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.b$a
    public boolean d() {
        return super.isOpaque();
    }

    @Override  // com.google.android.material.circularreveal.c, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas0) {
        b b0 = this.a;
        if(b0 != null) {
            b0.c(canvas0);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void e() {
        this.a.a();
    }

    @Override  // com.google.android.material.circularreveal.c
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.a.g();
    }

    @Override  // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.a.h();
    }

    @Override  // com.google.android.material.circularreveal.c
    @Nullable
    public e getRevealInfo() {
        return this.a.j();
    }

    @Override  // com.google.android.material.circularreveal.c, android.view.View
    public boolean isOpaque() {
        return this.a == null ? super.isOpaque() : this.a.l();
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.a.m(drawable0);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.a.n(v);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setRevealInfo(@Nullable e c$e0) {
        this.a.o(c$e0);
    }
}

