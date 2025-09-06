package com.dcinside.app.post.fragments;

import android.annotation.SuppressLint;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.Nk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@SuppressLint({"ClickableViewAccessibility"})
@s0({"SMAP\nImageNoteInputScrollHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageNoteInputScrollHelper.kt\ncom/dcinside/app/post/fragments/ImageNoteInputScrollHelper\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,83:1\n147#2:84\n*S KotlinDebug\n*F\n+ 1 ImageNoteInputScrollHelper.kt\ncom/dcinside/app/post/fragments/ImageNoteInputScrollHelper\n*L\n13#1:84\n*E\n"})
public final class z {
    final class a extends GestureDetector.SimpleOnGestureListener {
        final z a;

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onFling(@m MotionEvent motionEvent0, @l MotionEvent motionEvent1, float f, float f1) {
            L.p(motionEvent1, "e2");
            C c0 = (C)z.this.a.a();
            if(c0 == null) {
                return false;
            }
            if(c0.getCurrentMode() == n.a && f1 > 0.0f && Math.abs(f1) >= ((float)c0.getNickHeight())) {
                Nk.a.c(c0);
                return true;
            }
            return false;
        }
    }

    @l
    private t a;
    @m
    private GestureDetector b;
    private float c;
    private boolean d;

    public z(@l C c0) {
        L.p(c0, "view");
        super();
        this.a = new t(c0);
        this.b = new GestureDetector(c0.getContext(), new a(this));
        ConstraintLayout constraintLayout0 = c0.getMoveWrap();
        if(constraintLayout0 != null) {
            constraintLayout0.setClickable(true);
        }
        ConstraintLayout constraintLayout1 = c0.getMoveWrap();
        if(constraintLayout1 != null) {
            constraintLayout1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                L.p(this, "this$0");
                L.m(motionEvent0);
                return this.f(motionEvent0);
            });
        }
        View view0 = c0.getMoveIcon();
        if(view0 != null) {
            view0.setClickable(true);
        }
        View view1 = c0.getMoveIcon();
        if(view1 != null) {
            view1.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                L.p(this, "this$0");
                L.m(motionEvent0);
                return this.f(motionEvent0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final boolean c(z z0, View view0, MotionEvent motionEvent0) [...]

    // 检测为 Lambda 实现
    private static final boolean d(z z0, View view0, MotionEvent motionEvent0) [...]

    // 去混淆评级： 低(20)
    private final boolean f(MotionEvent motionEvent0) {
        return this.b != null && this.b.onTouchEvent(motionEvent0) ? true : this.g(motionEvent0);
    }

    private final boolean g(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.c = motionEvent0.getRawY();
                return false;
            }
            case 2: {
                float f = this.c;
                float f1 = motionEvent0.getRawY();
                this.c = motionEvent0.getRawY();
                C c1 = (C)this.a.a();
                if(c1 != null) {
                    c1.Z(f - f1);
                    return false;
                }
                break;
            }
            case 1: 
            case 3: {
                C c0 = (C)this.a.a();
                if(c0 != null) {
                    c0.X();
                    return false;
                }
                break;
            }
            default: {
                return false;
            }
        }
        return false;
    }

    public final void h() {
        this.b = null;
        this.d = false;
        this.c = 0.0f;
        C c0 = (C)this.a.a();
        if(c0 == null) {
            return;
        }
        ConstraintLayout constraintLayout0 = c0.getMoveWrap();
        if(constraintLayout0 != null) {
            constraintLayout0.setOnTouchListener(null);
        }
        View view0 = c0.getMoveIcon();
        if(view0 != null) {
            view0.setOnTouchListener(null);
        }
    }
}

