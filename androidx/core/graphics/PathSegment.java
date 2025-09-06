package androidx.core.graphics;

import android.graphics.PointF;
import androidx.core.util.Preconditions;

public final class PathSegment {
    private final PointF a;
    private final float b;
    private final PointF c;
    private final float d;

    public PathSegment(PointF pointF0, float f, PointF pointF1, float f1) {
        this.a = (PointF)Preconditions.m(pointF0, "start == null");
        this.b = f;
        this.c = (PointF)Preconditions.m(pointF1, "end == null");
        this.d = f1;
    }

    public PointF a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public PointF c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PathSegment ? Float.compare(this.b, ((PathSegment)object0).b) == 0 && Float.compare(this.d, ((PathSegment)object0).d) == 0 && this.a.equals(((PathSegment)object0).a) && this.c.equals(((PathSegment)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == 0.0f ? 0 : Float.floatToIntBits(this.b);
        int v3 = this.c.hashCode();
        float f = this.d;
        if(f != 0.0f) {
            v1 = Float.floatToIntBits(f);
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return "PathSegment{start=" + this.a + ", startFraction=" + this.b + ", end=" + this.c + ", endFraction=" + this.d + '}';
    }
}

