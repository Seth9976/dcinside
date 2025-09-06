package androidx.compose.ui.graphics.vector;

import B3.a;
import androidx.compose.runtime.Immutable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class VectorGroup extends VectorNode implements a, Iterable {
    @l
    private final String b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    @l
    private final List j;
    @l
    private final List k;
    public static final int l;

    static {
    }

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
    }

    public VectorGroup(@l String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @l List list0, @l List list1) {
        L.p(s, "name");
        L.p(list0, "clipPathData");
        L.p(list1, "children");
        super(null);
        this.b = s;
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = list0;
        this.k = list1;
    }

    public VectorGroup(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1, int v, w w0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), ((v & 0x100) == 0 ? list0 : VectorKt.h()), ((v & 0x200) == 0 ? list1 : u.H()));
    }

    @l
    public final VectorNode b(int v) {
        return (VectorNode)this.k.get(v);
    }

    @l
    public final List c() {
        return this.j;
    }

    @l
    public final String d() [...] // 潜在的解密器

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof VectorGroup) || !L.g(this.b, ((VectorGroup)object0).b)) {
            return false;
        }
        return this.c == ((VectorGroup)object0).c && this.d == ((VectorGroup)object0).d && this.e == ((VectorGroup)object0).e && this.f == ((VectorGroup)object0).f && this.g == ((VectorGroup)object0).g && this.h == ((VectorGroup)object0).h && this.i == ((VectorGroup)object0).i && L.g(this.j, ((VectorGroup)object0).j) ? L.g(this.k, ((VectorGroup)object0).k) : false;
    }

    public final float g() {
        return this.d;
    }

    public final float h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return ((((((((this.b.hashCode() * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + Float.floatToIntBits(this.g)) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + Float.floatToIntBits(this.i)) * 0x1F + this.j.hashCode()) * 0x1F + this.k.hashCode();
    }

    public final float i() {
        return this.c;
    }

    @Override
    @l
    public Iterator iterator() {
        return new Object() {
            @l
            private final Iterator a;

            {
                this.a = vectorGroup0.k.iterator();
            }

            @l
            public final Iterator a() {
                return this.a;
            }

            @l
            public VectorNode b() {
                return this.a.next();
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.b();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    public final float j() {
        return this.f;
    }

    public final float k() {
        return this.g;
    }

    public final int l() {
        return this.k.size();
    }

    public final float m() {
        return this.h;
    }

    public final float o() {
        return this.i;
    }
}

