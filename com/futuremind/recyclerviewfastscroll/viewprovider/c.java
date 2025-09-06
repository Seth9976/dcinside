package com.futuremind.recyclerviewfastscroll.viewprovider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.futuremind.recyclerviewfastscroll.FastScroller;

public abstract class c {
    private FastScroller a;
    private d b;
    private d c;

    protected d a() {
        if(this.c == null) {
            this.c = this.j();
        }
        return this.c;
    }

    public abstract int b();

    protected Context c() {
        return this.a.getContext();
    }

    protected d d() {
        if(this.b == null) {
            this.b = this.m();
        }
        return this.b;
    }

    protected FastScroller e() {
        return this.a;
    }

    public void f() {
        if(this.d() != null) {
            this.d().a();
        }
        if(this.a() != null) {
            this.a().a();
        }
    }

    public void g() {
        if(this.d() != null) {
            this.d().c();
        }
        if(this.a() != null) {
            this.a().c();
        }
    }

    public void h() {
        if(this.d() != null) {
            this.d().b();
        }
        if(this.a() != null) {
            this.a().b();
        }
    }

    public void i() {
        if(this.d() != null) {
            this.d().d();
        }
        if(this.a() != null) {
            this.a().d();
        }
    }

    @Nullable
    protected abstract d j();

    public abstract TextView k();

    public abstract View l(ViewGroup arg1);

    @Nullable
    protected abstract d m();

    public abstract View n(ViewGroup arg1);

    public void o(FastScroller fastScroller0) {
        this.a = fastScroller0;
    }
}

