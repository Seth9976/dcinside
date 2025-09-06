package j$.time.format;

import j..time.chrono.l;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class o implements Consumer {
    public final p a;
    public final w b;
    public final long c;
    public final int d;
    public final int e;

    public o(p p0, w w0, long v, int v1, int v2) {
        this.a = p0;
        this.b = w0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @Override
    public final void accept(Object object0) {
        l l0 = (l)object0;
        this.a.d(this.b, this.c, this.d, this.e);
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

