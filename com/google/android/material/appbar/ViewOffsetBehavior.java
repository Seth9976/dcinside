package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior extends Behavior {
    private i a;
    private int b;
    private int c;

    public ViewOffsetBehavior() {
        this.b = 0;
        this.c = 0;
    }

    public ViewOffsetBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = 0;
        this.c = 0;
    }

    public int N() {
        return this.a == null ? 0 : this.a.d();
    }

    public int O() {
        return this.a == null ? 0 : this.a.e();
    }

    public boolean P() {
        return this.a != null && this.a.f();
    }

    public boolean Q() {
        return this.a != null && this.a.g();
    }

    protected void R(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        coordinatorLayout0.N(view0, v);
    }

    public void S(boolean z) {
        i i0 = this.a;
        if(i0 != null) {
            i0.i(z);
        }
    }

    public boolean T(int v) {
        i i0 = this.a;
        if(i0 != null) {
            return i0.j(v);
        }
        this.c = v;
        return false;
    }

    public boolean U(int v) {
        i i0 = this.a;
        if(i0 != null) {
            return i0.k(v);
        }
        this.b = v;
        return false;
    }

    public void V(boolean z) {
        i i0 = this.a;
        if(i0 != null) {
            i0.l(z);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        this.R(coordinatorLayout0, view0, v);
        if(this.a == null) {
            this.a = new i(view0);
        }
        this.a.h();
        this.a.a();
        int v1 = this.b;
        if(v1 != 0) {
            this.a.k(v1);
            this.b = 0;
        }
        int v2 = this.c;
        if(v2 != 0) {
            this.a.j(v2);
            this.c = 0;
        }
        return true;
    }
}

