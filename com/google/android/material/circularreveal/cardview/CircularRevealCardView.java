package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c.e;
import com.google.android.material.circularreveal.c;

public class CircularRevealCardView extends MaterialCardView implements c {
    @NonNull
    private final b y;

    public CircularRevealCardView(Context context0) {
        this(context0, null);
    }

    public CircularRevealCardView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.y = new b(this);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void b() {
        this.y.b();
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
        b b0 = this.y;
        if(b0 != null) {
            b0.c(canvas0);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void e() {
        this.y.a();
    }

    @Override  // com.google.android.material.circularreveal.c
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.y.g();
    }

    @Override  // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.y.h();
    }

    @Override  // com.google.android.material.circularreveal.c
    @Nullable
    public e getRevealInfo() {
        return this.y.j();
    }

    @Override  // com.google.android.material.circularreveal.c, android.view.View
    public boolean isOpaque() {
        return this.y == null ? super.isOpaque() : this.y.l();
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.y.m(drawable0);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.y.n(v);
    }

    @Override  // com.google.android.material.circularreveal.c
    public void setRevealInfo(@Nullable e c$e0) {
        this.y.o(c$e0);
    }
}

