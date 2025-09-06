package j$.util.stream;

import j..util.Collection.-EL;
import j..util.List.-EL;
import j..util.Objects;
import java.util.ArrayList;

final class J2 extends B2 {
    private ArrayList d;

    @Override
    public final void accept(Object object0) {
        this.d.add(object0);
    }

    @Override  // j$.util.stream.j2
    public final void k() {
        List.-EL.sort(this.d, this.b);
        n2 n20 = this.a;
        n20.l(((long)this.d.size()));
        if(this.c) {
            for(Object object0: this.d) {
                if(n20.n()) {
                    break;
                }
                n20.accept(object0);
            }
        }
        else {
            ArrayList arrayList0 = this.d;
            Objects.requireNonNull(n20);
            Collection.-EL.a(arrayList0, new a(4, n20));
        }
        n20.k();
        this.d = null;
    }

    @Override  // j$.util.stream.j2
    public final void l(long v) {
        if(v >= 0x7FFFFFF7L) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = Long.compare(v, 0L) < 0 ? new ArrayList() : new ArrayList(((int)v));
    }
}

