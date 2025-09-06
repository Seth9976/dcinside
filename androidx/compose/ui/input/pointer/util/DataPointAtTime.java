package androidx.compose.ui.input.pointer.util;

import y4.l;
import y4.m;

public final class DataPointAtTime {
    private long a;
    private float b;

    public DataPointAtTime(long v, float f) {
        this.a = v;
        this.b = f;
    }

    public final long a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    @l
    public final DataPointAtTime c(long v, float f) {
        return new DataPointAtTime(v, f);
    }

    public static DataPointAtTime d(DataPointAtTime dataPointAtTime0, long v, float f, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = dataPointAtTime0.a;
        }
        if((v1 & 2) != 0) {
            f = dataPointAtTime0.b;
        }
        return dataPointAtTime0.c(v, f);
    }

    public final float e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DataPointAtTime)) {
            return false;
        }
        return this.a == ((DataPointAtTime)object0).a ? Float.compare(this.b, ((DataPointAtTime)object0).b) == 0 : false;
    }

    public final long f() {
        return this.a;
    }

    public final void g(float f) {
        this.b = f;
    }

    public final void h(long v) {
        this.a = v;
    }

    @Override
    public int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + Float.floatToIntBits(this.b);
    }

    @Override
    @l
    public String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}

