package com.dcinside.app.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.dcinside.app.view.tool.i;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class SwipeHandleTabLayout extends TabLayout {
    @l
    private final i s9;
    private boolean t9;

    @j
    public SwipeHandleTabLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public SwipeHandleTabLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public SwipeHandleTabLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.s9 = new i();
        this.t9 = true;
    }

    public SwipeHandleTabLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final boolean getEnableHelper() {
        return this.t9;
    }

    @Override  // com.google.android.material.tabs.TabLayout
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.t9) {
            this.s9.e(this);
        }
    }

    @Override  // com.google.android.material.tabs.TabLayout
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.t9) {
            this.s9.f();
        }
    }

    @Override  // com.google.android.material.tabs.TabLayout
    public boolean onInterceptTouchEvent(@m MotionEvent motionEvent0) {
        if(this.t9) {
            this.s9.c(motionEvent0);
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // com.google.android.material.tabs.TabLayout
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@m MotionEvent motionEvent0) {
        if(this.t9) {
            this.s9.c(motionEvent0);
        }
        return super.onTouchEvent(motionEvent0);
    }

    public final void setEnableHelper(boolean z) {
        this.t9 = z;
    }
}

