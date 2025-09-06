package com.facebook.drawee.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.gestures.a {
    public interface com.facebook.drawee.gestures.a.a {
        boolean onClick();
    }

    @VisibleForTesting
    @h
    com.facebook.drawee.gestures.a.a a;
    @VisibleForTesting
    final float b;
    @VisibleForTesting
    boolean c;
    @VisibleForTesting
    boolean d;
    @VisibleForTesting
    long e;
    @VisibleForTesting
    float f;
    @VisibleForTesting
    float g;

    public com.facebook.drawee.gestures.a(Context context0) {
        this.b = (float)ViewConfiguration.get(context0).getScaledTouchSlop();
        this.a();
    }

    public void a() {
        this.a = null;
        this.e();
    }

    public boolean b() {
        return this.c;
    }

    public static com.facebook.drawee.gestures.a c(Context context0) {
        return new com.facebook.drawee.gestures.a(context0);
    }

    public boolean d(MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.c = true;
                this.d = true;
                this.e = motionEvent0.getEventTime();
                this.f = motionEvent0.getX();
                this.g = motionEvent0.getY();
                return true;
            }
            case 1: {
                this.c = false;
                if(Math.abs(motionEvent0.getX() - this.f) > this.b || Math.abs(motionEvent0.getY() - this.g) > this.b) {
                    this.d = false;
                }
                if(this.d && motionEvent0.getEventTime() - this.e <= ((long)ViewConfiguration.getLongPressTimeout())) {
                    com.facebook.drawee.gestures.a.a a$a0 = this.a;
                    if(a$a0 != null) {
                        a$a0.onClick();
                    }
                }
                this.d = false;
                return true;
            }
            case 2: {
                if(Math.abs(motionEvent0.getX() - this.f) > this.b || Math.abs(motionEvent0.getY() - this.g) > this.b) {
                    this.d = false;
                    return true;
                }
                return true;
            }
            case 3: {
                this.c = false;
                this.d = false;
                return true;
            }
            default: {
                return true;
            }
        }
    }

    public void e() {
        this.c = false;
        this.d = false;
    }

    public void f(com.facebook.drawee.gestures.a.a a$a0) {
        this.a = a$a0;
    }
}

