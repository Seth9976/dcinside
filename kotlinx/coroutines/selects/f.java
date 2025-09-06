package kotlinx.coroutines.selects;

import A3.p;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f implements e {
    @l
    private final Object a;
    @l
    private final p b;
    @m
    private final p c;
    @l
    private final p d;

    public f(@l Object object0, @l p p0, @m p p1) {
        this.a = object0;
        this.b = p0;
        this.c = p1;
        this.d = o.a;
    }

    public f(Object object0, p p0, p p1, int v, w w0) {
        if((v & 4) != 0) {
            p1 = null;
        }
        this(object0, p0, p1);
    }

    @Override  // kotlinx.coroutines.selects.k
    @m
    public p a() {
        return this.c;
    }

    @Override  // kotlinx.coroutines.selects.k
    @l
    public p b() {
        return this.d;
    }

    @Override  // kotlinx.coroutines.selects.k
    @l
    public p c() {
        return this.b;
    }

    @Override  // kotlinx.coroutines.selects.k
    @l
    public Object d() {
        return this.a;
    }
}

