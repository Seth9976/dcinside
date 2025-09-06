package com.dcinside.app.internal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i {
    @l
    private final AppCompatActivity a;
    @l
    private final RecyclerView b;
    @l
    private final Adapter c;
    private final int d;

    public i(@l AppCompatActivity appCompatActivity0, @l RecyclerView recyclerView0, @l Adapter recyclerView$Adapter0, int v) {
        L.p(appCompatActivity0, "activity");
        L.p(recyclerView0, "rv");
        L.p(recyclerView$Adapter0, "adapter");
        super();
        this.a = appCompatActivity0;
        this.b = recyclerView0;
        this.c = recyclerView$Adapter0;
        this.d = v;
    }

    @l
    public final AppCompatActivity a() {
        return this.a;
    }

    @l
    public final RecyclerView b() {
        return this.b;
    }

    @l
    public final Adapter c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @l
    public final i e(@l AppCompatActivity appCompatActivity0, @l RecyclerView recyclerView0, @l Adapter recyclerView$Adapter0, int v) {
        L.p(appCompatActivity0, "activity");
        L.p(recyclerView0, "rv");
        L.p(recyclerView$Adapter0, "adapter");
        return new i(appCompatActivity0, recyclerView0, recyclerView$Adapter0, v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(!L.g(this.a, ((i)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((i)object0).b)) {
            return false;
        }
        return L.g(this.c, ((i)object0).c) ? this.d == ((i)object0).d : false;
    }

    public static i f(i i0, AppCompatActivity appCompatActivity0, RecyclerView recyclerView0, Adapter recyclerView$Adapter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            appCompatActivity0 = i0.a;
        }
        if((v1 & 2) != 0) {
            recyclerView0 = i0.b;
        }
        if((v1 & 4) != 0) {
            recyclerView$Adapter0 = i0.c;
        }
        if((v1 & 8) != 0) {
            v = i0.d;
        }
        return i0.e(appCompatActivity0, recyclerView0, recyclerView$Adapter0, v);
    }

    @l
    public final AppCompatActivity g() {
        return this.a;
    }

    @l
    public final Adapter h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d;
    }

    public final int i() {
        return this.d;
    }

    @l
    public final RecyclerView j() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "RecyclerViewHolderParents(activity=" + this.a + ", rv=" + this.b + ", adapter=" + this.c + ", position=" + this.d + ")";
    }
}

