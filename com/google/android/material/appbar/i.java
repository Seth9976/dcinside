package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

class i {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public i(View view0) {
        this.f = true;
        this.g = true;
        this.a = view0;
    }

    void a() {
        int v = this.d;
        int v1 = this.a.getTop();
        ViewCompat.l1(this.a, v - (v1 - this.b));
        int v2 = this.e;
        int v3 = this.a.getLeft();
        ViewCompat.k1(this.a, v2 - (v3 - this.c));
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.f;
    }

    void h() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public void i(boolean z) {
        this.g = z;
    }

    public boolean j(int v) {
        if(this.g && this.e != v) {
            this.e = v;
            this.a();
            return true;
        }
        return false;
    }

    public boolean k(int v) {
        if(this.f && this.d != v) {
            this.d = v;
            this.a();
            return true;
        }
        return false;
    }

    public void l(boolean z) {
        this.f = z;
    }
}

