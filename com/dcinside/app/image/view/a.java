package com.dcinside.app.image.view;

import y4.l;
import y4.m;

public final class a {
    private final float a;
    private final float b;

    public a(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    @l
    public final a c(float f, float f1) {
        return new a(f, f1);
    }

    public static a d(a a0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = a0.a;
        }
        if((v & 2) != 0) {
            f1 = a0.b;
        }
        return a0.c(f, f1);
    }

    public final float e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return Float.compare(this.a, ((a)object0).a) == 0 ? Float.compare(this.b, ((a)object0).b) == 0 : false;
    }

    public final float f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    @l
    public String toString() {
        return "BarEntry(x=" + this.a + ", y=" + this.b + ")";
    }
}

