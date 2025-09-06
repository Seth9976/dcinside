package com.dcinside.app.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.dcinside.app.R.styleable;

public class PageIndicator extends LinearLayout {
    public static final class a implements Interpolator {
        private a() {
        }

        a(t t0) {
        }

        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Animator i;
    private Animator j;
    private int k;
    private static final int l = 5;

    public PageIndicator(Context context0) {
        super(context0);
        this.e(context0, null);
    }

    public PageIndicator(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e(context0, attributeSet0);
    }

    private void a(@DrawableRes int v, Animator animator0) {
        if(animator0.isRunning()) {
            animator0.end();
        }
        View view0 = new View(this.getContext());
        view0.setBackgroundResource(v);
        this.addView(view0, this.b, this.c);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)view0.getLayoutParams();
        linearLayout$LayoutParams0.leftMargin = this.a;
        linearLayout$LayoutParams0.rightMargin = this.a;
        view0.setLayoutParams(linearLayout$LayoutParams0);
        animator0.setTarget(view0);
        animator0.end();
    }

    private void b(Context context0) {
        this.i = AnimatorInflater.loadAnimator(context0, this.d);
        Animator animator0 = AnimatorInflater.loadAnimator(context0, this.e);
        this.j = animator0;
        if(this.e == 0x7F02002C) {  // animator:scale_with_alpha
            animator0.setInterpolator(new a(null));
        }
    }

    private void c(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 == null) {
            return;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.PageIndicator);
        this.b = typedArray0.getDimensionPixelSize(6, 0);
        this.c = typedArray0.getDimensionPixelSize(4, 0);
        this.a = typedArray0.getDimensionPixelSize(5, 0);
        this.d = typedArray0.getResourceId(1, 0x7F02002C);  // animator:scale_with_alpha
        this.e = typedArray0.getResourceId(0, 0x7F02002C);  // animator:scale_with_alpha
        this.f = typedArray0.getResourceId(3, 0);
        this.g = typedArray0.getResourceId(2, 0);
        typedArray0.recycle();
    }

    private void d() {
        this.removeAllViews();
        if(this.k <= 0) {
            return;
        }
        for(int v = 0; v < this.k; ++v) {
            if(this.h == v) {
                this.a(this.f, this.i);
            }
            else {
                this.a(this.g, this.j);
            }
        }
    }

    private void e(Context context0, AttributeSet attributeSet0) {
        if(this.isInEditMode()) {
            return;
        }
        this.setGravity(17);
        this.setOrientation(0);
        this.c(context0, attributeSet0);
        this.b(context0);
        this.f(0, 0);
    }

    public void f(int v, int v1) {
        if(this.i.isRunning()) {
            this.i.end();
        }
        if(this.j.isRunning()) {
            this.j.end();
        }
        int v2 = this.h;
        this.h = v;
        if(this.k != v1) {
            this.k = v1;
            this.d();
        }
        View view0 = this.getChildAt(v2);
        if(view0 != null) {
            view0.setBackgroundResource(this.g);
            this.j.setTarget(view0);
            this.j.start();
        }
        View view1 = this.getChildAt(v);
        if(view1 != null) {
            view1.setBackgroundResource(this.f);
            this.i.setTarget(view1);
            this.i.start();
        }
    }
}

