package j$.util.stream;

import j..util.Spliterator;
import java.util.function.Supplier;

final class v0 implements N3 {
    final u0 a;
    final Supplier b;

    v0(d3 d30, u0 u00, Supplier supplier0) {
        this.a = u00;
        this.b = supplier0;
    }

    @Override  // j$.util.stream.N3
    public final Object b(b b0, Spliterator spliterator0) {
        t0 t00 = (t0)this.b.get();
        b0.W(spliterator0, t00);
        return Boolean.valueOf(t00.b);
    }

    @Override  // j$.util.stream.N3
    public final Object c(b b0, Spliterator spliterator0) {
        return (Boolean)new w0(this, b0, spliterator0).invoke();
    }

    @Override  // j$.util.stream.N3
    public final int d() {
        return c3.u | c3.r;
    }
}

