package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;

@s0({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n4492#2,5:289\n4492#2,5:294\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:289,5\n286#1:294,5\n*E\n"})
public final class OffsetApplier implements Applier {
    @l
    private final Applier a;
    private final int b;
    private int c;

    public OffsetApplier(@l Applier applier0, int v) {
        L.p(applier0, "applier");
        super();
        this.a = applier0;
        this.b = v;
    }

    @Override  // androidx.compose.runtime.Applier
    public Object a() {
        return this.a.a();
    }

    @Override  // androidx.compose.runtime.Applier
    public void b(int v, int v1) {
        this.a.b(v + (this.c == 0 ? this.b : 0), v1);
    }

    @Override  // androidx.compose.runtime.Applier
    public void c() {
    }

    @Override  // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.A("Clear is not valid on OffsetApplier");
        throw new y();
    }

    @Override  // androidx.compose.runtime.Applier
    public void d() {
    }

    @Override  // androidx.compose.runtime.Applier
    public void e(int v, int v1, int v2) {
        int v3 = this.c == 0 ? this.b : 0;
        this.a.e(v + v3, v1 + v3, v2);
    }

    @Override  // androidx.compose.runtime.Applier
    public void f(int v, Object object0) {
        this.a.f(v + (this.c == 0 ? this.b : 0), object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void g(int v, Object object0) {
        this.a.g(v + (this.c == 0 ? this.b : 0), object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void h(Object object0) {
        ++this.c;
        this.a.h(object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void i() {
        int v = this.c;
        if(v > 0) {
            this.c = v - 1;
            this.a.i();
            return;
        }
        ComposerKt.A("OffsetApplier up called with no corresponding down");
        throw new y();
    }
}

