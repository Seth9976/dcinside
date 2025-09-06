package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class PointerInputEventData {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final boolean e;
    private final float f;
    private final int g;
    private final boolean h;
    @l
    private final List i;
    private final long j;

    private PointerInputEventData(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = z;
        this.f = f;
        this.g = v4;
        this.h = z1;
        this.i = list0;
        this.j = v5;
    }

    public PointerInputEventData(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5, int v6, w w0) {
        List list1 = (v6 & 0x100) == 0 ? list0 : new ArrayList();
        this(v, v1, v2, v3, z, f, v4, ((v6 & 0x80) == 0 ? z1 : false), list1, ((v6 & 0x200) == 0 ? v5 : 0L), null);
    }

    public PointerInputEventData(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5, w w0) {
        this(v, v1, v2, v3, z, f, v4, z1, list0, v5);
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.j;
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final long e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PointerInputEventData)) {
            return false;
        }
        if(!PointerId.d(this.a, ((PointerInputEventData)object0).a)) {
            return false;
        }
        if(this.b != ((PointerInputEventData)object0).b) {
            return false;
        }
        if(!Offset.l(this.c, ((PointerInputEventData)object0).c)) {
            return false;
        }
        if(!Offset.l(this.d, ((PointerInputEventData)object0).d)) {
            return false;
        }
        if(this.e != ((PointerInputEventData)object0).e) {
            return false;
        }
        if(Float.compare(this.f, ((PointerInputEventData)object0).f) != 0) {
            return false;
        }
        if(!PointerType.i(this.g, ((PointerInputEventData)object0).g)) {
            return false;
        }
        if(this.h != ((PointerInputEventData)object0).h) {
            return false;
        }
        return L.g(this.i, ((PointerInputEventData)object0).i) ? Offset.l(this.j, ((PointerInputEventData)object0).j) : false;
    }

    public final boolean f() {
        return this.e;
    }

    public final float g() {
        return this.f;
    }

    public final int h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = PointerId.f(this.a);
        int v1 = (int)(this.b ^ this.b >>> 0x20);
        int v2 = Offset.s(this.c);
        int v3 = Offset.s(this.d);
        int v4 = this.e;
        int v5 = 1;
        if(v4) {
            v4 = 1;
        }
        int v6 = Float.floatToIntBits(this.f);
        int v7 = this.g;
        if(!this.h) {
            v5 = false;
        }
        return ((((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v6) * 0x1F + v7) * 0x1F + v5) * 0x1F + this.i.hashCode()) * 0x1F + Offset.s(this.j);
    }

    public final boolean i() {
        return this.h;
    }

    @l
    public final List j() {
        return this.i;
    }

    @l
    public final PointerInputEventData k(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, @l List list0, long v5) {
        L.p(list0, "historical");
        return new PointerInputEventData(v, v1, v2, v3, z, f, v4, z1, list0, v5, null);
    }

    public static PointerInputEventData l(PointerInputEventData pointerInputEventData0, long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5, int v6, Object object0) {
        long v7 = (v6 & 1) == 0 ? v : pointerInputEventData0.a;
        long v8 = (v6 & 2) == 0 ? v1 : pointerInputEventData0.b;
        long v9 = (v6 & 4) == 0 ? v2 : pointerInputEventData0.c;
        long v10 = (v6 & 8) == 0 ? v3 : pointerInputEventData0.d;
        boolean z2 = (v6 & 16) == 0 ? z : pointerInputEventData0.e;
        float f1 = (v6 & 0x20) == 0 ? f : pointerInputEventData0.f;
        int v11 = (v6 & 0x40) == 0 ? v4 : pointerInputEventData0.g;
        boolean z3 = (v6 & 0x80) == 0 ? z1 : pointerInputEventData0.h;
        List list1 = (v6 & 0x100) == 0 ? list0 : pointerInputEventData0.i;
        return (v6 & 0x200) == 0 ? pointerInputEventData0.k(v7, v8, v9, v10, z2, f1, v11, z3, list1, v5) : pointerInputEventData0.k(v7, v8, v9, v10, z2, f1, v11, z3, list1, pointerInputEventData0.j);
    }

    public final boolean m() {
        return this.e;
    }

    @l
    public final List n() {
        return this.i;
    }

    public final long o() {
        return this.a;
    }

    public final boolean p() {
        return this.h;
    }

    public final long q() {
        return this.d;
    }

    public final long r() {
        return this.c;
    }

    public final float s() {
        return this.f;
    }

    public final long t() {
        return this.j;
    }

    @Override
    @l
    public String toString() {
        return "PointerInputEventData(id=" + PointerId.g(this.a) + ", uptime=" + this.b + ", positionOnScreen=" + Offset.y(this.c) + ", position=" + Offset.y(this.d) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + PointerType.k(this.g) + ", issuesEnterExit=" + this.h + ", historical=" + this.i + ", scrollDelta=" + Offset.y(this.j) + ')';
    }

    public final int u() {
        return this.g;
    }

    public final long v() {
        return this.b;
    }
}

