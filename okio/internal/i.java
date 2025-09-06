package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.L;
import okio.o0;
import okio.y;
import y4.l;

public final class i extends y {
    private final long a;
    private final boolean b;
    private long c;

    public i(@l o0 o00, long v, boolean z) {
        L.p(o00, "delegate");
        super(o00);
        this.a = v;
        this.b = z;
    }

    private final void a(okio.l l0, long v) {
        okio.l l1 = new okio.l();
        l1.K2(l0);
        l0.write(l1, v);
        l1.c();
    }

    @Override  // okio.y
    public long read(@l okio.l l0, long v) {
        L.p(l0, "sink");
        long v1 = this.c;
        long v2 = this.a;
        if(v1 > v2) {
            v = 0L;
        }
        else if(this.b) {
            long v3 = v2 - v1;
            if(v3 == 0L) {
                return -1L;
            }
            v = Math.min(v, v3);
        }
        long v4 = super.read(l0, v);
        int v5 = Long.compare(v4, -1L);
        if(v5 != 0) {
            this.c += v4;
        }
        long v6 = this.c;
        long v7 = this.a;
        if(v6 < v7 && v5 == 0 || v6 > v7) {
            if(v4 > 0L && v6 > v7) {
                this.a(l0, l0.size() - (this.c - this.a));
            }
            throw new IOException("expected " + this.a + " bytes but got " + this.c);
        }
        return v4;
    }
}

