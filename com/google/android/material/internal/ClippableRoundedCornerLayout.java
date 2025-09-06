package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class ClippableRoundedCornerLayout extends FrameLayout {
    @Nullable
    private Path a;
    private float b;

    public ClippableRoundedCornerLayout(@NonNull Context context0) {
        super(context0);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public void a() {
        this.a = null;
        this.b = 0.0f;
        this.invalidate();
    }

    public void b(float f, float f1, float f2, float f3, float f4) {
        this.d(new RectF(f, f1, f2, f3), f4);
    }

    public void c(@NonNull Rect rect0, float f) {
        this.b(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), f);
    }

    public void d(@NonNull RectF rectF0, float f) {
        if(this.a == null) {
            this.a = new Path();
        }
        this.b = f;
        this.a.reset();
        this.a.addRoundRect(rectF0, f, f, Path.Direction.CW);
        this.a.close();
        this.invalidate();
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        if(this.a == null) {
            super.dispatchDraw(canvas0);
            return;
        }
        int v = canvas0.save();
        canvas0.clipPath(this.a);
        super.dispatchDraw(canvas0);
        canvas0.restoreToCount(v);
    }

    public void e(float f) {
        this.b(((float)this.getLeft()), ((float)this.getTop()), ((float)this.getRight()), ((float)this.getBottom()), f);
    }

    public float getCornerRadius() {
        return this.b;
    }
}

