package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;

@RestrictTo({Scope.b})
public class ScrimInsetsFrameLayout extends FrameLayout {
    @Nullable
    Drawable a;
    Rect b;
    private Rect c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public ScrimInsetsFrameLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        class a implements OnApplyWindowInsetsListener {
            final ScrimInsetsFrameLayout a;

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout0 = ScrimInsetsFrameLayout.this;
                if(scrimInsetsFrameLayout0.b == null) {
                    scrimInsetsFrameLayout0.b = new Rect();
                }
                ScrimInsetsFrameLayout.this.b.set(windowInsetsCompat0.p(), windowInsetsCompat0.r(), windowInsetsCompat0.q(), windowInsetsCompat0.o());
                ScrimInsetsFrameLayout.this.h(windowInsetsCompat0);
                boolean z = !windowInsetsCompat0.w() || ScrimInsetsFrameLayout.this.a == null;
                ScrimInsetsFrameLayout.this.setWillNotDraw(z);
                ViewCompat.v1(ScrimInsetsFrameLayout.this);
                return windowInsetsCompat0.c();
            }
        }

        super(context0, attributeSet0, v);
        this.c = new Rect();
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.ScrimInsetsFrameLayout, v, style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.a = typedArray0.getDrawable(styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArray0.recycle();
        this.setWillNotDraw(true);
        ViewCompat.m2(this, new a(this));
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        int v = this.getWidth();
        int v1 = this.getHeight();
        if(this.b != null && this.a != null) {
            int v2 = canvas0.save();
            canvas0.translate(((float)this.getScrollX()), ((float)this.getScrollY()));
            if(this.d) {
                this.c.set(0, 0, v, this.b.top);
                this.a.setBounds(this.c);
                this.a.draw(canvas0);
            }
            if(this.e) {
                this.c.set(0, v1 - this.b.bottom, v, v1);
                this.a.setBounds(this.c);
                this.a.draw(canvas0);
            }
            if(this.f) {
                this.c.set(0, this.b.top, this.b.left, v1 - this.b.bottom);
                this.a.setBounds(this.c);
                this.a.draw(canvas0);
            }
            if(this.g) {
                this.c.set(v - this.b.right, this.b.top, v, v1 - this.b.bottom);
                this.a.setBounds(this.c);
                this.a.draw(canvas0);
            }
            canvas0.restoreToCount(v2);
        }
    }

    protected void h(WindowInsetsCompat windowInsetsCompat0) {
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.d = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable0) {
        this.a = drawable0;
    }
}

