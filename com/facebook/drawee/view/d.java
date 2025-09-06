package com.facebook.drawee.view;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import k1.n.a;
import k1.n;

@Deprecated
@n(a.a)
public class d {
    @VisibleForTesting
    boolean a;
    @VisibleForTesting
    ArrayList b;

    public d() {
        this.a = false;
        this.b = new ArrayList();
    }

    public void a(int v, b b0) {
        com.facebook.common.internal.n.i(b0);
        com.facebook.common.internal.n.g(v, this.b.size() + 1);
        this.b.add(v, b0);
        if(this.a) {
            b0.m();
        }
    }

    public void b(b b0) {
        this.a(this.b.size(), b0);
    }

    public void c() {
        if(this.a) {
            for(int v = 0; v < this.b.size(); ++v) {
                ((b)this.b.get(v)).n();
            }
        }
        this.b.clear();
    }

    public void d(Canvas canvas0) {
        for(int v = 0; v < this.b.size(); ++v) {
            Drawable drawable0 = this.e(v).h();
            if(drawable0 != null) {
                drawable0.draw(canvas0);
            }
        }
    }

    public b e(int v) {
        return (b)this.b.get(v);
    }

    public void f() {
        if(this.a) {
            return;
        }
        this.a = true;
        for(int v = 0; v < this.b.size(); ++v) {
            ((b)this.b.get(v)).m();
        }
    }

    public void g() {
        if(!this.a) {
            return;
        }
        this.a = false;
        for(int v = 0; v < this.b.size(); ++v) {
            ((b)this.b.get(v)).n();
        }
    }

    public boolean h(MotionEvent motionEvent0) {
        for(int v = 0; v < this.b.size(); ++v) {
            if(((b)this.b.get(v)).o(motionEvent0)) {
                return true;
            }
        }
        return false;
    }

    public void i(int v) {
        b b0 = (b)this.b.get(v);
        if(this.a) {
            b0.n();
        }
        this.b.remove(v);
    }

    public int j() {
        return this.b.size();
    }

    public boolean k(Drawable drawable0) {
        for(int v = 0; v < this.b.size(); ++v) {
            if(drawable0 == this.e(v).h()) {
                return true;
            }
        }
        return false;
    }
}

