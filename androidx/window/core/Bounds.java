package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class Bounds {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public Bounds(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public Bounds(@l Rect rect0) {
        L.p(rect0, "rect");
        this(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(Bounds.class, class0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        if(this.a != ((Bounds)object0).a) {
            return false;
        }
        if(this.b != ((Bounds)object0).b) {
            return false;
        }
        return this.c == ((Bounds)object0).c ? this.d == ((Bounds)object0).d : false;
    }

    public final int f() {
        return this.c - this.a;
    }

    public final boolean g() {
        return this.b() == 0 || this.f() == 0;
    }

    public final boolean h() {
        return this.b() == 0 && this.f() == 0;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @l
    public final Rect i() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    // 去混淆评级： 低(40)
    @Override
    @l
    public String toString() {
        return "Bounds { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }
}

