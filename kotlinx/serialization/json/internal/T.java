package kotlinx.serialization.json.internal;

import kotlin.N0;
import kotlin.jvm.internal.L;
import kotlin.z0;
import y4.l;

@k0
public final class t extends m {
    private final boolean c;

    public t(@l Y y0, boolean z) {
        L.p(y0, "writer");
        super(y0);
        this.c = z;
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void d(byte b) {
        String s = z0.e0(b);
        if(this.c) {
            this.m(s);
            return;
        }
        this.j(s);
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void h(int v) {
        if(this.c) {
            this.m(p.a(v));
            return;
        }
        this.j(q.a(v));
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void i(long v) {
        if(this.c) {
            this.m(n.a(v));
            return;
        }
        this.j(o.a(v));
    }

    @Override  // kotlinx.serialization.json.internal.m
    public void k(short v) {
        String s = N0.e0(v);
        if(this.c) {
            this.m(s);
            return;
        }
        this.j(s);
    }
}

