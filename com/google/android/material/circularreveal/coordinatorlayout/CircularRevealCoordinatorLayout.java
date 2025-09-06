package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c.e;
import com.google.android.material.circularreveal.c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {
    @NonNull
    private final b F;

    public CircularRevealCoordinatorLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public CircularRevealCoordinatorLayout(@NonNull Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.F = new b(this);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void b() {
        this.F.b();
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
    public void draw(Canvas canvas0) {
        b b0 = this.F;
        if(b0 != null) {
            b0.c(canvas0);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void e() {
        this.F.a();
    }

    @Override  // com.google.android.material.circularreveal.c
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.F.g();
    }

    @Override  // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.F.h();
    }

    @Override  // com.google.android.material.circularreveal.c
    @Nullable
    public e getRevealInfo() {
        return this.F.j();
    }

    @Override  // com.google.android.material.circularreveal.c, android.view.View
    public boolean isOpaque() {
        return this.F == null ? super.isOpaque() : this.F.l();
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.F.m(drawable0);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.F.n(v);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setRevealInfo(@Nullable e c$e0) {
        this.F.o(c$e0);
    }
}

