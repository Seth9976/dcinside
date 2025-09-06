package com.dcinside.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nAutoRotateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoRotateLayout.kt\ncom/dcinside/app/view/AutoRotateLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,135:1\n31#2:136\n*S KotlinDebug\n*F\n+ 1 AutoRotateLayout.kt\ncom/dcinside/app/view/AutoRotateLayout\n*L\n59#1:136\n*E\n"})
public final class AutoRotateLayout extends ViewGroup {
    private int a;
    @l
    private final Matrix b;
    @l
    private final Rect c;
    @l
    private final RectF d;
    @l
    private final RectF e;
    @l
    private final float[] f;
    @l
    private final float[] g;
    private boolean h;
    @m
    private Boolean i;

    @j
    public AutoRotateLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AutoRotateLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AutoRotateLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.b = new Matrix();
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new float[2];
        this.g = new float[2];
        this.setWillNotDraw(false);
    }

    public AutoRotateLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void a(int v, int v1) {
        this.setMeasuredDimension(v, v1);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        this.setClipToPadding(false);
        canvas0.save();
        canvas0.rotate(((float)(-this.a)), ((float)this.getWidth()) / 2.0f, ((float)this.getHeight()) / 2.0f);
        super.dispatchDraw(canvas0);
        canvas0.restore();
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        this.f[0] = motionEvent0.getX();
        this.f[1] = motionEvent0.getY();
        this.b.mapPoints(this.g, this.f);
        motionEvent0.setLocation(this.g[0], this.g[1]);
        boolean z = super.dispatchTouchEvent(motionEvent0);
        motionEvent0.setLocation(this.f[0], this.f[1]);
        return z;
    }

    @Override  // android.view.ViewGroup
    public void onDescendantInvalidated(@l View view0, @l View view1) {
        L.p(view0, "child");
        L.p(view1, "target");
        this.invalidate();
        super.onDescendantInvalidated(view0, view1);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = v2 - v;
        int v5 = v3 - v1;
        if(this.h || z) {
            this.d.set(0.0f, 0.0f, ((float)v4), ((float)v5));
            float f = (float)this.a;
            float f1 = this.d.centerX();
            float f2 = this.d.centerY();
            this.b.setRotate(f, f1, f2);
            this.b.mapRect(this.e, this.d);
            this.e.round(this.c);
            this.h = false;
        }
        View view0 = this.getChildCount() <= 0 ? null : this.getChildAt(0);
        if(view0 != null) {
            int v6 = (v4 - view0.getMeasuredWidth()) / 2;
            int v7 = (v5 - view0.getMeasuredHeight()) / 2;
            view0.layout(v6, v7, view0.getMeasuredWidth() + v6, view0.getMeasuredHeight() + v7);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        Display display0 = null;
        int v2 = 0;
        View view0 = this.getChildCount() <= 0 ? null : this.getChildAt(0);
        if(view0 == null) {
            super.onMeasure(v, v1);
            return;
        }
        if(this.i == null) {
            this.measureChild(view0, 0, 0);
            boolean z = view0.getMeasuredWidth() >= view0.getMeasuredHeight();
            this.i = Boolean.valueOf(z);
            if(!z) {
                Context context0 = this.getContext();
                L.o(context0, "getContext(...)");
                DisplayManager displayManager0 = (DisplayManager)ContextCompat.getSystemService(context0, DisplayManager.class);
                if(displayManager0 != null) {
                    display0 = displayManager0.getDisplay(0);
                }
                switch((display0 == null ? 0 : display0.getRotation())) {
                    case 1: {
                        v2 = 90;
                        break;
                    }
                    case 2: {
                        v2 = 180;
                        break;
                    }
                    case 3: {
                        v2 = 270;
                    }
                }
            }
            this.a = v2;
            this.h = true;
        }
        if(Math.abs(this.a % 180) == 90) {
            this.measureChild(view0, v1, v);
            this.a(View.resolveSize(view0.getMeasuredHeight(), v), View.resolveSize(view0.getMeasuredWidth(), v1));
            return;
        }
        this.measureChild(view0, v, v1);
        this.a(View.resolveSize(view0.getMeasuredWidth(), v), View.resolveSize(view0.getMeasuredHeight(), v1));
    }
}

