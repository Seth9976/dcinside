package com.github.chrisbanes.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

class c {
    private int a;
    private int b;
    private final ScaleGestureDetector c;
    private VelocityTracker d;
    private boolean e;
    private float f;
    private float g;
    private final float h;
    private final float i;
    private d j;
    private static final int k = -1;

    c(Context context0, d d0) {
        class a implements ScaleGestureDetector.OnScaleGestureListener {
            final c a;

            @Override  // android.view.ScaleGestureDetector$OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector0) {
                float f = scaleGestureDetector0.getScaleFactor();
                if(!Float.isNaN(f) && !Float.isInfinite(f)) {
                    if(f >= 0.0f) {
                        c.this.j.c(f, scaleGestureDetector0.getFocusX(), scaleGestureDetector0.getFocusY());
                    }
                    return true;
                }
                return false;
            }

            @Override  // android.view.ScaleGestureDetector$OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector0) {
                return true;
            }

            @Override  // android.view.ScaleGestureDetector$OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector0) {
            }
        }

        this.a = -1;
        this.b = 0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.i = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.h = (float)viewConfiguration0.getScaledTouchSlop();
        this.j = d0;
        this.c = new ScaleGestureDetector(context0, new a(this));
    }

    private float b(MotionEvent motionEvent0) {
        try {
            return motionEvent0.getX(this.b);
        }
        catch(Exception unused_ex) {
            return motionEvent0.getX();
        }
    }

    private float c(MotionEvent motionEvent0) {
        try {
            return motionEvent0.getY(this.b);
        }
        catch(Exception unused_ex) {
            return motionEvent0.getY();
        }
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent0) {
        try {
            this.c.onTouchEvent(motionEvent0);
            return this.g(motionEvent0);
        }
        catch(IllegalArgumentException unused_ex) {
            return true;
        }
    }

    private boolean g(MotionEvent motionEvent0) {
        int v = 0;
        switch(motionEvent0.getAction() & 0xFF) {
            case 0: {
                this.a = motionEvent0.getPointerId(0);
                VelocityTracker velocityTracker0 = VelocityTracker.obtain();
                this.d = velocityTracker0;
                if(velocityTracker0 != null) {
                    velocityTracker0.addMovement(motionEvent0);
                }
                this.f = this.b(motionEvent0);
                this.g = this.c(motionEvent0);
                this.e = false;
                break;
            }
            case 1: {
                this.a = -1;
                if(this.e && this.d != null) {
                    this.f = this.b(motionEvent0);
                    this.g = this.c(motionEvent0);
                    this.d.addMovement(motionEvent0);
                    this.d.computeCurrentVelocity(1000);
                    float f = this.d.getXVelocity();
                    float f1 = this.d.getYVelocity();
                    if(Math.max(Math.abs(f), Math.abs(f1)) >= this.i) {
                        this.j.b(this.f, this.g, -f, -f1);
                    }
                }
                VelocityTracker velocityTracker1 = this.d;
                if(velocityTracker1 != null) {
                    velocityTracker1.recycle();
                    this.d = null;
                }
                break;
            }
            case 2: {
                float f2 = this.b(motionEvent0);
                float f3 = this.c(motionEvent0);
                float f4 = f2 - this.f;
                float f5 = f3 - this.g;
                if(!this.e) {
                    this.e = Math.sqrt(f4 * f4 + f5 * f5) >= ((double)this.h);
                }
                if(this.e) {
                    this.j.a(f4, f5);
                    this.f = f2;
                    this.g = f3;
                    VelocityTracker velocityTracker2 = this.d;
                    if(velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent0);
                    }
                }
                break;
            }
            case 3: {
                this.a = -1;
                VelocityTracker velocityTracker3 = this.d;
                if(velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.d = null;
                }
                break;
            }
            case 6: {
                int v1 = m.b(motionEvent0.getAction());
                if(motionEvent0.getPointerId(v1) == this.a) {
                    int v2 = v1 == 0 ? 1 : 0;
                    this.a = motionEvent0.getPointerId(v2);
                    this.f = motionEvent0.getX(v2);
                    this.g = motionEvent0.getY(v2);
                }
            }
        }
        int v3 = this.a;
        if(v3 != -1) {
            v = v3;
        }
        this.b = motionEvent0.findPointerIndex(v);
        return true;
    }
}

