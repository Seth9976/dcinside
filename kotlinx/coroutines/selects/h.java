package kotlinx.coroutines.selects;

import A3.p;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class h implements g {
    @l
    private final Object a;
    @l
    private final p b;
    @l
    private final p c;
    @m
    private final p d;

    public h(@l Object object0, @l p p0, @l p p1, @m p p2) {
        this.a = object0;
        this.b = p0;
        this.c = p1;
        this.d = p2;
    }

    public h(Object object0, p p0, p p1, p p2, int v, w w0) {
        if((v & 8) != 0) {
            p2 = null;
        }
        this(object0, p0, p1, p2);
    }

    @Override  // kotlinx.coroutines.selects.k
    @m
    public p a() {
        return this.d;
    }

    @Override  // kotlinx.coroutines.selects.k
    @l
    public p b() {
        return this.c;
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

