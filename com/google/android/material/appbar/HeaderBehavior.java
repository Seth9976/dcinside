package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

abstract class HeaderBehavior extends ViewOffsetBehavior {
    class a implements Runnable {
        private final CoordinatorLayout a;
        private final View b;
        final HeaderBehavior c;

        a(CoordinatorLayout coordinatorLayout0, View view0) {
            this.a = coordinatorLayout0;
            this.b = view0;
        }

        @Override
        public void run() {
            if(this.b != null) {
                OverScroller overScroller0 = HeaderBehavior.this.e;
                if(overScroller0 != null) {
                    if(overScroller0.computeScrollOffset()) {
                        int v = HeaderBehavior.this.e.getCurrY();
                        HeaderBehavior.this.e0(this.a, this.b, v);
                        ViewCompat.x1(this.b, this);
                        return;
                    }
                    HeaderBehavior.this.c0(this.a, this.b);
                }
            }
        }
    }

    @Nullable
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    @Nullable
    private VelocityTracker j;
    private static final int k = -1;

    public HeaderBehavior() {
        this.g = -1;
        this.i = -1;
    }

    public HeaderBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = -1;
        this.i = -1;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        boolean z;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                VelocityTracker velocityTracker0 = this.j;
                if(velocityTracker0 == null) {
                    z = false;
                }
                else {
                    velocityTracker0.addMovement(motionEvent0);
                    this.j.computeCurrentVelocity(1000);
                    float f = this.j.getYVelocity(this.g);
                    this.Y(coordinatorLayout0, view0, -this.a0(view0), 0, f);
                    z = true;
                }
                goto label_23;
            }
            case 2: {
                int v = motionEvent0.findPointerIndex(this.g);
                if(v == -1) {
                    return false;
                }
                int v1 = (int)motionEvent0.getY(v);
                int v2 = this.h - v1;
                this.h = v1;
                this.d0(coordinatorLayout0, view0, v2, this.Z(view0), 0);
                z = false;
                break;
            }
            case 3: {
                z = false;
            label_23:
                this.f = false;
                this.g = -1;
                VelocityTracker velocityTracker1 = this.j;
                if(velocityTracker1 != null) {
                    velocityTracker1.recycle();
                    this.j = null;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getActionIndex() == 0 ? 1 : 0;
                this.g = motionEvent0.getPointerId(v3);
                this.h = (int)(motionEvent0.getY(v3) + 0.5f);
                z = false;
                break;
            }
            default: {
                z = false;
            }
        }
        VelocityTracker velocityTracker2 = this.j;
        if(velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent0);
        }
        return this.f || z;
    }

    boolean W(View view0) {
        return false;
    }

    private void X() {
        if(this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    final boolean Y(CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v, int v1, float f) {
        Runnable runnable0 = this.d;
        if(runnable0 != null) {
            view0.removeCallbacks(runnable0);
            this.d = null;
        }
        if(this.e == null) {
            this.e = new OverScroller(view0.getContext());
        }
        this.e.fling(0, this.O(), 0, Math.round(f), 0, 0, v, v1);
        if(this.e.computeScrollOffset()) {
            a headerBehavior$a0 = new a(this, coordinatorLayout0, view0);
            this.d = headerBehavior$a0;
            ViewCompat.x1(view0, headerBehavior$a0);
            return true;
        }
        this.c0(coordinatorLayout0, view0);
        return false;
    }

    int Z(@NonNull View view0) {
        return -view0.getHeight();
    }

    int a0(@NonNull View view0) {
        return view0.getHeight();
    }

    int b0() {
        return this.O();
    }

    void c0(CoordinatorLayout coordinatorLayout0, View view0) {
    }

    final int d0(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
        return this.f0(coordinatorLayout0, view0, this.b0() - v, v1, v2);
    }

    int e0(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        return this.f0(coordinatorLayout0, view0, v, 0x80000000, 0x7FFFFFFF);
    }

    int f0(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
        int v3 = this.O();
        if(v1 != 0 && v3 >= v1 && v3 <= v2) {
            int v4 = MathUtils.e(v, v1, v2);
            if(v3 != v4) {
                this.U(v4);
                return v3 - v4;
            }
        }
        return 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout0.getContext()).getScaledTouchSlop();
        }
        if(motionEvent0.getActionMasked() == 2 && this.f) {
            int v = this.g;
            if(v == -1) {
                return false;
            }
            int v1 = motionEvent0.findPointerIndex(v);
            if(v1 == -1) {
                return false;
            }
            int v2 = (int)motionEvent0.getY(v1);
            if(Math.abs(v2 - this.h) > this.i) {
                this.h = v2;
                return true;
            }
        }
        if(motionEvent0.getActionMasked() == 0) {
            this.g = -1;
            int v3 = (int)motionEvent0.getX();
            int v4 = (int)motionEvent0.getY();
            boolean z = this.W(view0) && coordinatorLayout0.G(view0, v3, v4);
            this.f = z;
            if(z) {
                this.h = v4;
                this.g = motionEvent0.getPointerId(0);
                this.X();
                if(this.e != null && !this.e.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker0 = this.j;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        return false;
    }
}

