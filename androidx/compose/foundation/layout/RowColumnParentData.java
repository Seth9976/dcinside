package androidx.compose.foundation.layout;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class RowColumnParentData {
    private float a;
    private boolean b;
    @m
    private CrossAxisAlignment c;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public RowColumnParentData(float f, boolean z, @m CrossAxisAlignment crossAxisAlignment0) {
        this.a = f;
        this.b = z;
        this.c = crossAxisAlignment0;
    }

    public RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment0, int v, w w0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            crossAxisAlignment0 = null;
        }
        this(f, z, crossAxisAlignment0);
    }

    public final float a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @m
    public final CrossAxisAlignment c() {
        return this.c;
    }

    @l
    public final RowColumnParentData d(float f, boolean z, @m CrossAxisAlignment crossAxisAlignment0) {
        return new RowColumnParentData(f, z, crossAxisAlignment0);
    }

    public static RowColumnParentData e(RowColumnParentData rowColumnParentData0, float f, boolean z, CrossAxisAlignment crossAxisAlignment0, int v, Object object0) {
        if((v & 1) != 0) {
            f = rowColumnParentData0.a;
        }
        if((v & 2) != 0) {
            z = rowColumnParentData0.b;
        }
        if((v & 4) != 0) {
            crossAxisAlignment0 = rowColumnParentData0.c;
        }
        return rowColumnParentData0.d(f, z, crossAxisAlignment0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RowColumnParentData)) {
            return false;
        }
        if(Float.compare(this.a, ((RowColumnParentData)object0).a) != 0) {
            return false;
        }
        return this.b == ((RowColumnParentData)object0).b ? L.g(this.c, ((RowColumnParentData)object0).c) : false;
    }

    @m
    public final CrossAxisAlignment f() {
        return this.c;
    }

    public final boolean g() {
        return this.b;
    }

    public final float h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = Float.floatToIntBits(this.a);
        int v1 = this.b;
        if(v1) {
            v1 = 1;
        }
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    public final void i(@m CrossAxisAlignment crossAxisAlignment0) {
        this.c = crossAxisAlignment0;
    }

    public final void j(boolean z) {
        this.b = z;
    }

    public final void k(float f) {
        this.a = f;
    }

    @Override
    @l
    public String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ')';
    }
}

