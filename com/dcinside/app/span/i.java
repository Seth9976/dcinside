package com.dcinside.app.span;

import android.content.res.ColorStateList;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class i {
    private final int a;
    @m
    private final ColorStateList b;
    private final int c;
    private final int d;
    private final boolean e;

    public i(@DrawableRes int v, @m ColorStateList colorStateList0, int v1, int v2, boolean z) {
        this.a = v;
        this.b = colorStateList0;
        this.c = v1;
        this.d = v2;
        this.e = z;
    }

    public i(int v, ColorStateList colorStateList0, int v1, int v2, boolean z, int v3, w w0) {
        if((v3 & 2) != 0) {
            colorStateList0 = null;
        }
        this(v, colorStateList0, v1, ((v3 & 8) == 0 ? v2 : v1), ((v3 & 16) == 0 ? z : false));
    }

    public final int a() {
        return this.a;
    }

    @m
    public final ColorStateList b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(this.a != ((i)object0).a) {
            return false;
        }
        if(!L.g(this.b, ((i)object0).b)) {
            return false;
        }
        if(this.c != ((i)object0).c) {
            return false;
        }
        return this.d == ((i)object0).d ? this.e == ((i)object0).e : false;
    }

    @l
    public final i f(@DrawableRes int v, @m ColorStateList colorStateList0, int v1, int v2, boolean z) {
        return new i(v, colorStateList0, v1, v2, z);
    }

    public static i g(i i0, int v, ColorStateList colorStateList0, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = i0.a;
        }
        if((v3 & 2) != 0) {
            colorStateList0 = i0.b;
        }
        if((v3 & 4) != 0) {
            v1 = i0.c;
        }
        if((v3 & 8) != 0) {
            v2 = i0.d;
        }
        if((v3 & 16) != 0) {
            z = i0.e;
        }
        return i0.f(v, colorStateList0, v1, v2, z);
    }

    public final int h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = this.a * 0x1F;
        return this.b == null ? ((v * 0x1F + this.c) * 0x1F + this.d) * 0x1F + c.a(this.e) : (((v + this.b.hashCode()) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + c.a(this.e);
    }

    public final int i() {
        return this.a;
    }

    @m
    public final ColorStateList j() {
        return this.b;
    }

    public final int k() {
        return this.c;
    }

    public final boolean l() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "SpanIconOption(resId=" + this.a + ", tint=" + this.b + ", width=" + this.c + ", height=" + this.d + ", isCircular=" + this.e + ")";
    }
}

